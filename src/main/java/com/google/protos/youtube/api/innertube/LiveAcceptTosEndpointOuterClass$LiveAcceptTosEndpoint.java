package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aubg;

public final class LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint extends anxl implements anzf {
    public static final LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint a;
    private static volatile anzq b;
    public static final anxr liveAcceptTosEndpoint;

    private LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint() {
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
                return new LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint();
            case 4:
                return new aubg();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class) {
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
        LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint = new LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint();
        a = liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint;
        anxl.registerDefaultInstance(LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class, liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint);
        apxu apxu = apxu.d;
        LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint2 = a;
        liveAcceptTosEndpoint = anxl.newSingularGeneratedExtension(apxu, liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint2, liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint2, null, 129686418, aobm.MESSAGE, LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class);
    }
}
