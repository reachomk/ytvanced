package com.facebook.yoga;

public enum YogaJustify {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);
    
    public final int f;

    private YogaJustify(int i) {
        this.f = i;
    }
}
