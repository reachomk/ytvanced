package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aros;
import defpackage.axak;

public final class GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand extends anxl implements anzf {
    public static final GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand c;
    private static volatile anzq e;
    public static final anxr gamingAccountLinkSettingCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand() {
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
                return new GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand();
            case 4:
                return new aros();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class) {
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
        GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand = new GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand();
        c = gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
        anxl.registerDefaultInstance(GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class, gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand);
        apxu apxu = apxu.d;
        GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand2 = c;
        gamingAccountLinkSettingCommand = anxl.newSingularGeneratedExtension(apxu, gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand2, gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand2, null, 194162732, aobm.MESSAGE, GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class);
    }
}
