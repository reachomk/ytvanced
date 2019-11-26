package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axac;

public final class RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction extends anxl implements anzf {
    public static final RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction d;
    private static volatile anzq e;
    public static final anxr removeNotificationTrayItemAction;
    public int a;
    public String b = "";
    public int c;

    private RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction();
            case 4:
                return new axac();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction = new RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction();
        d = removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction;
        anxl.registerDefaultInstance(RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction);
        apxu apxu = apxu.d;
        RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction2 = d;
        removeNotificationTrayItemAction = anxl.newSingularGeneratedExtension(apxu, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction2, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction2, null, 99968691, aobm.MESSAGE, RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class);
    }
}
