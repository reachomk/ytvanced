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
import defpackage.aykg;

public final class UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint extends anxl implements anzf {
    public static final UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint d;
    private static volatile anzq f;
    public static final anxr undoFeedbackEndpoint;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\b\u0000\u0002Л", new Object[]{"a", "b", "c", apxu.class});
            case 3:
                return new UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint();
            case 4:
                return new aykg();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.class) {
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
        UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint = new UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint();
        d = undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint;
        anxl.registerDefaultInstance(UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.class, undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint);
        apxu apxu = apxu.d;
        UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint2 = d;
        undoFeedbackEndpoint = anxl.newSingularGeneratedExtension(apxu, undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint2, undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint2, null, 75948536, aobm.MESSAGE, UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.class);
    }
}
