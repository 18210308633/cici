package demo;

import antlr.ANTLRLexer;
import demo.gen.ArraryInitBaseListener;
import demo.gen.ArraryInitLexer;
import demo.gen.ArraryInitParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by rensong.pu on 2016/10/11.
 */
public class Main {
    static class ShortToUnicodeString extends ArraryInitBaseListener {
        @Override
        public void enterInit(ArraryInitParser.InitContext ctx) {
            System.out.println('"');
        }

        @Override
        public void exitInit(ArraryInitParser.InitContext ctx) {
            System.out.println('"');
        }

        @Override
        public void enterValue(ArraryInitParser.ValueContext ctx) {
            if (ctx.INT() == null) {
                System.out.println(ctx.INT());
            } else {
//                System.out.printf("\\u%04x", Integer.valueOf(ctx.INT().getText()));
                System.out.println(ctx.INT().getText());
            }
        }
    }

    public static void main(String[] args) {
        String sentence = "{1,2,3}";
//词法分析
        ArraryInitLexer lexer = new ArraryInitLexer(new ANTLRInputStream(sentence));
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);

//语法分析
        ArraryInitParser parser = new ArraryInitParser(tokens);
        ParseTree tree = parser.init();

//基于语法分析树的应用
        ParseTreeWalker walker = new ParseTreeWalker();
        System.out.println(parser.getErrorHandler().inErrorRecoveryMode(parser));
        walker.walk(new ShortToUnicodeString(), tree);
        System.out.println();
    }
}
