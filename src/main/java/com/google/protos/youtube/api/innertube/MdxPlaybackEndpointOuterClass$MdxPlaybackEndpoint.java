package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.autt;
import defpackage.autu;

public final class MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint extends anxl implements anzf {
    public static final MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint c;
    private static volatile anzq d;
    public static final anxr mdxPlaybackEndpoint;
    public int a;
    public autt b;

    private MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint();
            case 4:
                return new autu();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class) {
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
        MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint = new MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint();
        c = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint;
        anxl.registerDefaultInstance(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class, mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint);
        apxu apxu = apxu.d;
        MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint2 = c;
        mdxPlaybackEndpoint = anxl.newSingularGeneratedExtension(apxu, mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint2, mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint2, null, 164988379, aobm.MESSAGE, MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class);
    }
}
