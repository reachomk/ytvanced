package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avkl;

public final class NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction extends anxl implements anzf {
    public static final NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction a;
    private static volatile anzq b;
    public static final anxr notificationDialogDecisionCancelAction;

    private NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction() {
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
                return new NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction();
            case 4:
                return new avkl();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction.class) {
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
        NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction notificationDialogDecisionAction$NotificationDialogDecisionCancelAction = new NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction();
        a = notificationDialogDecisionAction$NotificationDialogDecisionCancelAction;
        anxl.registerDefaultInstance(NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction.class, notificationDialogDecisionAction$NotificationDialogDecisionCancelAction);
        apxu apxu = apxu.d;
        NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction notificationDialogDecisionAction$NotificationDialogDecisionCancelAction2 = a;
        notificationDialogDecisionCancelAction = anxl.newSingularGeneratedExtension(apxu, notificationDialogDecisionAction$NotificationDialogDecisionCancelAction2, notificationDialogDecisionAction$NotificationDialogDecisionCancelAction2, null, 87393220, aobm.MESSAGE, NotificationDialogDecisionAction$NotificationDialogDecisionCancelAction.class);
    }
}
