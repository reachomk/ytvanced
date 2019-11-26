package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arkh;

public final class FlagVideoEndpointOuterClass$FlagVideoEndpoint extends anxl implements anzf {
    public static final FlagVideoEndpointOuterClass$FlagVideoEndpoint c;
    private static volatile anzq d;
    public static final anxr flagVideoEndpoint;
    public int a;
    public String b = "";

    private FlagVideoEndpointOuterClass$FlagVideoEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new FlagVideoEndpointOuterClass$FlagVideoEndpoint();
            case 4:
                return new arkh();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (FlagVideoEndpointOuterClass$FlagVideoEndpoint.class) {
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
        FlagVideoEndpointOuterClass$FlagVideoEndpoint flagVideoEndpointOuterClass$FlagVideoEndpoint = new FlagVideoEndpointOuterClass$FlagVideoEndpoint();
        c = flagVideoEndpointOuterClass$FlagVideoEndpoint;
        anxl.registerDefaultInstance(FlagVideoEndpointOuterClass$FlagVideoEndpoint.class, flagVideoEndpointOuterClass$FlagVideoEndpoint);
        apxu apxu = apxu.d;
        FlagVideoEndpointOuterClass$FlagVideoEndpoint flagVideoEndpointOuterClass$FlagVideoEndpoint2 = c;
        flagVideoEndpoint = anxl.newSingularGeneratedExtension(apxu, flagVideoEndpointOuterClass$FlagVideoEndpoint2, flagVideoEndpointOuterClass$FlagVideoEndpoint2, null, 74232392, aobm.MESSAGE, FlagVideoEndpointOuterClass$FlagVideoEndpoint.class);
    }
}
