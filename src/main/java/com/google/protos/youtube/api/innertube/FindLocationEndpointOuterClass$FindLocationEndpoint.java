package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arkb;

public final class FindLocationEndpointOuterClass$FindLocationEndpoint extends anxl implements anzf {
    public static final FindLocationEndpointOuterClass$FindLocationEndpoint a;
    private static volatile anzq b;
    public static final anxr findLocationEndpoint;

    private FindLocationEndpointOuterClass$FindLocationEndpoint() {
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
                return new FindLocationEndpointOuterClass$FindLocationEndpoint();
            case 4:
                return new arkb();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (FindLocationEndpointOuterClass$FindLocationEndpoint.class) {
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
        FindLocationEndpointOuterClass$FindLocationEndpoint findLocationEndpointOuterClass$FindLocationEndpoint = new FindLocationEndpointOuterClass$FindLocationEndpoint();
        a = findLocationEndpointOuterClass$FindLocationEndpoint;
        anxl.registerDefaultInstance(FindLocationEndpointOuterClass$FindLocationEndpoint.class, findLocationEndpointOuterClass$FindLocationEndpoint);
        apxu apxu = apxu.d;
        FindLocationEndpointOuterClass$FindLocationEndpoint findLocationEndpointOuterClass$FindLocationEndpoint2 = a;
        findLocationEndpoint = anxl.newSingularGeneratedExtension(apxu, findLocationEndpointOuterClass$FindLocationEndpoint2, findLocationEndpointOuterClass$FindLocationEndpoint2, null, 153675052, aobm.MESSAGE, FindLocationEndpointOuterClass$FindLocationEndpoint.class);
    }
}
