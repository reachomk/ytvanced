package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axak;
import defpackage.aysg;

public final class UpdateNotificationActionOuterClass$UpdateNotificationAction extends anxl implements anzf {
    public static final UpdateNotificationActionOuterClass$UpdateNotificationAction c;
    private static volatile anzq e;
    public static final anxr updateNotificationAction;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private UpdateNotificationActionOuterClass$UpdateNotificationAction() {
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
                return new UpdateNotificationActionOuterClass$UpdateNotificationAction();
            case 4:
                return new aysg();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (UpdateNotificationActionOuterClass$UpdateNotificationAction.class) {
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
        UpdateNotificationActionOuterClass$UpdateNotificationAction updateNotificationActionOuterClass$UpdateNotificationAction = new UpdateNotificationActionOuterClass$UpdateNotificationAction();
        c = updateNotificationActionOuterClass$UpdateNotificationAction;
        anxl.registerDefaultInstance(UpdateNotificationActionOuterClass$UpdateNotificationAction.class, updateNotificationActionOuterClass$UpdateNotificationAction);
        apxu apxu = apxu.d;
        UpdateNotificationActionOuterClass$UpdateNotificationAction updateNotificationActionOuterClass$UpdateNotificationAction2 = c;
        updateNotificationAction = anxl.newSingularGeneratedExtension(apxu, updateNotificationActionOuterClass$UpdateNotificationAction2, updateNotificationActionOuterClass$UpdateNotificationAction2, null, 163531772, aobm.MESSAGE, UpdateNotificationActionOuterClass$UpdateNotificationAction.class);
    }
}
