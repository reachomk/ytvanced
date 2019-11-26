package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avtw;
import defpackage.axak;

public final class OpenDialogCommandOuterClass$OpenDialogCommand extends anxl implements anzf {
    public static final OpenDialogCommandOuterClass$OpenDialogCommand c;
    private static volatile anzq e;
    public static final anxr openDialogCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private OpenDialogCommandOuterClass$OpenDialogCommand() {
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
                return new OpenDialogCommandOuterClass$OpenDialogCommand();
            case 4:
                return new avtw();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (OpenDialogCommandOuterClass$OpenDialogCommand.class) {
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
        OpenDialogCommandOuterClass$OpenDialogCommand openDialogCommandOuterClass$OpenDialogCommand = new OpenDialogCommandOuterClass$OpenDialogCommand();
        c = openDialogCommandOuterClass$OpenDialogCommand;
        anxl.registerDefaultInstance(OpenDialogCommandOuterClass$OpenDialogCommand.class, openDialogCommandOuterClass$OpenDialogCommand);
        apxu apxu = apxu.d;
        OpenDialogCommandOuterClass$OpenDialogCommand openDialogCommandOuterClass$OpenDialogCommand2 = c;
        openDialogCommand = anxl.newSingularGeneratedExtension(apxu, openDialogCommandOuterClass$OpenDialogCommand2, openDialogCommandOuterClass$OpenDialogCommand2, null, 185598973, aobm.MESSAGE, OpenDialogCommandOuterClass$OpenDialogCommand.class);
    }
}
