package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axad;

public final class RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction extends anxl implements anzf {
    public static final RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction a;
    private static volatile anzq b;
    public static final anxr removeUnblockedContactAction;

    private RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction() {
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
                return new RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction();
            case 4:
                return new axad();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class) {
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
        RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction = new RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction();
        a = removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction;
        anxl.registerDefaultInstance(RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class, removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction);
        apxu apxu = apxu.d;
        RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction2 = a;
        removeUnblockedContactAction = anxl.newSingularGeneratedExtension(apxu, removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction2, removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction2, null, 125707981, aobm.MESSAGE, RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class);
    }
}
