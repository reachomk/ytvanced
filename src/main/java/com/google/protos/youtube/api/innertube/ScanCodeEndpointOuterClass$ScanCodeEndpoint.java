package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axbv;

public final class ScanCodeEndpointOuterClass$ScanCodeEndpoint extends anxl implements anzf {
    public static final ScanCodeEndpointOuterClass$ScanCodeEndpoint a;
    private static volatile anzq b;
    public static final anxr scanCodeEndpoint;

    private ScanCodeEndpointOuterClass$ScanCodeEndpoint() {
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
                return new ScanCodeEndpointOuterClass$ScanCodeEndpoint();
            case 4:
                return new axbv();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ScanCodeEndpointOuterClass$ScanCodeEndpoint.class) {
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
        ScanCodeEndpointOuterClass$ScanCodeEndpoint scanCodeEndpointOuterClass$ScanCodeEndpoint = new ScanCodeEndpointOuterClass$ScanCodeEndpoint();
        a = scanCodeEndpointOuterClass$ScanCodeEndpoint;
        anxl.registerDefaultInstance(ScanCodeEndpointOuterClass$ScanCodeEndpoint.class, scanCodeEndpointOuterClass$ScanCodeEndpoint);
        apxu apxu = apxu.d;
        ScanCodeEndpointOuterClass$ScanCodeEndpoint scanCodeEndpointOuterClass$ScanCodeEndpoint2 = a;
        scanCodeEndpoint = anxl.newSingularGeneratedExtension(apxu, scanCodeEndpointOuterClass$ScanCodeEndpoint2, scanCodeEndpointOuterClass$ScanCodeEndpoint2, null, 159170544, aobm.MESSAGE, ScanCodeEndpointOuterClass$ScanCodeEndpoint.class);
    }
}
