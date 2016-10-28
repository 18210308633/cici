package com.SomeLanguage;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by rensong.pu on 2016/10/28.
 */
public interface ILangParser {
    SomeClass parse(ParseTree parseTree);
}
