package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azjn;

public final class WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint extends anxl implements anzf {
    public static final WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint a;
    private static volatile anzq b;
    public static final anxr watchGamingEventEndpoint;

    private WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint() {
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
                return new WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint();
            case 4:
                return new azjn();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint.class) {
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
        WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint watchGamingEventEndpointOuterClass$WatchGamingEventEndpoint = new WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint();
        a = watchGamingEventEndpointOuterClass$WatchGamingEventEndpoint;
        anxl.registerDefaultInstance(WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint.class, watchGamingEventEndpointOuterClass$WatchGamingEventEndpoint);
        apxu apxu = apxu.d;
        WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint watchGamingEventEndpointOuterClass$WatchGamingEventEndpoint2 = a;
        watchGamingEventEndpoint = anxl.newSingularGeneratedExtension(apxu, watchGamingEventEndpointOuterClass$WatchGamingEventEndpoint2, watchGamingEventEndpointOuterClass$WatchGamingEventEndpoint2, null, 118983658, aobm.MESSAGE, WatchGamingEventEndpointOuterClass$WatchGamingEventEndpoint.class);
    }
}
