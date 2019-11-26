package com.google.vr.sdk.proto;

import defpackage.anxv;
import defpackage.anxy;

public enum CardboardDevice$DeviceParams$ButtonType implements anxv {
    NONE(0),
    MAGNET(1),
    TOUCH(2),
    INDIRECT_TOUCH(3);
    
    public static final int INDIRECT_TOUCH_VALUE = 3;
    public static final int MAGNET_VALUE = 1;
    public static final int NONE_VALUE = 0;
    public static final int TOUCH_VALUE = 2;
    public static final anxy internalValueMap = null;
    public final int value;

    public final String toString() {
        return Integer.toString(getNumber());
    }

    public final int getNumber() {
        return this.value;
    }

    public static CardboardDevice$DeviceParams$ButtonType forNumber(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return MAGNET;
        }
        if (i != 2) {
            return i != 3 ? null : INDIRECT_TOUCH;
        } else {
            return TOUCH;
        }
    }

    private CardboardDevice$DeviceParams$ButtonType(int i) {
        this.value = i;
    }

    static {
        internalValueMap = new anxy() {
            public CardboardDevice$DeviceParams$ButtonType findValueByNumber(int i) {
                return CardboardDevice$DeviceParams$ButtonType.forNumber(i);
            }
        };
    }
}
