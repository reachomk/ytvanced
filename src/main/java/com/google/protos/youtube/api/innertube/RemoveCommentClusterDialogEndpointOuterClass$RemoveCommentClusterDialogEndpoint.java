package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awzw;
import defpackage.axak;

public final class RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint extends anxl implements anzf {
    public static final RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint c;
    private static volatile anzq e;
    public static final anxr removeCommentClusterDialogEndpoint;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint() {
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
                return new RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint();
            case 4:
                return new awzw();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint.class) {
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
        RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint removeCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint = new RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint();
        c = removeCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint;
        anxl.registerDefaultInstance(RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint.class, removeCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint);
        apxu apxu = apxu.d;
        RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint removeCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint2 = c;
        removeCommentClusterDialogEndpoint = anxl.newSingularGeneratedExtension(apxu, removeCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint2, removeCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint2, null, 162430543, aobm.MESSAGE, RemoveCommentClusterDialogEndpointOuterClass$RemoveCommentClusterDialogEndpoint.class);
    }
}
