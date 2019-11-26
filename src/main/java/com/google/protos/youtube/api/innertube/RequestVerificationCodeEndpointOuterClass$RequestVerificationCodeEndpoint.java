package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axay;

public final class RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint extends anxl implements anzf {
    public static final RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint a;
    private static volatile anzq b;
    public static final anxr requestVerificationCodeEndpoint;

    private RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint();
            case 4:
                return new axay();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint = new RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint();
        a = requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint;
        anxl.registerDefaultInstance(RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class, requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint);
        apxu apxu = apxu.d;
        RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint2 = a;
        requestVerificationCodeEndpoint = anxl.newSingularGeneratedExtension(apxu, requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint2, requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint2, null, 130003709, aobm.MESSAGE, RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class);
    }
}
