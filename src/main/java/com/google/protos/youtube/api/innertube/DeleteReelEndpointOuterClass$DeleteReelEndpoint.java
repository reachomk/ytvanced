package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aquq;

public final class DeleteReelEndpointOuterClass$DeleteReelEndpoint extends anxl implements anzf {
    public static final DeleteReelEndpointOuterClass$DeleteReelEndpoint c;
    private static volatile anzq d;
    public static final anxr deleteReelEndpoint;
    public int a;
    public String b = "";

    private DeleteReelEndpointOuterClass$DeleteReelEndpoint() {
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
                return new DeleteReelEndpointOuterClass$DeleteReelEndpoint();
            case 4:
                return new aquq();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (DeleteReelEndpointOuterClass$DeleteReelEndpoint.class) {
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
        DeleteReelEndpointOuterClass$DeleteReelEndpoint deleteReelEndpointOuterClass$DeleteReelEndpoint = new DeleteReelEndpointOuterClass$DeleteReelEndpoint();
        c = deleteReelEndpointOuterClass$DeleteReelEndpoint;
        anxl.registerDefaultInstance(DeleteReelEndpointOuterClass$DeleteReelEndpoint.class, deleteReelEndpointOuterClass$DeleteReelEndpoint);
        apxu apxu = apxu.d;
        DeleteReelEndpointOuterClass$DeleteReelEndpoint deleteReelEndpointOuterClass$DeleteReelEndpoint2 = c;
        deleteReelEndpoint = anxl.newSingularGeneratedExtension(apxu, deleteReelEndpointOuterClass$DeleteReelEndpoint2, deleteReelEndpointOuterClass$DeleteReelEndpoint2, null, 173451453, aobm.MESSAGE, DeleteReelEndpointOuterClass$DeleteReelEndpoint.class);
    }
}
