package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aquu;

public final class DeleteVideoEndpointOuterClass$DeleteVideoEndpoint extends anxl implements anzf {
    public static final DeleteVideoEndpointOuterClass$DeleteVideoEndpoint c;
    private static volatile anzq d;
    public static final anxr deleteVideoEndpoint;
    public int a;
    public String b = "";

    private DeleteVideoEndpointOuterClass$DeleteVideoEndpoint() {
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
                return new DeleteVideoEndpointOuterClass$DeleteVideoEndpoint();
            case 4:
                return new aquu();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class) {
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
        DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint = new DeleteVideoEndpointOuterClass$DeleteVideoEndpoint();
        c = deleteVideoEndpointOuterClass$DeleteVideoEndpoint;
        anxl.registerDefaultInstance(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class, deleteVideoEndpointOuterClass$DeleteVideoEndpoint);
        apxu apxu = apxu.d;
        DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint2 = c;
        deleteVideoEndpoint = anxl.newSingularGeneratedExtension(apxu, deleteVideoEndpointOuterClass$DeleteVideoEndpoint2, deleteVideoEndpointOuterClass$DeleteVideoEndpoint2, null, 64157372, aobm.MESSAGE, DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class);
    }
}
