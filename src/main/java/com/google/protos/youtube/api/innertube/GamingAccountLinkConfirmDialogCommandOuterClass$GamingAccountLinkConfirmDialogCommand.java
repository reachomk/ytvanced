package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aron;
import defpackage.axak;

public final class GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand extends anxl implements anzf {
    public static final GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand c;
    private static volatile anzq e;
    public static final anxr gamingAccountLinkConfirmDialogCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand() {
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
                return new GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand();
            case 4:
                return new aron();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.class) {
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
        GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand = new GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand();
        c = gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand;
        anxl.registerDefaultInstance(GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.class, gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand);
        apxu apxu = apxu.d;
        GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand2 = c;
        gamingAccountLinkConfirmDialogCommand = anxl.newSingularGeneratedExtension(apxu, gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand2, gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand2, null, 194168203, aobm.MESSAGE, GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.class);
    }
}
