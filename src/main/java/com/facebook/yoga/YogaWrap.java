package com.facebook.yoga;

public enum YogaWrap {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);
    
    public final int d;

    private YogaWrap(int i) {
        this.d = i;
    }
}
