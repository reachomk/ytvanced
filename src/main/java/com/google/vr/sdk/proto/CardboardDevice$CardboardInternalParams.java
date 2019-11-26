package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anxv;
import defpackage.anxx;
import defpackage.anxy;
import defpackage.anxz;
import defpackage.anyb;
import defpackage.anzf;
import defpackage.anzq;

public final class CardboardDevice$CardboardInternalParams extends anxl implements anzf {
    public static final int ACCELEROMETER_FIELD_NUMBER = 5;
    public static final CardboardDevice$CardboardInternalParams DEFAULT_INSTANCE;
    public static final int EYE_ORIENTATIONS_FIELD_NUMBER = 1;
    public static final int GYROSCOPE_FIELD_NUMBER = 6;
    public static volatile anzq PARSER = null;
    public static final int SCREEN_CENTER_TO_LENS_DISTANCE_FIELD_NUMBER = 2;
    public static final int X_PPI_OVERRIDE_FIELD_NUMBER = 3;
    public static final int Y_PPI_OVERRIDE_FIELD_NUMBER = 4;
    public static final anyb eyeOrientations_converter_ = new anyb() {
        public OrientationType convert(Integer num) {
            OrientationType forNumber = OrientationType.forNumber(num.intValue());
            return forNumber == null ? OrientationType.CCW_0_DEGREES : forNumber;
        }
    };
    public String accelerometer_;
    public int bitField0_;
    public int eyeOrientationsMemoizedSerializedSize;
    public anxz eyeOrientations_ = anxl.emptyIntList();
    public String gyroscope_;
    public float screenCenterToLensDistance_;
    public float xPpiOverride_;
    public float yPpiOverride_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(CardboardDevice$CardboardInternalParams.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    public enum OrientationType implements anxv {
        CCW_0_DEGREES(0),
        CCW_90_DEGREES(1),
        CCW_180_DEGREES(2),
        CCW_270_DEGREES(3),
        CCW_0_DEGREES_MIRRORED(4),
        CCW_90_DEGREES_MIRRORED(5),
        CCW_180_DEGREES_MIRRORED(6),
        CCW_270_DEGREES_MIRRORED(7);
        
        public static final int CCW_0_DEGREES_MIRRORED_VALUE = 4;
        public static final int CCW_0_DEGREES_VALUE = 0;
        public static final int CCW_180_DEGREES_MIRRORED_VALUE = 6;
        public static final int CCW_180_DEGREES_VALUE = 2;
        public static final int CCW_270_DEGREES_MIRRORED_VALUE = 7;
        public static final int CCW_270_DEGREES_VALUE = 3;
        public static final int CCW_90_DEGREES_MIRRORED_VALUE = 5;
        public static final int CCW_90_DEGREES_VALUE = 1;
        public static final anxy internalValueMap = null;
        public final int value;

        final class OrientationTypeVerifier implements anxx {
            public static final anxx INSTANCE = null;

            private OrientationTypeVerifier() {
            }

            public final boolean isInRange(int i) {
                return OrientationType.forNumber(i) != null;
            }

            static {
                INSTANCE = new OrientationTypeVerifier();
            }
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }

        public final int getNumber() {
            return this.value;
        }

        public static OrientationType forNumber(int i) {
            switch (i) {
                case 0:
                    return CCW_0_DEGREES;
                case 1:
                    return CCW_90_DEGREES;
                case 2:
                    return CCW_180_DEGREES;
                case 3:
                    return CCW_270_DEGREES;
                case 4:
                    return CCW_0_DEGREES_MIRRORED;
                case 5:
                    return CCW_90_DEGREES_MIRRORED;
                case 6:
                    return CCW_180_DEGREES_MIRRORED;
                case 7:
                    return CCW_270_DEGREES_MIRRORED;
                default:
                    return null;
            }
        }

        public static anxx internalGetVerifier() {
            return OrientationTypeVerifier.INSTANCE;
        }

        private OrientationType(int i) {
            this.value = i;
        }

        static {
            internalValueMap = new anxy() {
                public OrientationType findValueByNumber(int i) {
                    return OrientationType.forNumber(i);
                }
            };
        }
    }

    private CardboardDevice$CardboardInternalParams() {
        String str = "";
        this.accelerometer_ = str;
        this.gyroscope_ = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001,\u0002\u0001\u0000\u0003\u0001\u0001\u0004\u0001\u0002\u0005\b\u0003\u0006\b\u0004", new Object[]{"bitField0_", "eyeOrientations_", OrientationType.internalGetVerifier(), "screenCenterToLensDistance_", "xPpiOverride_", "yPpiOverride_", "accelerometer_", "gyroscope_"});
            case 3:
                return new CardboardDevice$CardboardInternalParams();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CardboardDevice$CardboardInternalParams.class) {
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

    public static anzq parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams = new CardboardDevice$CardboardInternalParams();
        DEFAULT_INSTANCE = cardboardDevice$CardboardInternalParams;
        anxl.registerDefaultInstance(CardboardDevice$CardboardInternalParams.class, cardboardDevice$CardboardInternalParams);
    }
}
