package com.google.vr.sdk.proto;

import defpackage.anxv;
import defpackage.anxy;

public enum CardboardDevice$DeviceParams$VerticalAlignmentType implements anxv {
    BOTTOM(0),
    CENTER(1),
    TOP(2);
    
    public static final int BOTTOM_VALUE = 0;
    public static final int CENTER_VALUE = 1;
    public static final int TOP_VALUE = 2;
    public static final anxy internalValueMap = null;
    public final int value;

    public final String toString() {
        return Integer.toString(getNumber());
    }

    public final int getNumber() {
        return this.value;
    }

    public static CardboardDevice$DeviceParams$VerticalAlignmentType forNumber(int i) {
        if (i == 0) {
            return BOTTOM;
        }
        if (i != 1) {
            return i != 2 ? null : TOP;
        } else {
            return CENTER;
        }
    }

    private CardboardDevice$DeviceParams$VerticalAlignmentType(int i) {
        this.value = i;
    }

    static {
        internalValueMap = new anxy() {
            public CardboardDevice$DeviceParams$VerticalAlignmentType findValueByNumber(int i) {
                return CardboardDevice$DeviceParams$VerticalAlignmentType.forNumber(i);
            }
        };
    }
}
