package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awzf;

public final class RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand extends anxl implements anzf {
    public static final RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand c;
    private static volatile anzq d;
    public static final anxr refreshAccountLinkButtonCommand;
    public int a;
    public String b = "";

    private RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand() {
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
                return new RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand();
            case 4:
                return new awzf();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand.class) {
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
        RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand refreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand = new RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand();
        c = refreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand;
        anxl.registerDefaultInstance(RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand.class, refreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand);
        apxu apxu = apxu.d;
        RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand refreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand2 = c;
        refreshAccountLinkButtonCommand = anxl.newSingularGeneratedExtension(apxu, refreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand2, refreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand2, null, 196919351, aobm.MESSAGE, RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand.class);
    }
}
