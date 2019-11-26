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
import defpackage.avvf;

public final class PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint extends anxl implements anzf {
    public static final PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint e;
    private static volatile anzq g;
    public static final anxr performCommentActionEndpoint;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\b\u0000\u0002Л\u0003\u001a", new Object[]{"a", "b", "d", apxu.class, "c"});
            case 3:
                return new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
            case 4:
                return new avvf();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class) {
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
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
        e = performCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
        anxl.registerDefaultInstance(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class, performCommentActionEndpointOuterClass$PerformCommentActionEndpoint);
        apxu apxu = apxu.d;
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint2 = e;
        performCommentActionEndpoint = anxl.newSingularGeneratedExtension(apxu, performCommentActionEndpointOuterClass$PerformCommentActionEndpoint2, performCommentActionEndpointOuterClass$PerformCommentActionEndpoint2, null, 65929205, aobm.MESSAGE, PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class);
    }
}
