package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anxv;
import defpackage.anxx;
import defpackage.anxy;
import defpackage.anzf;
import defpackage.anzq;

public final class CardboardDevice$VignetteParams extends anxl implements anzf {
    public static final int CONDITION_FIELD_NUMBER = 2;
    public static final CardboardDevice$VignetteParams DEFAULT_INSTANCE;
    public static volatile anzq PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    public int bitField0_;
    public int condition_;
    public float value_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(CardboardDevice$VignetteParams.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    public enum VignetteParamsCondition implements anxv {
        NO_VIGNETTE_CONDITION(0),
        HORIZ_DIMEN_LESS_THAN_METER(1);
        
        public static final int HORIZ_DIMEN_LESS_THAN_METER_VALUE = 1;
        public static final int NO_VIGNETTE_CONDITION_VALUE = 0;
        public static final anxy internalValueMap = null;
        public final int value;

        final class VignetteParamsConditionVerifier implements anxx {
            public static final anxx INSTANCE = null;

            private VignetteParamsConditionVerifier() {
            }

            public final boolean isInRange(int i) {
                return VignetteParamsCondition.forNumber(i) != null;
            }

            static {
                INSTANCE = new VignetteParamsConditionVerifier();
            }
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }

        public final int getNumber() {
            return this.value;
        }

        public static VignetteParamsCondition forNumber(int i) {
            if (i != 0) {
                return i != 1 ? null : HORIZ_DIMEN_LESS_THAN_METER;
            } else {
                return NO_VIGNETTE_CONDITION;
            }
        }

        public static anxx internalGetVerifier() {
            return VignetteParamsConditionVerifier.INSTANCE;
        }

        private VignetteParamsCondition(int i) {
            this.value = i;
        }

        static {
            internalValueMap = new anxy() {
                public VignetteParamsCondition findValueByNumber(int i) {
                    return VignetteParamsCondition.forNumber(i);
                }
            };
        }
    }

    private CardboardDevice$VignetteParams() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0000\u0003\u0001\u0001", new Object[]{"bitField0_", "condition_", VignetteParamsCondition.internalGetVerifier(), "value_"});
            case 3:
                return new CardboardDevice$VignetteParams();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CardboardDevice$VignetteParams.class) {
                        obj3 = PARSER;
                        if (obj3 == null) {
                            obj3 = new anxn(DEFAULT_INSTANCE);
                            PARSER = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        CardboardDevice$VignetteParams cardboardDevice$VignetteParams = new CardboardDevice$VignetteParams();
        DEFAULT_INSTANCE = cardboardDevice$VignetteParams;
        anxl.registerDefaultInstance(CardboardDevice$VignetteParams.class, cardboardDevice$VignetteParams);
    }
}
