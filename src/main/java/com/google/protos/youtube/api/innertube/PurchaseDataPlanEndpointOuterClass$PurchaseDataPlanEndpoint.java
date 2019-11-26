package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awti;

public final class PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint extends anxl implements anzf {
    public static final PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint c;
    private static volatile anzq d;
    public static final anxr purchaseDataPlanEndpoint;
    public int a;
    public String b = "";

    private PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint() {
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
                return new PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint();
            case 4:
                return new awti();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint.class) {
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
        PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint purchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint = new PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint();
        c = purchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint;
        anxl.registerDefaultInstance(PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint.class, purchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint);
        apxu apxu = apxu.d;
        PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint purchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint2 = c;
        purchaseDataPlanEndpoint = anxl.newSingularGeneratedExtension(apxu, purchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint2, purchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint2, null, 85764007, aobm.MESSAGE, PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint.class);
    }
}
