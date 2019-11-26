package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axar;
import defpackage.axat;

public final class ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction extends anxl implements anzf {
    public static final ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction c;
    private static volatile anzq e;
    public static final anxr replaceEnclosingAction;
    public int a;
    public axat b;
    private byte d = (byte) 2;

    private ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction() {
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
                return new ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction();
            case 4:
                return new axar();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class) {
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
        ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction = new ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction();
        c = replaceEnclosingActionOuterClass$ReplaceEnclosingAction;
        anxl.registerDefaultInstance(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class, replaceEnclosingActionOuterClass$ReplaceEnclosingAction);
        apxu apxu = apxu.d;
        ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction2 = c;
        replaceEnclosingAction = anxl.newSingularGeneratedExtension(apxu, replaceEnclosingActionOuterClass$ReplaceEnclosingAction2, replaceEnclosingActionOuterClass$ReplaceEnclosingAction2, null, 77297283, aobm.MESSAGE, ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class);
    }
}
