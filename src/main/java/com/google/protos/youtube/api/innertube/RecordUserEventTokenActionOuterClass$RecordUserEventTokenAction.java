package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awvf;

public final class RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction extends anxl implements anzf {
    public static final RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction c;
    private static volatile anzq d;
    public static final anxr recordUserEventTokenAction;
    public int a;
    public String b = "";

    private RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction();
            case 4:
                return new awvf();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction recordUserEventTokenActionOuterClass$RecordUserEventTokenAction = new RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction();
        c = recordUserEventTokenActionOuterClass$RecordUserEventTokenAction;
        anxl.registerDefaultInstance(RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.class, recordUserEventTokenActionOuterClass$RecordUserEventTokenAction);
        apxu apxu = apxu.d;
        RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction recordUserEventTokenActionOuterClass$RecordUserEventTokenAction2 = c;
        recordUserEventTokenAction = anxl.newSingularGeneratedExtension(apxu, recordUserEventTokenActionOuterClass$RecordUserEventTokenAction2, recordUserEventTokenActionOuterClass$RecordUserEventTokenAction2, null, 166884902, aobm.MESSAGE, RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.class);
    }
}
