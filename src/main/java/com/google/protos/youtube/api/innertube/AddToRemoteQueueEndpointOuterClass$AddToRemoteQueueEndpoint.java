package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aonj;
import defpackage.apxu;

public final class AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint extends anxl implements anzf {
    public static final anxr addToRemoteQueueEndpoint;
    public static final AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint d;
    private static volatile anzq f;
    public int a;
    public String b;
    public String c;
    private byte e = (byte) 2;

    private AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint();
            case 4:
                return new aonj();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = new AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint();
        d = addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint;
        anxl.registerDefaultInstance(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class, addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint);
        apxu apxu = apxu.d;
        AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint2 = d;
        addToRemoteQueueEndpoint = anxl.newSingularGeneratedExtension(apxu, addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint2, addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint2, null, 76177954, aobm.MESSAGE, AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class);
    }
}
