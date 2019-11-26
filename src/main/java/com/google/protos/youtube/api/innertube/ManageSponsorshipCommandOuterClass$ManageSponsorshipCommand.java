package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aumu;

public final class ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand extends anxl implements anzf {
    public static final ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand c;
    private static volatile anzq d;
    public static final anxr manageSponsorshipCommand;
    public int a;
    public String b = "";

    private ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand();
            case 4:
                return new aumu();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand manageSponsorshipCommandOuterClass$ManageSponsorshipCommand = new ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand();
        c = manageSponsorshipCommandOuterClass$ManageSponsorshipCommand;
        anxl.registerDefaultInstance(ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand.class, manageSponsorshipCommandOuterClass$ManageSponsorshipCommand);
        apxu apxu = apxu.d;
        ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand manageSponsorshipCommandOuterClass$ManageSponsorshipCommand2 = c;
        manageSponsorshipCommand = anxl.newSingularGeneratedExtension(apxu, manageSponsorshipCommandOuterClass$ManageSponsorshipCommand2, manageSponsorshipCommandOuterClass$ManageSponsorshipCommand2, null, 182757470, aobm.MESSAGE, ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand.class);
    }
}
