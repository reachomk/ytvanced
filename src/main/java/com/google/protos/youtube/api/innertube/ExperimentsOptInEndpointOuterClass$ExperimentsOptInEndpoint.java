package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arib;

public final class ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint extends anxl implements anzf {
    public static final ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint a;
    private static volatile anzq b;
    public static final anxr experimentsOptInEndpoint;

    private ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint() {
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
                return new ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint();
            case 4:
                return new arib();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint.class) {
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
        ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint experimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint = new ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint();
        a = experimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint;
        anxl.registerDefaultInstance(ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint.class, experimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint);
        apxu apxu = apxu.d;
        ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint experimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint2 = a;
        experimentsOptInEndpoint = anxl.newSingularGeneratedExtension(apxu, experimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint2, experimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint2, null, 105463362, aobm.MESSAGE, ExperimentsOptInEndpointOuterClass$ExperimentsOptInEndpoint.class);
    }
}
