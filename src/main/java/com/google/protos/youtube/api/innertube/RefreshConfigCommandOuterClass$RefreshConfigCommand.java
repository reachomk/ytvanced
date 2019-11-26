package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awzk;

public final class RefreshConfigCommandOuterClass$RefreshConfigCommand extends anxl implements anzf {
    public static final RefreshConfigCommandOuterClass$RefreshConfigCommand a;
    private static volatile anzq b;
    public static final anxr refreshConfigCommand;

    private RefreshConfigCommandOuterClass$RefreshConfigCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new RefreshConfigCommandOuterClass$RefreshConfigCommand();
            case 4:
                return new awzk();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (RefreshConfigCommandOuterClass$RefreshConfigCommand.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        RefreshConfigCommandOuterClass$RefreshConfigCommand refreshConfigCommandOuterClass$RefreshConfigCommand = new RefreshConfigCommandOuterClass$RefreshConfigCommand();
        a = refreshConfigCommandOuterClass$RefreshConfigCommand;
        anxl.registerDefaultInstance(RefreshConfigCommandOuterClass$RefreshConfigCommand.class, refreshConfigCommandOuterClass$RefreshConfigCommand);
        apxu apxu = apxu.d;
        RefreshConfigCommandOuterClass$RefreshConfigCommand refreshConfigCommandOuterClass$RefreshConfigCommand2 = a;
        refreshConfigCommand = anxl.newSingularGeneratedExtension(apxu, refreshConfigCommandOuterClass$RefreshConfigCommand2, refreshConfigCommandOuterClass$RefreshConfigCommand2, null, 191373512, aobm.MESSAGE, RefreshConfigCommandOuterClass$RefreshConfigCommand.class);
    }
}
