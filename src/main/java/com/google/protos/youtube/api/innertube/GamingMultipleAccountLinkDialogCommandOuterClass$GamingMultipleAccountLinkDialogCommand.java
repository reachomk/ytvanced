package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arpr;
import defpackage.axak;

public final class GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand extends anxl implements anzf {
    public static final GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand c;
    private static volatile anzq e;
    public static final anxr gamingMultipleAccountLinkDialogCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand() {
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
                return new GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand();
            case 4:
                return new arpr();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand.class) {
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
        GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand gamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand = new GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand();
        c = gamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand;
        anxl.registerDefaultInstance(GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand.class, gamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand);
        apxu apxu = apxu.d;
        GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand gamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand2 = c;
        gamingMultipleAccountLinkDialogCommand = anxl.newSingularGeneratedExtension(apxu, gamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand2, gamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand2, null, 203397981, aobm.MESSAGE, GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand.class);
    }
}
