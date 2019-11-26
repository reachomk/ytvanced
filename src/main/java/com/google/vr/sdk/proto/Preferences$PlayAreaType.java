package com.google.vr.sdk.proto;

import defpackage.anxv;
import defpackage.anxx;
import defpackage.anxy;

public enum Preferences$PlayAreaType implements anxv {
    GVR_PLAY_AREA_TYPE_NOT_SET(0),
    GVR_PLAY_AREA_TYPE_RADIAL(1);
    
    public static final int GVR_PLAY_AREA_TYPE_NOT_SET_VALUE = 0;
    public static final int GVR_PLAY_AREA_TYPE_RADIAL_VALUE = 1;
    public static final anxy internalValueMap = null;
    public final int value;

    final class PlayAreaTypeVerifier implements anxx {
        public static final anxx INSTANCE = null;

        private PlayAreaTypeVerifier() {
        }

        public final boolean isInRange(int i) {
            return Preferences$PlayAreaType.forNumber(i) != null;
        }

        static {
            INSTANCE = new PlayAreaTypeVerifier();
        }
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }

    public final int getNumber() {
        return this.value;
    }

    public static Preferences$PlayAreaType forNumber(int i) {
        if (i != 0) {
            return i != 1 ? null : GVR_PLAY_AREA_TYPE_RADIAL;
        } else {
            return GVR_PLAY_AREA_TYPE_NOT_SET;
        }
    }

    public static anxx internalGetVerifier() {
        return PlayAreaTypeVerifier.INSTANCE;
    }

    private Preferences$PlayAreaType(int i) {
        this.value = i;
    }

    static {
        internalValueMap = new anxy() {
            public Preferences$PlayAreaType findValueByNumber(int i) {
                return Preferences$PlayAreaType.forNumber(i);
            }
        };
    }
}
