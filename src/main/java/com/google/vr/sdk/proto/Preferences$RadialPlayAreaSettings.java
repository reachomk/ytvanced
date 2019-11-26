package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;

public final class Preferences$RadialPlayAreaSettings extends anxl implements anzf {
    public static final Preferences$RadialPlayAreaSettings DEFAULT_INSTANCE;
    public static volatile anzq PARSER = null;
    public static final int RADIUS_FIELD_NUMBER = 1;
    public int bitField0_;
    public float radius_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(Preferences$RadialPlayAreaSettings.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    private Preferences$RadialPlayAreaSettings() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new Object[]{"bitField0_", "radius_"});
            case 3:
                return new Preferences$RadialPlayAreaSettings();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Preferences$RadialPlayAreaSettings.class) {
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
        Preferences$RadialPlayAreaSettings preferences$RadialPlayAreaSettings = new Preferences$RadialPlayAreaSettings();
        DEFAULT_INSTANCE = preferences$RadialPlayAreaSettings;
        anxl.registerDefaultInstance(Preferences$RadialPlayAreaSettings.class, preferences$RadialPlayAreaSettings);
    }
}
