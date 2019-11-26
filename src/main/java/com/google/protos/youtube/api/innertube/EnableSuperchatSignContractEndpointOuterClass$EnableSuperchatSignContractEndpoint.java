package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aref;

public final class EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint extends anxl implements anzf {
    public static final EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint a;
    private static volatile anzq b;
    public static final anxr beginSuperchatEnablementEndpoint;

    private EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint() {
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
                return new EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint();
            case 4:
                return new aref();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint.class) {
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
        EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint enableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint = new EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint();
        a = enableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint;
        anxl.registerDefaultInstance(EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint.class, enableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint);
        apxu apxu = apxu.d;
        EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint enableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint2 = a;
        beginSuperchatEnablementEndpoint = anxl.newSingularGeneratedExtension(apxu, enableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint2, enableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint2, null, 179945762, aobm.MESSAGE, EnableSuperchatSignContractEndpointOuterClass$EnableSuperchatSignContractEndpoint.class);
    }
}
