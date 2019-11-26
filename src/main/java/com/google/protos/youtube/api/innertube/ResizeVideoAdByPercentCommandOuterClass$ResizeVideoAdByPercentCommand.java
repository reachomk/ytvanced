package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axaz;

public final class ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand extends anxl implements anzf {
    public static final ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand f;
    private static volatile anzq g;
    public static final anxr resizeVideoAdByPercentCommand;
    public int a;
    public float b;
    public float c;
    public float d;
    public int e;

    private ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0004\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand();
            case 4:
                return new axaz();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand = new ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand();
        f = resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand;
        anxl.registerDefaultInstance(ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand.class, resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand);
        apxu apxu = apxu.d;
        ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand2 = f;
        resizeVideoAdByPercentCommand = anxl.newSingularGeneratedExtension(apxu, resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand2, resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand2, null, 207760796, aobm.MESSAGE, ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand.class);
    }
}
