package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azod;

public final class YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand extends anxl implements anzf {
    public static final YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand d;
    private static volatile anzq e;
    public static final anxr ypcPauseSubscriptionCommand;
    public int a;
    public String b = "";
    public anvu c = anvu.a;

    private YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand();
            case 4:
                return new azod();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand = new YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand();
        d = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand;
        anxl.registerDefaultInstance(YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class, ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand);
        apxu apxu = apxu.d;
        YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand2 = d;
        ypcPauseSubscriptionCommand = anxl.newSingularGeneratedExtension(apxu, ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand2, ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand2, null, 191762785, aobm.MESSAGE, YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class);
    }
}
