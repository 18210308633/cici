package com.SomeLanguage;

import java.util.Collection;

/**
 * Created by rensong.pu on 2016/10/28.
 */
public class Method {
    private String methodName;
    private String[] parameters;
    private Collection<Instruction> instructions;

    public Method(String methodName, String[] parameters, Collection<Instruction> instructions) {
        this.methodName = methodName;
        this.parameters = parameters;
        this.instructions = instructions;
    }
}
