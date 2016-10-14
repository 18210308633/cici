package sqlBase.sqlDesign;

import com.sun.deploy.util.StringUtils;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import sqlBase.gen.SqlBaseListener;
import sqlBase.gen.SqlLexer;
import sqlBase.gen.SqlParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jian.sun on 2016/6/15.
 */
public class AntlrHelper {
    public static <T extends RuleContext> T up(RuleContext curr, Class<T> target) {
        while (curr != null) {
            curr = curr.getParent();
            if (target.isInstance(curr)) {
                return (T) curr;
            }
        }
        return null;
    }

    public static <T extends RuleContext> T down(RuleContext curr, Class<T> target) {
        List<T> arr = downs(curr, target);
        if (arr.size() > 0) {
            return arr.get(0);
        } else {
            return null;
        }
    }

    public static <T extends RuleContext> List<T> downs(RuleContext curr, Class<T> target) {
        List<T> children = new ArrayList();
        if (curr != null) {
            if (target.isInstance(curr)) {
                children.add((T) curr);
            } else {
                for (int i = 0; i < curr.getChildCount(); i++) {
                    ParseTree c = curr.getChild(i);
                    if (c instanceof RuleContext) {
                        children.addAll(downs((RuleContext) c, target));
                    }
                }
            }
        }
        return children;
    }

    public static <T extends RuleContext> List<T> downs(RuleContext curr, Class<T> include, Class exclude) {
        List<T> children = new ArrayList();
        if (curr != null) {
            if (!exclude.isInstance(curr) && include.isInstance(curr)) {
                children.add((T) curr);
            } else {
                for (int i = 0; i < curr.getChildCount(); i++) {
                    ParseTree c = curr.getChild(i);
                    if (c instanceof RuleContext) {
                        children.addAll(downs((RuleContext) c, include, exclude));
                    }
                }
            }
        }
        return children;
    }

    public static SqlParser getParser(String txt) {
        ANTLRInputStream input = new ANTLRInputStream(txt);
        return new SqlParser(new CommonTokenStream(new SqlLexer(input)));
    }


    public static String toSql(ParseTree tree) {
        ParseTreeListener listener = new WriteBackSqlListener();
        new ParseTreeWalker().walk(listener, tree);
        return listener.toString();
    }

    public static boolean replace(ParserRuleContext origin, ParserRuleContext replace) {
        if (origin == null) {
            return false;
        }
        ParserRuleContext parent = origin.getParent();
        if (parent != null) {//父加子 子加父
            int index = parent.children.indexOf(origin);
            if (index != -1) {
                parent.children.set(index, replace);
            }
            replace.parent = parent;
            origin.parent = null;
        }
        return true;
    }
}

class WriteBackSqlListener extends SqlBaseListener {
    private List<String> arr = new ArrayList();

    @Override
    public void visitTerminal(TerminalNode var1) {
        arr.add(var1.getText());
    }

    @Override
    public String toString() {
        return StringUtils.join(arr, " ");
    }
}
