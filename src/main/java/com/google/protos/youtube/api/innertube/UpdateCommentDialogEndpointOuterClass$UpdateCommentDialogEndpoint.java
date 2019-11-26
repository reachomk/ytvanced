package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayrr;
import defpackage.ayrt;

public final class UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint extends anxl implements anzf {
    public static final UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint c;
    private static volatile anzq e;
    public static final anxr updateCommentDialogEndpoint;
    public int a;
    public ayrt b;
    private byte d = (byte) 2;

    private UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint() {
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
                return new UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint();
            case 4:
                return new ayrr();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class) {
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
        UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint = new UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint();
        c = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint;
        anxl.registerDefaultInstance(UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class, updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint);
        apxu apxu = apxu.d;
        UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint2 = c;
        updateCommentDialogEndpoint = anxl.newSingularGeneratedExtension(apxu, updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint2, updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint2, null, 122557296, aobm.MESSAGE, UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class);
    }
}
