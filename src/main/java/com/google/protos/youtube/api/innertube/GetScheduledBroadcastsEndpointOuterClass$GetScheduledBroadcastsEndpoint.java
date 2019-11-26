package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arrf;

public final class GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint extends anxl implements anzf {
    public static final GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint a;
    private static volatile anzq c;
    public static final anxr getScheduledBroadcastsEndpoint;
    private byte b = (byte) 2;

    private GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint() {
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
                return new GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint();
            case 4:
                return new arrf();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class) {
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
        GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint = new GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint();
        a = getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
        anxl.registerDefaultInstance(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class, getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint);
        apxu apxu = apxu.d;
        GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint2 = a;
        getScheduledBroadcastsEndpoint = anxl.newSingularGeneratedExtension(apxu, getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint2, getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint2, null, 147074744, aobm.MESSAGE, GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class);
    }
}
