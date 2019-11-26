package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.artl;

public final class HideEnclosingActionOuterClass$HideEnclosingAction extends anxl implements anzf {
    public static final HideEnclosingActionOuterClass$HideEnclosingAction a;
    private static volatile anzq b;
    public static final anxr hideEnclosingAction;

    private HideEnclosingActionOuterClass$HideEnclosingAction() {
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
                return new HideEnclosingActionOuterClass$HideEnclosingAction();
            case 4:
                return new artl();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (HideEnclosingActionOuterClass$HideEnclosingAction.class) {
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
        HideEnclosingActionOuterClass$HideEnclosingAction hideEnclosingActionOuterClass$HideEnclosingAction = new HideEnclosingActionOuterClass$HideEnclosingAction();
        a = hideEnclosingActionOuterClass$HideEnclosingAction;
        anxl.registerDefaultInstance(HideEnclosingActionOuterClass$HideEnclosingAction.class, hideEnclosingActionOuterClass$HideEnclosingAction);
        apxu apxu = apxu.d;
        HideEnclosingActionOuterClass$HideEnclosingAction hideEnclosingActionOuterClass$HideEnclosingAction2 = a;
        hideEnclosingAction = anxl.newSingularGeneratedExtension(apxu, hideEnclosingActionOuterClass$HideEnclosingAction2, hideEnclosingActionOuterClass$HideEnclosingAction2, null, 77297742, aobm.MESSAGE, HideEnclosingActionOuterClass$HideEnclosingAction.class);
    }
}
