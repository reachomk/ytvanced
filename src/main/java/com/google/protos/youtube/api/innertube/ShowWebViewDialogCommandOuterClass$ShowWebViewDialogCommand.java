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
import defpackage.axak;
import defpackage.axne;

public final class ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand extends anxl implements anzf {
    public static final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand f;
    private static volatile anzq h;
    public static final anxr showWebViewDialogCommand;
    public int a;
    public String b = "";
    public boolean c;
    public arml d;
    public axak e;
    private byte g = (byte) 2;

    private ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\b\u0000\u0002Љ\u0002\u0003Љ\u0003\u0004\u0007\u0001", new Object[]{"a", "b", "d", "e", "c"});
            case 3:
                return new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
            case 4:
                return new axne();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
        f = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
        anxl.registerDefaultInstance(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand);
        apxu apxu = apxu.d;
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2 = f;
        showWebViewDialogCommand = anxl.newSingularGeneratedExtension(apxu, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2, null, 243963315, aobm.MESSAGE, ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class);
    }
}
