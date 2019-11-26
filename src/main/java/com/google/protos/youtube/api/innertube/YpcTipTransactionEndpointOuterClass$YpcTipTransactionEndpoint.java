package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azpl;

public final class YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint extends anxl implements anzf {
    public static final YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint c;
    private static volatile anzq d;
    public static final anxr ypcTipTransactionEndpoint;
    public int a;
    public String b = "";

    private YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint() {
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
                return new YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint();
            case 4:
                return new azpl();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.class) {
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
        YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint = new YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint();
        c = ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint;
        anxl.registerDefaultInstance(YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.class, ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint);
        apxu apxu = apxu.d;
        YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint2 = c;
        ypcTipTransactionEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint2, ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint2, null, 65099913, aobm.MESSAGE, YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.class);
    }
}
