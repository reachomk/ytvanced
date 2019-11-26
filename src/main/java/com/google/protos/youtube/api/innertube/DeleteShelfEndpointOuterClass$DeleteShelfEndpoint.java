package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqus;

public final class DeleteShelfEndpointOuterClass$DeleteShelfEndpoint extends anxl implements anzf {
    public static final DeleteShelfEndpointOuterClass$DeleteShelfEndpoint a;
    private static volatile anzq b;
    public static final anxr deleteShelfEndpoint;

    private DeleteShelfEndpointOuterClass$DeleteShelfEndpoint() {
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
                return new DeleteShelfEndpointOuterClass$DeleteShelfEndpoint();
            case 4:
                return new aqus();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (DeleteShelfEndpointOuterClass$DeleteShelfEndpoint.class) {
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
        DeleteShelfEndpointOuterClass$DeleteShelfEndpoint deleteShelfEndpointOuterClass$DeleteShelfEndpoint = new DeleteShelfEndpointOuterClass$DeleteShelfEndpoint();
        a = deleteShelfEndpointOuterClass$DeleteShelfEndpoint;
        anxl.registerDefaultInstance(DeleteShelfEndpointOuterClass$DeleteShelfEndpoint.class, deleteShelfEndpointOuterClass$DeleteShelfEndpoint);
        apxu apxu = apxu.d;
        DeleteShelfEndpointOuterClass$DeleteShelfEndpoint deleteShelfEndpointOuterClass$DeleteShelfEndpoint2 = a;
        deleteShelfEndpoint = anxl.newSingularGeneratedExtension(apxu, deleteShelfEndpointOuterClass$DeleteShelfEndpoint2, deleteShelfEndpointOuterClass$DeleteShelfEndpoint2, null, 67263783, aobm.MESSAGE, DeleteShelfEndpointOuterClass$DeleteShelfEndpoint.class);
    }
}
