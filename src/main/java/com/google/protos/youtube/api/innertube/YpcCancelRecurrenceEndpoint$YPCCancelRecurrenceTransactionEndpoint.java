package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azll;

public final class YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint extends anxl implements anzf {
    public static final YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint d;
    private static volatile anzq e;
    public static final anxr ypcCancelRecurrenceEndpoint;
    public int a;
    public String b = "";
    public anvu c = anvu.a;

    private YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\b\u0000\u0003\n\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint();
            case 4:
                return new azll();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint = new YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint();
        d = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint;
        anxl.registerDefaultInstance(YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class, ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint);
        apxu apxu = apxu.d;
        YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint2 = d;
        ypcCancelRecurrenceEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint2, ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint2, null, 88642421, aobm.MESSAGE, YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class);
    }
}
