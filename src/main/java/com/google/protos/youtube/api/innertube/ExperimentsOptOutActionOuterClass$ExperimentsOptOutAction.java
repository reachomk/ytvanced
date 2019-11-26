package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aric;
import defpackage.arml;

public final class ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction extends anxl implements anzf {
    public static final ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction c;
    private static volatile anzq e;
    public static final anxr experimentsOptOutAction;
    public int a;
    public arml b;
    private byte d = (byte) 2;

    private ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction() {
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
                return new ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction();
            case 4:
                return new aric();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction.class) {
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
        ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction experimentsOptOutActionOuterClass$ExperimentsOptOutAction = new ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction();
        c = experimentsOptOutActionOuterClass$ExperimentsOptOutAction;
        anxl.registerDefaultInstance(ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction.class, experimentsOptOutActionOuterClass$ExperimentsOptOutAction);
        apxu apxu = apxu.d;
        ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction experimentsOptOutActionOuterClass$ExperimentsOptOutAction2 = c;
        experimentsOptOutAction = anxl.newSingularGeneratedExtension(apxu, experimentsOptOutActionOuterClass$ExperimentsOptOutAction2, experimentsOptOutActionOuterClass$ExperimentsOptOutAction2, null, 121198913, aobm.MESSAGE, ExperimentsOptOutActionOuterClass$ExperimentsOptOutAction.class);
    }
}
