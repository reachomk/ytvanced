package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqqs;

public final class CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint extends anxl implements anzf {
    public static final CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint a;
    private static volatile anzq b;
    public static final anxr createBroadcastEndpoint;

    private CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint() {
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
                return new CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint();
            case 4:
                return new aqqs();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.class) {
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
        CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint createBroadcastEndpointOuterClass$CreateBroadcastEndpoint = new CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint();
        a = createBroadcastEndpointOuterClass$CreateBroadcastEndpoint;
        anxl.registerDefaultInstance(CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.class, createBroadcastEndpointOuterClass$CreateBroadcastEndpoint);
        apxu apxu = apxu.d;
        CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint createBroadcastEndpointOuterClass$CreateBroadcastEndpoint2 = a;
        createBroadcastEndpoint = anxl.newSingularGeneratedExtension(apxu, createBroadcastEndpointOuterClass$CreateBroadcastEndpoint2, createBroadcastEndpointOuterClass$CreateBroadcastEndpoint2, null, 145708817, aobm.MESSAGE, CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.class);
    }
}
