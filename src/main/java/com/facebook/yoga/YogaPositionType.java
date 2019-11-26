package com.facebook.yoga;

public enum YogaPositionType {
    RELATIVE(0),
    ABSOLUTE(1);
    
    public final int c;

    private YogaPositionType(int i) {
        this.c = i;
    }
}
