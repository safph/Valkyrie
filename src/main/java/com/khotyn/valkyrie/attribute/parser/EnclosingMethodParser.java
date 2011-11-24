/**
 * Project: Valkyrie
 * 
 * File Created at Nov 24, 2011
 * $Id$
 * 
 * This is some code written by khotyn, and you are free to distribute those code for any use.
 * Welcome to my website: http://khotyn.com
 * Free we will be!
 */
package com.khotyn.valkyrie.attribute.parser;

import com.khotyn.valkyrie.Clazz;
import com.khotyn.valkyrie.attribute.Attribute;
import com.khotyn.valkyrie.attribute.EnclosingMethod;

/**
 * Parser to parse {@link EnclosingMethod}
 * 
 * @author khotyn
 * 
 */
public class EnclosingMethodParser extends AttributeParser {

    /**
     * @param clazz
     */
    public EnclosingMethodParser(Clazz clazz) {
        super(clazz);
    }

    /*
     * (non-Javadoc)
     * @see com.khotyn.valkyrie.attribute.parser.AttributeParser#parse(java.lang.String)
     */
    @Override
    public Attribute parse(String str) {
        EnclosingMethod result = new EnclosingMethod();
        int cursor = 0;
        result.setClassIndex(Integer.parseInt(str.substring(cursor, cursor += Clazz.U2), 16));
        result.setMethodIndex(Integer.parseInt(str.substring(cursor, cursor += Clazz.U2), 16));
        return result;
    }

}
