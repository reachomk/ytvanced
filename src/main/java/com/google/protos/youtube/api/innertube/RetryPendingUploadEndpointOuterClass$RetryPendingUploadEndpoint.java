package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axbg;

public final class RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint extends anxl implements anzf {
    public static final RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint a;
    private static volatile anzq b;
    public static final anxr retryPendingUploadEndpoint;

    private RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint() {
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
                return new RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint();
            case 4:
                return new axbg();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint.class) {
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
        RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint retryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint = new RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint();
        a = retryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint;
        anxl.registerDefaultInstance(RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint.class, retryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint);
        apxu apxu = apxu.d;
        RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint retryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint2 = a;
        retryPendingUploadEndpoint = anxl.newSingularGeneratedExtension(apxu, retryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint2, retryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint2, null, 66532140, aobm.MESSAGE, RetryPendingUploadEndpointOuterClass$RetryPendingUploadEndpoint.class);
    }
}
