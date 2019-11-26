package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arka;

public final class FindEmailUserEndpointOuterClass$FindEmailUserEndpoint extends anxl implements anzf {
    public static final FindEmailUserEndpointOuterClass$FindEmailUserEndpoint a;
    private static volatile anzq b;
    public static final anxr findEmailUserEndpoint;

    private FindEmailUserEndpointOuterClass$FindEmailUserEndpoint() {
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
                return new FindEmailUserEndpointOuterClass$FindEmailUserEndpoint();
            case 4:
                return new arka();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (FindEmailUserEndpointOuterClass$FindEmailUserEndpoint.class) {
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
        FindEmailUserEndpointOuterClass$FindEmailUserEndpoint findEmailUserEndpointOuterClass$FindEmailUserEndpoint = new FindEmailUserEndpointOuterClass$FindEmailUserEndpoint();
        a = findEmailUserEndpointOuterClass$FindEmailUserEndpoint;
        anxl.registerDefaultInstance(FindEmailUserEndpointOuterClass$FindEmailUserEndpoint.class, findEmailUserEndpointOuterClass$FindEmailUserEndpoint);
        apxu apxu = apxu.d;
        FindEmailUserEndpointOuterClass$FindEmailUserEndpoint findEmailUserEndpointOuterClass$FindEmailUserEndpoint2 = a;
        findEmailUserEndpoint = anxl.newSingularGeneratedExtension(apxu, findEmailUserEndpointOuterClass$FindEmailUserEndpoint2, findEmailUserEndpointOuterClass$FindEmailUserEndpoint2, null, 163917887, aobm.MESSAGE, FindEmailUserEndpointOuterClass$FindEmailUserEndpoint.class);
    }
}
