package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arqy;

public final class GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint extends anxl implements anzf {
    public static final GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint c;
    private static volatile anzq d;
    public static final anxr getDataPlanPromoEndpoint;
    public int a;
    public String b = "";

    private GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint() {
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
                return new GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint();
            case 4:
                return new arqy();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint.class) {
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
        GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint getDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint = new GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint();
        c = getDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint;
        anxl.registerDefaultInstance(GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint.class, getDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint);
        apxu apxu = apxu.d;
        GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint getDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint2 = c;
        getDataPlanPromoEndpoint = anxl.newSingularGeneratedExtension(apxu, getDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint2, getDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint2, null, 118538989, aobm.MESSAGE, GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint.class);
    }
}
