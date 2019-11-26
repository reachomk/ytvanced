package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awzm;

public final class RefreshParticipantListActionOuterClass$RefreshParticipantListAction extends anxl implements anzf {
    public static final RefreshParticipantListActionOuterClass$RefreshParticipantListAction a;
    private static volatile anzq b;
    public static final anxr refreshParticipantListAction;

    private RefreshParticipantListActionOuterClass$RefreshParticipantListAction() {
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
                return new RefreshParticipantListActionOuterClass$RefreshParticipantListAction();
            case 4:
                return new awzm();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (RefreshParticipantListActionOuterClass$RefreshParticipantListAction.class) {
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
        RefreshParticipantListActionOuterClass$RefreshParticipantListAction refreshParticipantListActionOuterClass$RefreshParticipantListAction = new RefreshParticipantListActionOuterClass$RefreshParticipantListAction();
        a = refreshParticipantListActionOuterClass$RefreshParticipantListAction;
        anxl.registerDefaultInstance(RefreshParticipantListActionOuterClass$RefreshParticipantListAction.class, refreshParticipantListActionOuterClass$RefreshParticipantListAction);
        apxu apxu = apxu.d;
        RefreshParticipantListActionOuterClass$RefreshParticipantListAction refreshParticipantListActionOuterClass$RefreshParticipantListAction2 = a;
        refreshParticipantListAction = anxl.newSingularGeneratedExtension(apxu, refreshParticipantListActionOuterClass$RefreshParticipantListAction2, refreshParticipantListActionOuterClass$RefreshParticipantListAction2, null, 121546095, aobm.MESSAGE, RefreshParticipantListActionOuterClass$RefreshParticipantListAction.class);
    }
}
