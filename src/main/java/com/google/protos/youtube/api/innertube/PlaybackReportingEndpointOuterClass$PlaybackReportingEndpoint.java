package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awby;

public final class PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint extends anxl implements anzf {
    public static final PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint a;
    private static volatile anzq b;
    public static final anxr playbackReportingEndpoint;

    private PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint() {
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
                return new PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint();
            case 4:
                return new awby();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint.class) {
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
        PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint playbackReportingEndpointOuterClass$PlaybackReportingEndpoint = new PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint();
        a = playbackReportingEndpointOuterClass$PlaybackReportingEndpoint;
        anxl.registerDefaultInstance(PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint.class, playbackReportingEndpointOuterClass$PlaybackReportingEndpoint);
        apxu apxu = apxu.d;
        PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint playbackReportingEndpointOuterClass$PlaybackReportingEndpoint2 = a;
        playbackReportingEndpoint = anxl.newSingularGeneratedExtension(apxu, playbackReportingEndpointOuterClass$PlaybackReportingEndpoint2, playbackReportingEndpointOuterClass$PlaybackReportingEndpoint2, null, 81465530, aobm.MESSAGE, PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint.class);
    }
}
