package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arie;

public final class ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint extends anxl implements anzf {
    public static final ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint a;
    private static volatile anzq b;
    public static final anxr experimentsSearchEndpoint;

    private ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint() {
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
                return new ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint();
            case 4:
                return new arie();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint.class) {
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
        ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint experimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint = new ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint();
        a = experimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint;
        anxl.registerDefaultInstance(ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint.class, experimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint);
        apxu apxu = apxu.d;
        ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint experimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint2 = a;
        experimentsSearchEndpoint = anxl.newSingularGeneratedExtension(apxu, experimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint2, experimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint2, null, 112757562, aobm.MESSAGE, ExperimentsSearchEndpointOuterClass$ExperimentsSearchEndpoint.class);
    }
}
