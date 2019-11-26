package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqup;

public final class DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint extends anxl implements anzf {
    public static final DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint c;
    private static volatile anzq d;
    public static final anxr deletePlaylistEndpoint;
    public int a;
    public String b = "";

    private DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint() {
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
                return new DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint();
            case 4:
                return new aqup();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.class) {
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
        DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint = new DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint();
        c = deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint;
        anxl.registerDefaultInstance(DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.class, deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint);
        apxu apxu = apxu.d;
        DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint2 = c;
        deletePlaylistEndpoint = anxl.newSingularGeneratedExtension(apxu, deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint2, deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint2, null, 64091098, aobm.MESSAGE, DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.class);
    }
}
