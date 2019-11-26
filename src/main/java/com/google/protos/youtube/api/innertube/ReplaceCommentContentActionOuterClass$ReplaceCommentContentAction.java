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
import defpackage.axap;

public final class ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction extends anxl implements anzf {
    public static final ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction c;
    private static volatile anzq e;
    public static final anxr replaceCommentContentAction;
    public int a;
    public arml b;
    private byte d = (byte) 2;

    private ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002Љ\u0001", new Object[]{"a", "b"});
            case 3:
                return new ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction();
            case 4:
                return new axap();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction.class) {
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
        ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction replaceCommentContentActionOuterClass$ReplaceCommentContentAction = new ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction();
        c = replaceCommentContentActionOuterClass$ReplaceCommentContentAction;
        anxl.registerDefaultInstance(ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction.class, replaceCommentContentActionOuterClass$ReplaceCommentContentAction);
        apxu apxu = apxu.d;
        ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction replaceCommentContentActionOuterClass$ReplaceCommentContentAction2 = c;
        replaceCommentContentAction = anxl.newSingularGeneratedExtension(apxu, replaceCommentContentActionOuterClass$ReplaceCommentContentAction2, replaceCommentContentActionOuterClass$ReplaceCommentContentAction2, null, 139601942, aobm.MESSAGE, ReplaceCommentContentActionOuterClass$ReplaceCommentContentAction.class);
    }
}
