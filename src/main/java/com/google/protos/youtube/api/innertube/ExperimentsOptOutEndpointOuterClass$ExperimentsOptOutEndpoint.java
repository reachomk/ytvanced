package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arid;

public final class ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint extends anxl implements anzf {
    public static final ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint a;
    private static volatile anzq b;
    public static final anxr experimentsOptOutEndpoint;

    private ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint() {
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
                return new ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint();
            case 4:
                return new arid();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint.class) {
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
        ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint experimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint = new ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint();
        a = experimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint;
        anxl.registerDefaultInstance(ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint.class, experimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint);
        apxu apxu = apxu.d;
        ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint experimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint2 = a;
        experimentsOptOutEndpoint = anxl.newSingularGeneratedExtension(apxu, experimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint2, experimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint2, null, 111894553, aobm.MESSAGE, ExperimentsOptOutEndpointOuterClass$ExperimentsOptOutEndpoint.class);
    }
}
