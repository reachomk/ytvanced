package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;

public final class Preferences$RuntimeFeature extends anxl implements anzf {
    public static final Preferences$RuntimeFeature DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    public static volatile anzq PARSER;
    public int bitField0_;
    public boolean enabled_;
    public int id_ = -1;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(Preferences$RuntimeFeature.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    private Preferences$RuntimeFeature() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0007\u0001", new Object[]{"bitField0_", "id_", "enabled_"});
            case 3:
                return new Preferences$RuntimeFeature();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Preferences$RuntimeFeature.class) {
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
        Preferences$RuntimeFeature preferences$RuntimeFeature = new Preferences$RuntimeFeature();
        DEFAULT_INSTANCE = preferences$RuntimeFeature;
        anxl.registerDefaultInstance(Preferences$RuntimeFeature.class, preferences$RuntimeFeature);
    }
}
