package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apuc;
import defpackage.apxu;

public final class ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint extends anxl implements anzf {
    public static final ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint a;
    private static volatile anzq c;
    public static final anxr clearRemoteQueueEndpoint;
    private byte b = (byte) 2;

    private ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                if (obj != null) {
                    b = (byte) 1;
                }
                this.b = b;
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint();
            case 4:
                return new apuc();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint = new ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint();
        a = clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint;
        anxl.registerDefaultInstance(ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint.class, clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint);
        apxu apxu = apxu.d;
        ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint2 = a;
        clearRemoteQueueEndpoint = anxl.newSingularGeneratedExtension(apxu, clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint2, clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint2, null, 85732730, aobm.MESSAGE, ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint.class);
    }
}
