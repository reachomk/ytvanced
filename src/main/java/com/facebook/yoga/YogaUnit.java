package com.facebook.yoga;

public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    public final int d;

    private YogaUnit(int i) {
        this.d = i;
    }

    public static YogaUnit a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return POINT;
        }
        if (i == 2) {
            return PERCENT;
        }
        if (i == 3) {
            return AUTO;
        }
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("Unknown enum value: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
