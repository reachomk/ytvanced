package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqqv;

public final class CreateCommentEndpointOuterClass$CreateCommentEndpoint extends anxl implements anzf {
    public static final CreateCommentEndpointOuterClass$CreateCommentEndpoint c;
    public static final anxr createCommentEndpoint;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private CreateCommentEndpointOuterClass$CreateCommentEndpoint() {
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
                return new CreateCommentEndpointOuterClass$CreateCommentEndpoint();
            case 4:
                return new aqqv();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (CreateCommentEndpointOuterClass$CreateCommentEndpoint.class) {
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
        CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint = new CreateCommentEndpointOuterClass$CreateCommentEndpoint();
        c = createCommentEndpointOuterClass$CreateCommentEndpoint;
        anxl.registerDefaultInstance(CreateCommentEndpointOuterClass$CreateCommentEndpoint.class, createCommentEndpointOuterClass$CreateCommentEndpoint);
        apxu apxu = apxu.d;
        CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint2 = c;
        createCommentEndpoint = anxl.newSingularGeneratedExtension(apxu, createCommentEndpointOuterClass$CreateCommentEndpoint2, createCommentEndpointOuterClass$CreateCommentEndpoint2, null, 68212148, aobm.MESSAGE, CreateCommentEndpointOuterClass$CreateCommentEndpoint.class);
    }
}
