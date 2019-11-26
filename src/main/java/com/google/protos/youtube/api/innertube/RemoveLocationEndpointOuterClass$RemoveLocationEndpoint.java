package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axab;

public final class RemoveLocationEndpointOuterClass$RemoveLocationEndpoint extends anxl implements anzf {
    public static final RemoveLocationEndpointOuterClass$RemoveLocationEndpoint a;
    private static volatile anzq b;
    public static final anxr removeLocationEndpoint;

    private RemoveLocationEndpointOuterClass$RemoveLocationEndpoint() {
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
                return new RemoveLocationEndpointOuterClass$RemoveLocationEndpoint();
            case 4:
                return new axab();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (RemoveLocationEndpointOuterClass$RemoveLocationEndpoint.class) {
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
        RemoveLocationEndpointOuterClass$RemoveLocationEndpoint removeLocationEndpointOuterClass$RemoveLocationEndpoint = new RemoveLocationEndpointOuterClass$RemoveLocationEndpoint();
        a = removeLocationEndpointOuterClass$RemoveLocationEndpoint;
        anxl.registerDefaultInstance(RemoveLocationEndpointOuterClass$RemoveLocationEndpoint.class, removeLocationEndpointOuterClass$RemoveLocationEndpoint);
        apxu apxu = apxu.d;
        RemoveLocationEndpointOuterClass$RemoveLocationEndpoint removeLocationEndpointOuterClass$RemoveLocationEndpoint2 = a;
        removeLocationEndpoint = anxl.newSingularGeneratedExtension(apxu, removeLocationEndpointOuterClass$RemoveLocationEndpoint2, removeLocationEndpointOuterClass$RemoveLocationEndpoint2, null, 153675054, aobm.MESSAGE, RemoveLocationEndpointOuterClass$RemoveLocationEndpoint.class);
    }
}
