package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqcx;
import defpackage.aqcz;
import defpackage.aqdb;

public final class CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint extends anxl implements anzf {
    public static final anxr commentsStreamReloadEndpoint;
    public static final CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint d;
    private static volatile anzq f;
    public int a;
    public aqdb b;
    public int c;
    private byte e = (byte) 2;

    private CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", aqcx.a});
            case 3:
                return new CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint();
            case 4:
                return new aqcz();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = new CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint();
        d = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
        anxl.registerDefaultInstance(CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint);
        apxu apxu = apxu.d;
        CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint2 = d;
        commentsStreamReloadEndpoint = anxl.newSingularGeneratedExtension(apxu, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint2, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint2, null, 137332281, aobm.MESSAGE, CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class);
    }
}
