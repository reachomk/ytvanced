package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arke;
import defpackage.arkf;

public final class FlagEndpointOuterClass$FlagEndpoint extends anxl implements anzf {
    public static final FlagEndpointOuterClass$FlagEndpoint d;
    private static volatile anzq e;
    public static final anxr flagEndpoint;
    public int a;
    public String b = "";
    public int c;

    private FlagEndpointOuterClass$FlagEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\b\u0000\u0003\f\u0002", new Object[]{"a", "b", "c", arke.a});
            case 3:
                return new FlagEndpointOuterClass$FlagEndpoint();
            case 4:
                return new arkf();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (FlagEndpointOuterClass$FlagEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        FlagEndpointOuterClass$FlagEndpoint flagEndpointOuterClass$FlagEndpoint = new FlagEndpointOuterClass$FlagEndpoint();
        d = flagEndpointOuterClass$FlagEndpoint;
        anxl.registerDefaultInstance(FlagEndpointOuterClass$FlagEndpoint.class, flagEndpointOuterClass$FlagEndpoint);
        apxu apxu = apxu.d;
        FlagEndpointOuterClass$FlagEndpoint flagEndpointOuterClass$FlagEndpoint2 = d;
        flagEndpoint = anxl.newSingularGeneratedExtension(apxu, flagEndpointOuterClass$FlagEndpoint2, flagEndpointOuterClass$FlagEndpoint2, null, 76638993, aobm.MESSAGE, FlagEndpointOuterClass$FlagEndpoint.class);
    }
}
