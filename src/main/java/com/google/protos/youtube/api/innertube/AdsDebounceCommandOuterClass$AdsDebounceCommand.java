package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aooy;
import defpackage.apxu;

public final class AdsDebounceCommandOuterClass$AdsDebounceCommand extends anxl implements anzf {
    public static final anxr adsDebounceCommand;
    public static final AdsDebounceCommandOuterClass$AdsDebounceCommand c;
    private static volatile anzq e;
    public int a;
    public apxu b;
    private byte d = (byte) 2;

    private AdsDebounceCommandOuterClass$AdsDebounceCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new AdsDebounceCommandOuterClass$AdsDebounceCommand();
            case 4:
                return new aooy();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (AdsDebounceCommandOuterClass$AdsDebounceCommand.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        AdsDebounceCommandOuterClass$AdsDebounceCommand adsDebounceCommandOuterClass$AdsDebounceCommand = new AdsDebounceCommandOuterClass$AdsDebounceCommand();
        c = adsDebounceCommandOuterClass$AdsDebounceCommand;
        anxl.registerDefaultInstance(AdsDebounceCommandOuterClass$AdsDebounceCommand.class, adsDebounceCommandOuterClass$AdsDebounceCommand);
        apxu apxu = apxu.d;
        AdsDebounceCommandOuterClass$AdsDebounceCommand adsDebounceCommandOuterClass$AdsDebounceCommand2 = c;
        adsDebounceCommand = anxl.newSingularGeneratedExtension(apxu, adsDebounceCommandOuterClass$AdsDebounceCommand2, adsDebounceCommandOuterClass$AdsDebounceCommand2, null, 247128500, aobm.MESSAGE, AdsDebounceCommandOuterClass$AdsDebounceCommand.class);
    }
}
