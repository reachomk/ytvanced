package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqhk;
import defpackage.atqm;

public final class CompleteTransactionActionOuterClass$CompleteTransactionAction extends anxl implements anzf {
    public static final anxr completeTransactionAction;
    public static final CompleteTransactionActionOuterClass$CompleteTransactionAction d;
    private static volatile anzq f;
    public int a;
    public atqm b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private CompleteTransactionActionOuterClass$CompleteTransactionAction() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002Љ\u0001\u0003Л", new Object[]{"a", "b", "c", apxu.class});
            case 3:
                return new CompleteTransactionActionOuterClass$CompleteTransactionAction();
            case 4:
                return new aqhk();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (CompleteTransactionActionOuterClass$CompleteTransactionAction.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        CompleteTransactionActionOuterClass$CompleteTransactionAction completeTransactionActionOuterClass$CompleteTransactionAction = new CompleteTransactionActionOuterClass$CompleteTransactionAction();
        d = completeTransactionActionOuterClass$CompleteTransactionAction;
        anxl.registerDefaultInstance(CompleteTransactionActionOuterClass$CompleteTransactionAction.class, completeTransactionActionOuterClass$CompleteTransactionAction);
        apxu apxu = apxu.d;
        CompleteTransactionActionOuterClass$CompleteTransactionAction completeTransactionActionOuterClass$CompleteTransactionAction2 = d;
        completeTransactionAction = anxl.newSingularGeneratedExtension(apxu, completeTransactionActionOuterClass$CompleteTransactionAction2, completeTransactionActionOuterClass$CompleteTransactionAction2, null, 165983090, aobm.MESSAGE, CompleteTransactionActionOuterClass$CompleteTransactionAction.class);
    }
}
