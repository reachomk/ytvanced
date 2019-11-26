package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apua;
import defpackage.apxu;

public final class ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction extends anxl implements anzf {
    public static final ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction c;
    public static final anxr clearNotificationsUnreadCountAction;
    private static volatile anzq d;
    public int a;
    public long b;

    private ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002\u0000", new Object[]{"a", "b"});
            case 3:
                return new ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction();
            case 4:
                return new apua();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.class) {
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
        ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction = new ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction();
        c = clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction;
        anxl.registerDefaultInstance(ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.class, clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction);
        apxu apxu = apxu.d;
        ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction2 = c;
        clearNotificationsUnreadCountAction = anxl.newSingularGeneratedExtension(apxu, clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction2, clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction2, null, 126831092, aobm.MESSAGE, ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.class);
    }
}
