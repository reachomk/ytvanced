package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aywf;

public final class ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint extends anxl implements anzf {
    public static final ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint a;
    private static volatile anzq b;
    public static final anxr validateVerificationCodeEndpoint;

    private ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint() {
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
                return new ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint();
            case 4:
                return new aywf();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class) {
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
        ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint = new ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint();
        a = validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint;
        anxl.registerDefaultInstance(ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class, validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint);
        apxu apxu = apxu.d;
        ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint2 = a;
        validateVerificationCodeEndpoint = anxl.newSingularGeneratedExtension(apxu, validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint2, validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint2, null, 131794550, aobm.MESSAGE, ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class);
    }
}
