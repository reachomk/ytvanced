package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axmn;

public final class ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand extends anxl implements anzf {
    public static final ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand c;
    private static volatile anzq e;
    public static final anxr showSponsorshipsDialogCommand;
    public int a;
    public apxu b;
    private byte d = (byte) 2;

    private ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand();
            case 4:
                return new axmn();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class) {
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
        ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand = new ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand();
        c = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand;
        anxl.registerDefaultInstance(ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class, showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand);
        apxu apxu = apxu.d;
        ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand2 = c;
        showSponsorshipsDialogCommand = anxl.newSingularGeneratedExtension(apxu, showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand2, showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand2, null, 209133170, aobm.MESSAGE, ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class);
    }
}
