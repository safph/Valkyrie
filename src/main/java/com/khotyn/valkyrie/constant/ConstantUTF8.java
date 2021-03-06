package com.khotyn.valkyrie.constant;

import java.util.List;

/**
 * User: apple Date: 11-11-18 Time: AM11:34 Dust to dust, earth to earth.
 */
public class ConstantUTF8 extends ConstantPoolInfo {

    public int     tag = CONSTANT_UTF8;

    private String content;

    public ConstantUTF8(String content){
        super(null);
        this.content = content;
    }

    public ConstantUTF8(List<ConstantPoolInfo> constantPool){
        super(constantPool);
    }

    public String toString() {
        return "Asciz\t" + content + ";";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ConstantUTF8 other = (ConstantUTF8) obj;
        if (content == null) {
            if (other.content != null) return false;
        } else if (!content.equals(other.content)) return false;
        return true;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getString() {
        return content;
    }
}
