package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayru;

public final class UpdateCommentEndpointOuterClass$UpdateCommentEndpoint extends anxl implements anzf {
    public static final UpdateCommentEndpointOuterClass$UpdateCommentEndpoint c;
    private static volatile anzq d;
    public static final anxr updateCommentEndpoint;
    public int a;
    public String b = "";

    private UpdateCommentEndpointOuterClass$UpdateCommentEndpoint() {
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
                return new UpdateCommentEndpointOuterClass$UpdateCommentEndpoint();
            case 4:
                return new ayru();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class) {
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
        UpdateCommentEndpointOuterClass$UpdateCommentEndpoint updateCommentEndpointOuterClass$UpdateCommentEndpoint = new UpdateCommentEndpointOuterClass$UpdateCommentEndpoint();
        c = updateCommentEndpointOuterClass$UpdateCommentEndpoint;
        anxl.registerDefaultInstance(UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class, updateCommentEndpointOuterClass$UpdateCommentEndpoint);
        apxu apxu = apxu.d;
        UpdateCommentEndpointOuterClass$UpdateCommentEndpoint updateCommentEndpointOuterClass$UpdateCommentEndpoint2 = c;
        updateCommentEndpoint = anxl.newSingularGeneratedExtension(apxu, updateCommentEndpointOuterClass$UpdateCommentEndpoint2, updateCommentEndpointOuterClass$UpdateCommentEndpoint2, null, 99326409, aobm.MESSAGE, UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class);
    }
}
