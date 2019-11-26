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
import defpackage.azob;

public final class YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand extends anxl implements anzf {
    public static final YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand c;
    private static volatile anzq e;
    public static final anxr ypcPauseMembershipDialogCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand() {
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
                return new YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand();
            case 4:
                return new azob();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.class) {
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
        YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand = new YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand();
        c = ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand;
        anxl.registerDefaultInstance(YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.class, ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand);
        apxu apxu = apxu.d;
        YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand2 = c;
        ypcPauseMembershipDialogCommand = anxl.newSingularGeneratedExtension(apxu, ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand2, ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand2, null, 215581778, aobm.MESSAGE, YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.class);
    }
}
