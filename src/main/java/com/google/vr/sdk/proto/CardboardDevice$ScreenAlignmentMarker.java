package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;

public final class CardboardDevice$ScreenAlignmentMarker extends anxl implements anzf {
    public static final CardboardDevice$ScreenAlignmentMarker DEFAULT_INSTANCE;
    public static final int HORIZONTAL_FIELD_NUMBER = 1;
    public static volatile anzq PARSER = null;
    public static final int VERTICAL_FIELD_NUMBER = 2;
    public int bitField0_;
    public float horizontal_;
    public float vertical_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(CardboardDevice$ScreenAlignmentMarker.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    private CardboardDevice$ScreenAlignmentMarker() {
    }

    public final float getHorizontal() {
        return this.horizontal_;
    }

    public final float getVertical() {
        return this.vertical_;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001", new Object[]{"bitField0_", "horizontal_", "vertical_"});
            case 3:
                return new CardboardDevice$ScreenAlignmentMarker();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CardboardDevice$ScreenAlignmentMarker.class) {
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
        CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = new CardboardDevice$ScreenAlignmentMarker();
        DEFAULT_INSTANCE = cardboardDevice$ScreenAlignmentMarker;
        anxl.registerDefaultInstance(CardboardDevice$ScreenAlignmentMarker.class, cardboardDevice$ScreenAlignmentMarker);
    }
}
