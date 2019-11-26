package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avzp;

public final class PingingEndpointOuterClass$PingingEndpoint extends anxl implements anzf {
    public static final PingingEndpointOuterClass$PingingEndpoint c;
    private static volatile anzq d;
    public static final anxr pingingEndpoint;
    public int a;
    public boolean b;

    private PingingEndpointOuterClass$PingingEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007\u0000", new Object[]{"a", "b"});
            case 3:
                return new PingingEndpointOuterClass$PingingEndpoint();
            case 4:
                return new avzp();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (PingingEndpointOuterClass$PingingEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        PingingEndpointOuterClass$PingingEndpoint pingingEndpointOuterClass$PingingEndpoint = new PingingEndpointOuterClass$PingingEndpoint();
        c = pingingEndpointOuterClass$PingingEndpoint;
        anxl.registerDefaultInstance(PingingEndpointOuterClass$PingingEndpoint.class, pingingEndpointOuterClass$PingingEndpoint);
        apxu apxu = apxu.d;
        PingingEndpointOuterClass$PingingEndpoint pingingEndpointOuterClass$PingingEndpoint2 = c;
        pingingEndpoint = anxl.newSingularGeneratedExtension(apxu, pingingEndpointOuterClass$PingingEndpoint2, pingingEndpointOuterClass$PingingEndpoint2, null, 98444775, aobm.MESSAGE, PingingEndpointOuterClass$PingingEndpoint.class);
    }
}
