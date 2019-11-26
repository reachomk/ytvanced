package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apty;
import defpackage.apxu;

public final class ClearAppBadgeActionOuterClass$ClearAppBadgeAction extends anxl implements anzf {
    public static final ClearAppBadgeActionOuterClass$ClearAppBadgeAction a;
    private static volatile anzq b;
    public static final anxr clearAppBadgeAction;

    private ClearAppBadgeActionOuterClass$ClearAppBadgeAction() {
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
                return new ClearAppBadgeActionOuterClass$ClearAppBadgeAction();
            case 4:
                return new apty();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ClearAppBadgeActionOuterClass$ClearAppBadgeAction.class) {
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
        ClearAppBadgeActionOuterClass$ClearAppBadgeAction clearAppBadgeActionOuterClass$ClearAppBadgeAction = new ClearAppBadgeActionOuterClass$ClearAppBadgeAction();
        a = clearAppBadgeActionOuterClass$ClearAppBadgeAction;
        anxl.registerDefaultInstance(ClearAppBadgeActionOuterClass$ClearAppBadgeAction.class, clearAppBadgeActionOuterClass$ClearAppBadgeAction);
        apxu apxu = apxu.d;
        ClearAppBadgeActionOuterClass$ClearAppBadgeAction clearAppBadgeActionOuterClass$ClearAppBadgeAction2 = a;
        clearAppBadgeAction = anxl.newSingularGeneratedExtension(apxu, clearAppBadgeActionOuterClass$ClearAppBadgeAction2, clearAppBadgeActionOuterClass$ClearAppBadgeAction2, null, 106358471, aobm.MESSAGE, ClearAppBadgeActionOuterClass$ClearAppBadgeAction.class);
    }
}
