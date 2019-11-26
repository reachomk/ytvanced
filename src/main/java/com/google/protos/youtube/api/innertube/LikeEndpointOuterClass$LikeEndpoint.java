package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.atzu;
import defpackage.auac;
import defpackage.auad;

public final class LikeEndpointOuterClass$LikeEndpoint extends anxl implements anzf {
    public static final LikeEndpointOuterClass$LikeEndpoint e;
    private static volatile anzq g;
    public static final anxr likeEndpoint;
    public int a;
    public int b;
    public auad c;
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private LikeEndpointOuterClass$LikeEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\f\u0000\u0002\t\u0001\u0003Л", new Object[]{"a", "b", auac.a(), "c", "d", apxu.class});
            case 3:
                return new LikeEndpointOuterClass$LikeEndpoint();
            case 4:
                return new atzu();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (LikeEndpointOuterClass$LikeEndpoint.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = new LikeEndpointOuterClass$LikeEndpoint();
        e = likeEndpointOuterClass$LikeEndpoint;
        anxl.registerDefaultInstance(LikeEndpointOuterClass$LikeEndpoint.class, likeEndpointOuterClass$LikeEndpoint);
        apxu apxu = apxu.d;
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint2 = e;
        likeEndpoint = anxl.newSingularGeneratedExtension(apxu, likeEndpointOuterClass$LikeEndpoint2, likeEndpointOuterClass$LikeEndpoint2, null, 63158558, aobm.MESSAGE, LikeEndpointOuterClass$LikeEndpoint.class);
    }
}
