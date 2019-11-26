package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aukl;

public final class LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand extends anxl implements anzf {
    public static final LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand c;
    private static volatile anzq d;
    public static final anxr logYpcFlowDismissCommand;
    public int a = 0;
    public Object b;

    private LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001=\u0000\u0002=\u0000\u0003=\u0000\u0004=\u0000", new Object[]{"b", "a"});
            case 3:
                return new LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand();
            case 4:
                return new aukl();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class) {
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
        LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand = new LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand();
        c = logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand;
        anxl.registerDefaultInstance(LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class, logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand);
        apxu apxu = apxu.d;
        LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand2 = c;
        logYpcFlowDismissCommand = anxl.newSingularGeneratedExtension(apxu, logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand2, logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand2, null, 192838928, aobm.MESSAGE, LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class);
    }
}
