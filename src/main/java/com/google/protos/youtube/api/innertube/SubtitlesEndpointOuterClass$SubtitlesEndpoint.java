package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axyi;

public final class SubtitlesEndpointOuterClass$SubtitlesEndpoint extends anxl implements anzf {
    public static final SubtitlesEndpointOuterClass$SubtitlesEndpoint a;
    private static volatile anzq b;
    public static final anxr subtitlesEndpoint;

    private SubtitlesEndpointOuterClass$SubtitlesEndpoint() {
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
                return new SubtitlesEndpointOuterClass$SubtitlesEndpoint();
            case 4:
                return new axyi();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (SubtitlesEndpointOuterClass$SubtitlesEndpoint.class) {
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
        SubtitlesEndpointOuterClass$SubtitlesEndpoint subtitlesEndpointOuterClass$SubtitlesEndpoint = new SubtitlesEndpointOuterClass$SubtitlesEndpoint();
        a = subtitlesEndpointOuterClass$SubtitlesEndpoint;
        anxl.registerDefaultInstance(SubtitlesEndpointOuterClass$SubtitlesEndpoint.class, subtitlesEndpointOuterClass$SubtitlesEndpoint);
        apxu apxu = apxu.d;
        SubtitlesEndpointOuterClass$SubtitlesEndpoint subtitlesEndpointOuterClass$SubtitlesEndpoint2 = a;
        subtitlesEndpoint = anxl.newSingularGeneratedExtension(apxu, subtitlesEndpointOuterClass$SubtitlesEndpoint2, subtitlesEndpointOuterClass$SubtitlesEndpoint2, null, 105751339, aobm.MESSAGE, SubtitlesEndpointOuterClass$SubtitlesEndpoint.class);
    }
}
