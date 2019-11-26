package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azca;

public final class VideoManagerEndpointOuterClass$VideoManagerEndpoint extends anxl implements anzf {
    public static final VideoManagerEndpointOuterClass$VideoManagerEndpoint a;
    private static volatile anzq b;
    public static final anxr videoManagerEndpoint;

    private VideoManagerEndpointOuterClass$VideoManagerEndpoint() {
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
                return new VideoManagerEndpointOuterClass$VideoManagerEndpoint();
            case 4:
                return new azca();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (VideoManagerEndpointOuterClass$VideoManagerEndpoint.class) {
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
        VideoManagerEndpointOuterClass$VideoManagerEndpoint videoManagerEndpointOuterClass$VideoManagerEndpoint = new VideoManagerEndpointOuterClass$VideoManagerEndpoint();
        a = videoManagerEndpointOuterClass$VideoManagerEndpoint;
        anxl.registerDefaultInstance(VideoManagerEndpointOuterClass$VideoManagerEndpoint.class, videoManagerEndpointOuterClass$VideoManagerEndpoint);
        apxu apxu = apxu.d;
        VideoManagerEndpointOuterClass$VideoManagerEndpoint videoManagerEndpointOuterClass$VideoManagerEndpoint2 = a;
        videoManagerEndpoint = anxl.newSingularGeneratedExtension(apxu, videoManagerEndpointOuterClass$VideoManagerEndpoint2, videoManagerEndpointOuterClass$VideoManagerEndpoint2, null, 80252293, aobm.MESSAGE, VideoManagerEndpointOuterClass$VideoManagerEndpoint.class);
    }
}
