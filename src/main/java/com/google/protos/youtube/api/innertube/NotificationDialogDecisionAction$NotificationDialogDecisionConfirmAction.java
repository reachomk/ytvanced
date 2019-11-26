package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avkn;

public final class NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction extends anxl implements anzf {
    public static final NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction a;
    private static volatile anzq b;
    public static final anxr notificationDialogDecisionConfirmAction;

    private NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction() {
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
                return new NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction();
            case 4:
                return new avkn();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction.class) {
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
        NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction notificationDialogDecisionAction$NotificationDialogDecisionConfirmAction = new NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction();
        a = notificationDialogDecisionAction$NotificationDialogDecisionConfirmAction;
        anxl.registerDefaultInstance(NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction.class, notificationDialogDecisionAction$NotificationDialogDecisionConfirmAction);
        apxu apxu = apxu.d;
        NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction notificationDialogDecisionAction$NotificationDialogDecisionConfirmAction2 = a;
        notificationDialogDecisionConfirmAction = anxl.newSingularGeneratedExtension(apxu, notificationDialogDecisionAction$NotificationDialogDecisionConfirmAction2, notificationDialogDecisionAction$NotificationDialogDecisionConfirmAction2, null, 87554239, aobm.MESSAGE, NotificationDialogDecisionAction$NotificationDialogDecisionConfirmAction.class);
    }
}
