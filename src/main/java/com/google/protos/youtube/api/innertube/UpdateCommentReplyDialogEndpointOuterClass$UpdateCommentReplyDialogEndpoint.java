package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayrv;
import defpackage.ayrx;

public final class UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint extends anxl implements anzf {
    public static final UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint c;
    private static volatile anzq e;
    public static final anxr updateCommentReplyDialogEndpoint;
    public int a;
    public ayrx b;
    private byte d = (byte) 2;

    private UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint();
            case 4:
                return new ayrv();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint = new UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint();
        c = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint;
        anxl.registerDefaultInstance(UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class, updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint);
        apxu apxu = apxu.d;
        UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint2 = c;
        updateCommentReplyDialogEndpoint = anxl.newSingularGeneratedExtension(apxu, updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint2, updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint2, null, 122558141, aobm.MESSAGE, UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class);
    }
}
