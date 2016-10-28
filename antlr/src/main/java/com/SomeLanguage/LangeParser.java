package com.SomeLanguage;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import someLanguage.gen.SomeLanguageBaseListener;
import someLanguage.gen.SomeLanguageParser;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by rensong.pu on 2016/10/28.
 */
public class LangeParser implements ILangParser {

    public SomeClass parse(ParseTree parseTree) {
        ClassListener classListener = new ClassListener();
        new ParseTreeWalker().walk(classListener,parseTree);
        SomeClass someClass = classListener.getSomeClass();
        return someClass;
    }

    class ClassListener extends SomeLanguageBaseListener {
        SomeClass someClass;
        @Override
        public void enterClassDeclaration(SomeLanguageParser.ClassDeclarationContext ctx) {
            SomeLanguageParser.ClassNameContext classNameContext = ctx.className();
            final MethodListener methodListener = new MethodListener();
            ctx.method().forEach(method->{
                                    method.enterRule(methodListener);
                                 });
            someClass = new SomeClass(classNameContext.getText(),methodListener.getMethod());
        }

        public SomeClass getSomeClass() {
            return someClass;
        }
    }

    class MethodListener extends SomeLanguageBaseListener{
        Collection<Method> method;

        public MethodListener() {
            method = new ArrayList<>();
        }

        @Override
        public void enterMethod(SomeLanguageParser.MethodContext ctx) {
            String methodName = ctx.methodName().getText();
            InstructionListener instructionListener = new InstructionListener();
            ctx.instruction().forEach(instructionContext -> {
                                         instructionContext.enterRule(instructionListener);
                                      });
            method.add(new Method(methodName,instructionListener.getInstruction()));
        }
        public Collection<Method> getMethod() {
            return method;
        }
    }

    class InstructionListener extends SomeLanguageBaseListener{
        Collection<Instruction> instruction;

        public InstructionListener() {
            instruction = new ArrayList<>();
        }

        @Override
        public void enterInstruction(SomeLanguageParser.InstructionContext ctx) {
            String instructionName = ctx.getText();
            instruction.add(new Instruction(instructionName));
        }

        public Collection<Instruction> getInstruction() {
            return instruction;
        }
    }
}
