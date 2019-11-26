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
import defpackage.ayip;
import defpackage.azmx;

public final class YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint extends anxl implements anzf {
    public static final YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint f;
    private static volatile anzq g;
    public static final anxr ypcHandleTransactionEndpoint;
    public int a;
    public String b;
    public String c;
    public anvu d = anvu.a;
    public int e;

    private YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\n\u0002\u0004\f\u0003", new Object[]{"a", "b", "c", "d", "e", ayip.a()});
            case 3:
                return new YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint();
            case 4:
                return new azmx();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint = new YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint();
        f = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
        anxl.registerDefaultInstance(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint);
        apxu apxu = apxu.d;
        YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint2 = f;
        ypcHandleTransactionEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint2, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint2, null, 165047913, aobm.MESSAGE, YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class);
    }
}
