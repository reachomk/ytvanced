package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avjm;

public final class NerdStatsEndpointOuterClass$NerdStatsEndpoint extends anxl implements anzf {
    public static final NerdStatsEndpointOuterClass$NerdStatsEndpoint a;
    private static volatile anzq b;
    public static final anxr nerdStatsEndpoint;

    private NerdStatsEndpointOuterClass$NerdStatsEndpoint() {
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
                return new NerdStatsEndpointOuterClass$NerdStatsEndpoint();
            case 4:
                return new avjm();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (NerdStatsEndpointOuterClass$NerdStatsEndpoint.class) {
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
        NerdStatsEndpointOuterClass$NerdStatsEndpoint nerdStatsEndpointOuterClass$NerdStatsEndpoint = new NerdStatsEndpointOuterClass$NerdStatsEndpoint();
        a = nerdStatsEndpointOuterClass$NerdStatsEndpoint;
        anxl.registerDefaultInstance(NerdStatsEndpointOuterClass$NerdStatsEndpoint.class, nerdStatsEndpointOuterClass$NerdStatsEndpoint);
        apxu apxu = apxu.d;
        NerdStatsEndpointOuterClass$NerdStatsEndpoint nerdStatsEndpointOuterClass$NerdStatsEndpoint2 = a;
        nerdStatsEndpoint = anxl.newSingularGeneratedExtension(apxu, nerdStatsEndpointOuterClass$NerdStatsEndpoint2, nerdStatsEndpointOuterClass$NerdStatsEndpoint2, null, 123140429, aobm.MESSAGE, NerdStatsEndpointOuterClass$NerdStatsEndpoint.class);
    }
}
