package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aquo;

public final class DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint extends anxl implements anzf {
    public static final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint d;
    public static final anxr deletePendingUploadEndpoint;
    private static volatile anzq e;
    public int a;
    public String b;
    public String c;

    private DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint();
            case 4:
                return new aquo();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = new DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint();
        d = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
        anxl.registerDefaultInstance(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.class, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint);
        apxu apxu = apxu.d;
        DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2 = d;
        deletePendingUploadEndpoint = anxl.newSingularGeneratedExtension(apxu, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2, null, 66028866, aobm.MESSAGE, DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.class);
    }
}
