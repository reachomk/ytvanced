package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awzx;

public final class RemoveContactActionOuterClass$RemoveContactAction extends anxl implements anzf {
    public static final RemoveContactActionOuterClass$RemoveContactAction a;
    private static volatile anzq b;
    public static final anxr removeContactAction;

    private RemoveContactActionOuterClass$RemoveContactAction() {
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
                return new RemoveContactActionOuterClass$RemoveContactAction();
            case 4:
                return new awzx();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (RemoveContactActionOuterClass$RemoveContactAction.class) {
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
        RemoveContactActionOuterClass$RemoveContactAction removeContactActionOuterClass$RemoveContactAction = new RemoveContactActionOuterClass$RemoveContactAction();
        a = removeContactActionOuterClass$RemoveContactAction;
        anxl.registerDefaultInstance(RemoveContactActionOuterClass$RemoveContactAction.class, removeContactActionOuterClass$RemoveContactAction);
        apxu apxu = apxu.d;
        RemoveContactActionOuterClass$RemoveContactAction removeContactActionOuterClass$RemoveContactAction2 = a;
        removeContactAction = anxl.newSingularGeneratedExtension(apxu, removeContactActionOuterClass$RemoveContactAction2, removeContactActionOuterClass$RemoveContactAction2, null, 102580987, aobm.MESSAGE, RemoveContactActionOuterClass$RemoveContactAction.class);
    }
}
