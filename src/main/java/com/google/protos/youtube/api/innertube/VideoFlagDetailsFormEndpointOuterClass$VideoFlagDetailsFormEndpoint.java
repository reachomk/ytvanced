package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azav;

public final class VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint extends anxl implements anzf {
    public static final VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint c;
    private static volatile anzq d;
    public static final anxr videoFlagDetailsFormEndpoint;
    public int a;
    public String b = "";

    private VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint();
            case 4:
                return new azav();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint.class) {
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
        VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint videoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint = new VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint();
        c = videoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint;
        anxl.registerDefaultInstance(VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint.class, videoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint);
        apxu apxu = apxu.d;
        VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint videoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint2 = c;
        videoFlagDetailsFormEndpoint = anxl.newSingularGeneratedExtension(apxu, videoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint2, videoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint2, null, 164193100, aobm.MESSAGE, VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint.class);
    }
}
