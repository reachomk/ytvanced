package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.apya;
import defpackage.aqqu;
import defpackage.avtv;

public final class OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction extends anxl implements anzf {
    public static final OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction e;
    private static volatile anzq g;
    public static final anxr openCreateReplyDialogAction;
    public int a;
    public aqqu b;
    public apya c;
    public apya d;
    private byte f = (byte) 2;

    private OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
            case 4:
                return new avtv();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction = new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
        e = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction;
        anxl.registerDefaultInstance(OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class, openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction);
        apxu apxu = apxu.d;
        OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction2 = e;
        openCreateReplyDialogAction = anxl.newSingularGeneratedExtension(apxu, openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction2, openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction2, null, 145308295, aobm.MESSAGE, OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class);
    }
}
