package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aukn;

public final class LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand extends anxl implements anzf {
    public static final LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand c;
    private static volatile anzq d;
    public static final anxr logYpcFlowStartCommand;
    public int a = 0;
    public Object b;

    private LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand() {
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
                return new LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand();
            case 4:
                return new aukn();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class) {
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
        LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand = new LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand();
        c = logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand;
        anxl.registerDefaultInstance(LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class, logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand);
        apxu apxu = apxu.d;
        LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand2 = c;
        logYpcFlowStartCommand = anxl.newSingularGeneratedExtension(apxu, logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand2, logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand2, null, 191342865, aobm.MESSAGE, LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class);
    }
}
