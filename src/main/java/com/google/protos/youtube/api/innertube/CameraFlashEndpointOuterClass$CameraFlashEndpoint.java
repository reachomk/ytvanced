package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apis;
import defpackage.apxu;

public final class CameraFlashEndpointOuterClass$CameraFlashEndpoint extends anxl implements anzf {
    public static final CameraFlashEndpointOuterClass$CameraFlashEndpoint c;
    public static final anxr cameraFlashEndpoint;
    private static volatile anzq d;
    public int a;
    public boolean b;

    private CameraFlashEndpointOuterClass$CameraFlashEndpoint() {
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
                return new CameraFlashEndpointOuterClass$CameraFlashEndpoint();
            case 4:
                return new apis();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (CameraFlashEndpointOuterClass$CameraFlashEndpoint.class) {
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
        CameraFlashEndpointOuterClass$CameraFlashEndpoint cameraFlashEndpointOuterClass$CameraFlashEndpoint = new CameraFlashEndpointOuterClass$CameraFlashEndpoint();
        c = cameraFlashEndpointOuterClass$CameraFlashEndpoint;
        anxl.registerDefaultInstance(CameraFlashEndpointOuterClass$CameraFlashEndpoint.class, cameraFlashEndpointOuterClass$CameraFlashEndpoint);
        apxu apxu = apxu.d;
        CameraFlashEndpointOuterClass$CameraFlashEndpoint cameraFlashEndpointOuterClass$CameraFlashEndpoint2 = c;
        cameraFlashEndpoint = anxl.newSingularGeneratedExtension(apxu, cameraFlashEndpointOuterClass$CameraFlashEndpoint2, cameraFlashEndpointOuterClass$CameraFlashEndpoint2, null, 142202467, aobm.MESSAGE, CameraFlashEndpointOuterClass$CameraFlashEndpoint.class);
    }
}
