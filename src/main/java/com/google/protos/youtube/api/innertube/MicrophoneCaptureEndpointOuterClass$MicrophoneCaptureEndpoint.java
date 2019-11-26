package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.auxy;

public final class MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint extends anxl implements anzf {
    public static final MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint c;
    private static volatile anzq d;
    public static final anxr microphoneCaptureEndpoint;
    public int a;
    public boolean b;

    private MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint() {
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
                return new MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint();
            case 4:
                return new auxy();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class) {
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
        MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint = new MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint();
        c = microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint;
        anxl.registerDefaultInstance(MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class, microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint);
        apxu apxu = apxu.d;
        MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint2 = c;
        microphoneCaptureEndpoint = anxl.newSingularGeneratedExtension(apxu, microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint2, microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint2, null, 142199843, aobm.MESSAGE, MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class);
    }
}
