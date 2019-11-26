package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anya;
import defpackage.anzf;
import defpackage.anzq;

public final class Display$DisplayParams extends anxl implements anzf {
    public static final int BOTTOM_BEZEL_HEIGHT_FIELD_NUMBER = 3;
    public static final Display$DisplayParams DEFAULT_INSTANCE;
    public static final int DEPRECATED_GYRO_BIAS_FIELD_NUMBER = 4;
    public static volatile anzq PARSER = null;
    public static final int X_PPI_FIELD_NUMBER = 1;
    public static final int Y_PPI_FIELD_NUMBER = 2;
    public int bitField0_;
    public float bottomBezelHeight_;
    public int dEPRECATEDGyroBiasMemoizedSerializedSize = -1;
    public anya dEPRECATEDGyroBias_ = anxl.emptyFloatList();
    public float xPpi_;
    public float yPpi_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(Display$DisplayParams.DEFAULT_INSTANCE);
        }

        public final float getXPpi() {
            return ((Display$DisplayParams) this.instance).getXPpi();
        }

        public final Builder setXPpi(float f) {
            copyOnWrite();
            ((Display$DisplayParams) this.instance).setXPpi(f);
            return this;
        }

        public final float getYPpi() {
            return ((Display$DisplayParams) this.instance).getYPpi();
        }

        public final Builder setYPpi(float f) {
            copyOnWrite();
            ((Display$DisplayParams) this.instance).setYPpi(f);
            return this;
        }

        public final Builder setBottomBezelHeight(float f) {
            copyOnWrite();
            ((Display$DisplayParams) this.instance).setBottomBezelHeight(f);
            return this;
        }

        /* synthetic */ Builder(Display$1 display$1) {
            this();
        }
    }

    private Display$DisplayParams() {
    }

    public final boolean hasXPpi() {
        return (this.bitField0_ & 1) != 0;
    }

    public final float getXPpi() {
        return this.xPpi_;
    }

    private final void setXPpi(float f) {
        this.bitField0_ |= 1;
        this.xPpi_ = f;
    }

    public final boolean hasYPpi() {
        return (this.bitField0_ & 2) != 0;
    }

    public final float getYPpi() {
        return this.yPpi_;
    }

    private final void setYPpi(float f) {
        this.bitField0_ |= 2;
        this.yPpi_ = f;
    }

    public final boolean hasBottomBezelHeight() {
        return (this.bitField0_ & 4) != 0;
    }

    public final float getBottomBezelHeight() {
        return this.bottomBezelHeight_;
    }

    private final void setBottomBezelHeight(float f) {
        this.bitField0_ |= 4;
        this.bottomBezelHeight_ = f;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004$", new Object[]{"bitField0_", "xPpi_", "yPpi_", "bottomBezelHeight_", "dEPRECATEDGyroBias_"});
            case 3:
                return new Display$DisplayParams();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Display$DisplayParams.class) {
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
        Display$DisplayParams display$DisplayParams = new Display$DisplayParams();
        DEFAULT_INSTANCE = display$DisplayParams;
        anxl.registerDefaultInstance(Display$DisplayParams.class, display$DisplayParams);
    }
}
