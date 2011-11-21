package com.khotyn.valkyrie.constant;

import com.khotyn.valkyrie.ConstantPoolInfo;

/**
 * User: apple
 * Date: 11-11-21
 * Time: PM5:40
 * Dust to dust, earth to earth.
 */
public class ConstantLong extends ConstantPoolInfo {
    public int tag = CONSTANT_LONG;

    public long value;

    public String toString() {
        return "Constant Long{value: " + value + "}";
    }
}
