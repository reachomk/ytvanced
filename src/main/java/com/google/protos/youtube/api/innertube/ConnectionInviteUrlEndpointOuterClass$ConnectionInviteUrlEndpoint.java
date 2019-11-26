package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqib;

public final class ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint extends anxl implements anzf {
    public static final ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint a;
    private static volatile anzq b;
    public static final anxr connectionInviteUrlEndpoint;

    private ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint() {
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
                return new ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint();
            case 4:
                return new aqib();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.class) {
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
        ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint = new ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint();
        a = connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint;
        anxl.registerDefaultInstance(ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.class, connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint);
        apxu apxu = apxu.d;
        ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint2 = a;
        connectionInviteUrlEndpoint = anxl.newSingularGeneratedExtension(apxu, connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint2, connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint2, null, 105643691, aobm.MESSAGE, ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.class);
    }
}
