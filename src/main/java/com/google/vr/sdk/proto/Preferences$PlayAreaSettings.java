package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;

public final class Preferences$PlayAreaSettings extends anxl implements anzf {
    public static final int ANCHOR_IDS_FIELD_NUMBER = 1;
    public static final Preferences$PlayAreaSettings DEFAULT_INSTANCE;
    public static volatile anzq PARSER = null;
    public static final int PLAY_AREA_TYPE_FIELD_NUMBER = 2;
    public static final int RADIAL_PLAY_AREA_FIELD_NUMBER = 3;
    public anyd anchorIds_ = anxl.emptyProtobufList();
    public int bitField0_;
    public int playAreaType_;
    public Preferences$RadialPlayAreaSettings radialPlayArea_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(Preferences$PlayAreaSettings.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    private Preferences$PlayAreaSettings() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\f\u0000\u0003\t\u0001", new Object[]{"bitField0_", "anchorIds_", "playAreaType_", Preferences$PlayAreaType.internalGetVerifier(), "radialPlayArea_"});
            case 3:
                return new Preferences$PlayAreaSettings();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Preferences$PlayAreaSettings.class) {
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
        Preferences$PlayAreaSettings preferences$PlayAreaSettings = new Preferences$PlayAreaSettings();
        DEFAULT_INSTANCE = preferences$PlayAreaSettings;
        anxl.registerDefaultInstance(Preferences$PlayAreaSettings.class, preferences$PlayAreaSettings);
    }
}
