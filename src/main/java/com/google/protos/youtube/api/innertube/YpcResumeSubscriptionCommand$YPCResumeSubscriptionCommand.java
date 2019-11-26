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
import defpackage.azou;

public final class YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand extends anxl implements anzf {
    public static final YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand d;
    private static volatile anzq e;
    public static final anxr ypcResumeSubscriptionCommand;
    public int a;
    public String b = "";
    public anvu c = anvu.a;

    private YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand() {
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
                return new YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand();
            case 4:
                return new azou();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class) {
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
        YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand = new YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand();
        d = ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand;
        anxl.registerDefaultInstance(YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class, ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand);
        apxu apxu = apxu.d;
        YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand2 = d;
        ypcResumeSubscriptionCommand = anxl.newSingularGeneratedExtension(apxu, ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand2, ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand2, null, 191943580, aobm.MESSAGE, YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class);
    }
}
