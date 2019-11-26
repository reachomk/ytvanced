package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.auua;

public final class MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint extends anxl implements anzf {
    public static final MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint a;
    private static volatile anzq b;
    public static final anxr mdxViewVideoInfoEndpoint;

    private MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint() {
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
                return new MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint();
            case 4:
                return new auua();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class) {
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
        MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint = new MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint();
        a = mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint;
        anxl.registerDefaultInstance(MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class, mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint);
        apxu apxu = apxu.d;
        MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint2 = a;
        mdxViewVideoInfoEndpoint = anxl.newSingularGeneratedExtension(apxu, mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint2, mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint2, null, 105496274, aobm.MESSAGE, MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class);
    }
}
