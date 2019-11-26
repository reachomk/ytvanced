package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.atrf;

public final class InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint extends anxl implements anzf {
    public static final InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint d;
    private static volatile anzq f;
    public static final anxr insertInRemoteQueueEndpoint;
    public int a;
    public String b;
    public String c;
    private byte e = (byte) 2;

    private InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint() {
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
                return new InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint();
            case 4:
                return new atrf();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class) {
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
        InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = new InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint();
        d = insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint;
        anxl.registerDefaultInstance(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class, insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint);
        apxu apxu = apxu.d;
        InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint2 = d;
        insertInRemoteQueueEndpoint = anxl.newSingularGeneratedExtension(apxu, insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint2, insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint2, null, 122330696, aobm.MESSAGE, InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class);
    }
}
