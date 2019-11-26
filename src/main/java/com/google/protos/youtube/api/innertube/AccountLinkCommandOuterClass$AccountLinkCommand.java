package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aoeb;
import defpackage.apxu;

public final class AccountLinkCommandOuterClass$AccountLinkCommand extends anxl implements anzf {
    public static final anxr accountLinkCommand;
    public static final AccountLinkCommandOuterClass$AccountLinkCommand f;
    private static volatile anzq h;
    public int a;
    public apxu b;
    public apxu c;
    public String d = "";
    public apxu e;
    private byte g = (byte) 2;

    private AccountLinkCommandOuterClass$AccountLinkCommand() {
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
                return new AccountLinkCommandOuterClass$AccountLinkCommand();
            case 4:
                return new aoeb();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (AccountLinkCommandOuterClass$AccountLinkCommand.class) {
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
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = new AccountLinkCommandOuterClass$AccountLinkCommand();
        f = accountLinkCommandOuterClass$AccountLinkCommand;
        anxl.registerDefaultInstance(AccountLinkCommandOuterClass$AccountLinkCommand.class, accountLinkCommandOuterClass$AccountLinkCommand);
        apxu apxu = apxu.d;
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand2 = f;
        accountLinkCommand = anxl.newSingularGeneratedExtension(apxu, accountLinkCommandOuterClass$AccountLinkCommand2, accountLinkCommandOuterClass$AccountLinkCommand2, null, 194259413, aobm.MESSAGE, AccountLinkCommandOuterClass$AccountLinkCommand.class);
    }
}
