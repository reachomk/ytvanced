package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;

public final class Preferences$TrackingConfigurationParams extends anxl implements anzf {
    public static final int CONTROLLER_CONFIG_TYPE_FIELD_NUMBER = 1;
    public static final Preferences$TrackingConfigurationParams DEFAULT_INSTANCE;
    public static volatile anzq PARSER;
    public int bitField0_;
    public int controllerConfigType_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(Preferences$TrackingConfigurationParams.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    private Preferences$TrackingConfigurationParams() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"bitField0_", "controllerConfigType_", Preferences$ControllerConfigurationType.internalGetVerifier()});
            case 3:
                return new Preferences$TrackingConfigurationParams();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Preferences$TrackingConfigurationParams.class) {
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
        Preferences$TrackingConfigurationParams preferences$TrackingConfigurationParams = new Preferences$TrackingConfigurationParams();
        DEFAULT_INSTANCE = preferences$TrackingConfigurationParams;
        anxl.registerDefaultInstance(Preferences$TrackingConfigurationParams.class, preferences$TrackingConfigurationParams);
    }
}
