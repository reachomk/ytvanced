package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqqy;
import defpackage.arml;

public final class CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint extends anxl implements anzf {
    public static final anxr createCommentReplyEndpoint;
    public static final CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint d;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public arml c;
    private byte e = (byte) 2;

    private CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\b\u0000\u0003Љ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint();
            case 4:
                return new aqqy();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.class) {
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
        CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint = new CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint();
        d = createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
        anxl.registerDefaultInstance(CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.class, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint);
        apxu apxu = apxu.d;
        CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2 = d;
        createCommentReplyEndpoint = anxl.newSingularGeneratedExtension(apxu, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2, null, 66712070, aobm.MESSAGE, CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.class);
    }
}
