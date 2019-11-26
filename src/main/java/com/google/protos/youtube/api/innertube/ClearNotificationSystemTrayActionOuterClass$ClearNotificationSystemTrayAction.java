package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aptz;
import defpackage.apxu;

public final class ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction extends anxl implements anzf {
    public static final ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction a;
    private static volatile anzq b;
    public static final anxr clearNotificationSystemTrayAction;

    private ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction() {
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
                return new ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction();
            case 4:
                return new aptz();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction.class) {
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
        ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction clearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction = new ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction();
        a = clearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction;
        anxl.registerDefaultInstance(ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction.class, clearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction);
        apxu apxu = apxu.d;
        ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction clearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction2 = a;
        clearNotificationSystemTrayAction = anxl.newSingularGeneratedExtension(apxu, clearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction2, clearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction2, null, 168552363, aobm.MESSAGE, ClearNotificationSystemTrayActionOuterClass$ClearNotificationSystemTrayAction.class);
    }
}
