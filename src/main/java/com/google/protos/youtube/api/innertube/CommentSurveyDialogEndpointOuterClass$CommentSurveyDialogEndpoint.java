package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqcm;
import defpackage.axak;

public final class CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint extends anxl implements anzf {
    public static final CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint c;
    public static final anxr commentSurveyDialogEndpoint;
    private static volatile anzq e;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint() {
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
                return new CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint();
            case 4:
                return new aqcm();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint.class) {
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
        CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint commentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint = new CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint();
        c = commentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint;
        anxl.registerDefaultInstance(CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint.class, commentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint);
        apxu apxu = apxu.d;
        CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint commentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint2 = c;
        commentSurveyDialogEndpoint = anxl.newSingularGeneratedExtension(apxu, commentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint2, commentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint2, null, 157657822, aobm.MESSAGE, CommentSurveyDialogEndpointOuterClass$CommentSurveyDialogEndpoint.class);
    }
}
