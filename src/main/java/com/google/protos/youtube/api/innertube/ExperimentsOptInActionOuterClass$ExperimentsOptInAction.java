package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aria;
import defpackage.arml;

public final class ExperimentsOptInActionOuterClass$ExperimentsOptInAction extends anxl implements anzf {
    public static final ExperimentsOptInActionOuterClass$ExperimentsOptInAction c;
    private static volatile anzq e;
    public static final anxr experimentsOptInAction;
    public int a;
    public arml b;
    private byte d = (byte) 2;

    private ExperimentsOptInActionOuterClass$ExperimentsOptInAction() {
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
                return new ExperimentsOptInActionOuterClass$ExperimentsOptInAction();
            case 4:
                return new aria();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ExperimentsOptInActionOuterClass$ExperimentsOptInAction.class) {
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
        ExperimentsOptInActionOuterClass$ExperimentsOptInAction experimentsOptInActionOuterClass$ExperimentsOptInAction = new ExperimentsOptInActionOuterClass$ExperimentsOptInAction();
        c = experimentsOptInActionOuterClass$ExperimentsOptInAction;
        anxl.registerDefaultInstance(ExperimentsOptInActionOuterClass$ExperimentsOptInAction.class, experimentsOptInActionOuterClass$ExperimentsOptInAction);
        apxu apxu = apxu.d;
        ExperimentsOptInActionOuterClass$ExperimentsOptInAction experimentsOptInActionOuterClass$ExperimentsOptInAction2 = c;
        experimentsOptInAction = anxl.newSingularGeneratedExtension(apxu, experimentsOptInActionOuterClass$ExperimentsOptInAction2, experimentsOptInActionOuterClass$ExperimentsOptInAction2, null, 121203186, aobm.MESSAGE, ExperimentsOptInActionOuterClass$ExperimentsOptInAction.class);
    }
}
