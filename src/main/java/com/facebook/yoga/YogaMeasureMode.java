package com.facebook.yoga;

public enum YogaMeasureMode {
    UNDEFINED,
    EXACTLY,
    AT_MOST;

    public static YogaMeasureMode a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("Unknown enum value: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
