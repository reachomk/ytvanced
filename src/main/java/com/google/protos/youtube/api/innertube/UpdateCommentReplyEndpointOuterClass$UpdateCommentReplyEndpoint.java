package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayry;

public final class UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint extends anxl implements anzf {
    public static final UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint c;
    private static volatile anzq d;
    public static final anxr updateCommentReplyEndpoint;
    public int a;
    public String b = "";

    private UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint() {
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
                return new UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint();
            case 4:
                return new ayry();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class) {
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
        UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint = new UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint();
        c = updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint;
        anxl.registerDefaultInstance(UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class, updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint);
        apxu apxu = apxu.d;
        UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint2 = c;
        updateCommentReplyEndpoint = anxl.newSingularGeneratedExtension(apxu, updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint2, updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint2, null, 100723586, aobm.MESSAGE, UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class);
    }
}
