package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awzh;
import defpackage.awzi;

public final class RefreshCommandOuterClass$RefreshCommand extends anxl implements anzf {
    public static final RefreshCommandOuterClass$RefreshCommand c;
    private static volatile anzq d;
    public static final anxr refreshCommand;
    public int a;
    public int b;

    private RefreshCommandOuterClass$RefreshCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", awzi.a});
            case 3:
                return new RefreshCommandOuterClass$RefreshCommand();
            case 4:
                return new awzh();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (RefreshCommandOuterClass$RefreshCommand.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = new RefreshCommandOuterClass$RefreshCommand();
        c = refreshCommandOuterClass$RefreshCommand;
        anxl.registerDefaultInstance(RefreshCommandOuterClass$RefreshCommand.class, refreshCommandOuterClass$RefreshCommand);
        apxu apxu = apxu.d;
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand2 = c;
        refreshCommand = anxl.newSingularGeneratedExtension(apxu, refreshCommandOuterClass$RefreshCommand2, refreshCommandOuterClass$RefreshCommand2, null, 177327295, aobm.MESSAGE, RefreshCommandOuterClass$RefreshCommand.class);
    }
}
