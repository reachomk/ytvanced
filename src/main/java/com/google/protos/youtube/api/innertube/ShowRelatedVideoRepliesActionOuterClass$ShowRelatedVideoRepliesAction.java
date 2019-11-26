package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axml;

public final class ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction extends anxl implements anzf {
    public static final ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction c;
    private static volatile anzq d;
    public static final anxr showRelatedVideoRepliesAction;
    public int a;
    public String b = "";

    private ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction() {
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
                return new ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction();
            case 4:
                return new axml();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction.class) {
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
        ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction showRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction = new ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction();
        c = showRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction;
        anxl.registerDefaultInstance(ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction.class, showRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction);
        apxu apxu = apxu.d;
        ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction showRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction2 = c;
        showRelatedVideoRepliesAction = anxl.newSingularGeneratedExtension(apxu, showRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction2, showRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction2, null, 148940894, aobm.MESSAGE, ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction.class);
    }
}
