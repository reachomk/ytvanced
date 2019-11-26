package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axak;
import defpackage.axlg;

public final class ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand extends anxl implements anzf {
    public static final ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand c;
    private static volatile anzq e;
    public static final anxr showCommentSimpleboxCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand() {
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
                return new ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand();
            case 4:
                return new axlg();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class) {
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
        ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand showCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand = new ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand();
        c = showCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand;
        anxl.registerDefaultInstance(ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class, showCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand);
        apxu apxu = apxu.d;
        ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand showCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand2 = c;
        showCommentSimpleboxCommand = anxl.newSingularGeneratedExtension(apxu, showCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand2, showCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand2, null, 206638672, aobm.MESSAGE, ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class);
    }
}
