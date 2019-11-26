package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axaa;

public final class RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint extends anxl implements anzf {
    public static final RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint c;
    private static volatile anzq e;
    public static final anxr removeFromRemoteQueueEndpoint;
    public int a;
    public String b = "";
    private byte d = (byte) 2;

    private RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint();
            case 4:
                return new axaa();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint = new RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint();
        c = removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint;
        anxl.registerDefaultInstance(RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class, removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint);
        apxu apxu = apxu.d;
        RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint2 = c;
        removeFromRemoteQueueEndpoint = anxl.newSingularGeneratedExtension(apxu, removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint2, removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint2, null, 64982798, aobm.MESSAGE, RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class);
    }
}
