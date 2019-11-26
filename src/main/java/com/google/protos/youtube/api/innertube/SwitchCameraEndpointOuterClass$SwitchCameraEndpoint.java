package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aybz;

public final class SwitchCameraEndpointOuterClass$SwitchCameraEndpoint extends anxl implements anzf {
    public static final SwitchCameraEndpointOuterClass$SwitchCameraEndpoint a;
    private static volatile anzq b;
    public static final anxr switchCameraEndpoint;

    private SwitchCameraEndpointOuterClass$SwitchCameraEndpoint() {
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
                return new SwitchCameraEndpointOuterClass$SwitchCameraEndpoint();
            case 4:
                return new aybz();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class) {
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
        SwitchCameraEndpointOuterClass$SwitchCameraEndpoint switchCameraEndpointOuterClass$SwitchCameraEndpoint = new SwitchCameraEndpointOuterClass$SwitchCameraEndpoint();
        a = switchCameraEndpointOuterClass$SwitchCameraEndpoint;
        anxl.registerDefaultInstance(SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class, switchCameraEndpointOuterClass$SwitchCameraEndpoint);
        apxu apxu = apxu.d;
        SwitchCameraEndpointOuterClass$SwitchCameraEndpoint switchCameraEndpointOuterClass$SwitchCameraEndpoint2 = a;
        switchCameraEndpoint = anxl.newSingularGeneratedExtension(apxu, switchCameraEndpointOuterClass$SwitchCameraEndpoint2, switchCameraEndpointOuterClass$SwitchCameraEndpoint2, null, 142199568, aobm.MESSAGE, SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class);
    }
}
