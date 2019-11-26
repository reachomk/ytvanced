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
import defpackage.ayrj;

public final class UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand extends anxl implements anzf {
    public static final UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand c;
    private static volatile anzq e;
    public static final anxr updateAccountLinkButtonCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand() {
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
                return new UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand();
            case 4:
                return new ayrj();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand.class) {
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
        UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand updateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand = new UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand();
        c = updateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand;
        anxl.registerDefaultInstance(UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand.class, updateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand);
        apxu apxu = apxu.d;
        UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand updateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand2 = c;
        updateAccountLinkButtonCommand = anxl.newSingularGeneratedExtension(apxu, updateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand2, updateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand2, null, 195480154, aobm.MESSAGE, UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand.class);
    }
}
