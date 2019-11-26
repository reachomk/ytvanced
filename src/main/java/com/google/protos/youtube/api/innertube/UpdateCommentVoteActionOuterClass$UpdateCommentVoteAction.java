package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arml;
import defpackage.ayrz;

public final class UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction extends anxl implements anzf {
    public static final UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction c;
    private static volatile anzq e;
    public static final anxr updateCommentVoteAction;
    public int a;
    public arml b;
    private byte d = (byte) 2;

    private UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction() {
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
                return new UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction();
            case 4:
                return new ayrz();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.class) {
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
        UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction updateCommentVoteActionOuterClass$UpdateCommentVoteAction = new UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction();
        c = updateCommentVoteActionOuterClass$UpdateCommentVoteAction;
        anxl.registerDefaultInstance(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.class, updateCommentVoteActionOuterClass$UpdateCommentVoteAction);
        apxu apxu = apxu.d;
        UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction updateCommentVoteActionOuterClass$UpdateCommentVoteAction2 = c;
        updateCommentVoteAction = anxl.newSingularGeneratedExtension(apxu, updateCommentVoteActionOuterClass$UpdateCommentVoteAction2, updateCommentVoteActionOuterClass$UpdateCommentVoteAction2, null, 119065485, aobm.MESSAGE, UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.class);
    }
}
