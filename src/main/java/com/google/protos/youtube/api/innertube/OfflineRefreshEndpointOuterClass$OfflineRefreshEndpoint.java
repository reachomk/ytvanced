package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avpe;

public final class OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint extends anxl implements anzf {
    public static final OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint a;
    private static volatile anzq b;
    public static final anxr offlineRefreshEndpoint;

    private OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint() {
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
                return new OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint();
            case 4:
                return new avpe();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class) {
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
        OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint = new OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint();
        a = offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint;
        anxl.registerDefaultInstance(OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class, offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint);
        apxu apxu = apxu.d;
        OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint2 = a;
        offlineRefreshEndpoint = anxl.newSingularGeneratedExtension(apxu, offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint2, offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint2, null, 140507150, aobm.MESSAGE, OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class);
    }
}
