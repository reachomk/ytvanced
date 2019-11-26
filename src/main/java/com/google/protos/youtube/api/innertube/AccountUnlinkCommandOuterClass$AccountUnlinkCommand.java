package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aoel;
import defpackage.apxu;

public final class AccountUnlinkCommandOuterClass$AccountUnlinkCommand extends anxl implements anzf {
    public static final anxr accountUnlinkCommand;
    public static final AccountUnlinkCommandOuterClass$AccountUnlinkCommand f;
    private static volatile anzq h;
    public int a;
    public apxu b;
    public apxu c;
    public String d = "";
    public apxu e;
    private byte g = (byte) 2;

    private AccountUnlinkCommandOuterClass$AccountUnlinkCommand() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003\b\u0002\u0004Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
            case 4:
                return new aoel();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class) {
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
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
        f = accountUnlinkCommandOuterClass$AccountUnlinkCommand;
        anxl.registerDefaultInstance(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class, accountUnlinkCommandOuterClass$AccountUnlinkCommand);
        apxu apxu = apxu.d;
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand2 = f;
        accountUnlinkCommand = anxl.newSingularGeneratedExtension(apxu, accountUnlinkCommandOuterClass$AccountUnlinkCommand2, accountUnlinkCommandOuterClass$AccountUnlinkCommand2, null, 194259476, aobm.MESSAGE, AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class);
    }
}
