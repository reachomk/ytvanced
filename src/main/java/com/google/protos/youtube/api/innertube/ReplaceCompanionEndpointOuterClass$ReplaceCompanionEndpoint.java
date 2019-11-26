package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axaq;

public final class ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint extends anxl implements anzf {
    public static final ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint c;
    private static volatile anzq d;
    public static final anxr replaceCompanionEndpoint;
    public int a;
    public String b = "";

    private ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint() {
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
                return new ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint();
            case 4:
                return new axaq();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.class) {
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
        ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint replaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint = new ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint();
        c = replaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint;
        anxl.registerDefaultInstance(ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.class, replaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint);
        apxu apxu = apxu.d;
        ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint replaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint2 = c;
        replaceCompanionEndpoint = anxl.newSingularGeneratedExtension(apxu, replaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint2, replaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint2, null, 167146950, aobm.MESSAGE, ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.class);
    }
}
