package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anxv;
import defpackage.anxx;
import defpackage.anxy;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;

public final class Preferences$UserPrefs extends anxl implements anzf {
    public static final int CONTROLLER_HANDEDNESS_FIELD_NUMBER = 1;
    public static final Preferences$UserPrefs DEFAULT_INSTANCE;
    public static final int DEVELOPER_PREFS_FIELD_NUMBER = 2;
    public static volatile anzq PARSER = null;
    public static final int RUNTIME_FEATURES_FIELD_NUMBER = 3;
    public int bitField0_;
    public int controllerHandedness_;
    public Preferences$DeveloperPrefs developerPrefs_;
    public anyd runtimeFeatures_ = anxl.emptyProtobufList();

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(Preferences$UserPrefs.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    public enum Handedness implements anxv {
        RIGHT_HANDED(0),
        LEFT_HANDED(1);
        
        public static final int LEFT_HANDED_VALUE = 1;
        public static final int RIGHT_HANDED_VALUE = 0;
        public static final anxy internalValueMap = null;
        public final int value;

        final class HandednessVerifier implements anxx {
            public static final anxx INSTANCE = null;

            private HandednessVerifier() {
            }

            public final boolean isInRange(int i) {
                return Handedness.forNumber(i) != null;
            }

            static {
                INSTANCE = new HandednessVerifier();
            }
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }

        public final int getNumber() {
            return this.value;
        }

        public static Handedness forNumber(int i) {
            if (i != 0) {
                return i != 1 ? null : LEFT_HANDED;
            } else {
                return RIGHT_HANDED;
            }
        }

        public static anxx internalGetVerifier() {
            return HandednessVerifier.INSTANCE;
        }

        private Handedness(int i) {
            this.value = i;
        }

        static {
            internalValueMap = new anxy() {
                public Handedness findValueByNumber(int i) {
                    return Handedness.forNumber(i);
                }
            };
        }
    }

    private Preferences$UserPrefs() {
    }

    public final boolean hasDeveloperPrefs() {
        return (this.bitField0_ & 2) != 0;
    }

    public final Preferences$DeveloperPrefs getDeveloperPrefs() {
        Preferences$DeveloperPrefs preferences$DeveloperPrefs = this.developerPrefs_;
        return preferences$DeveloperPrefs == null ? Preferences$DeveloperPrefs.getDefaultInstance() : preferences$DeveloperPrefs;
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
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u001b", new Object[]{"bitField0_", "controllerHandedness_", Handedness.internalGetVerifier(), "developerPrefs_", "runtimeFeatures_", Preferences$RuntimeFeature.class});
            case 3:
                return new Preferences$UserPrefs();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Preferences$UserPrefs.class) {
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
        Preferences$UserPrefs preferences$UserPrefs = new Preferences$UserPrefs();
        DEFAULT_INSTANCE = preferences$UserPrefs;
        anxl.registerDefaultInstance(Preferences$UserPrefs.class, preferences$UserPrefs);
    }
}
