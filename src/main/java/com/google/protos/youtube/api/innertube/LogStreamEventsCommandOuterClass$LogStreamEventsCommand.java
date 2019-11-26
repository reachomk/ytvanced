package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aukk;

public final class LogStreamEventsCommandOuterClass$LogStreamEventsCommand extends anxl implements anzf {
    public static final LogStreamEventsCommandOuterClass$LogStreamEventsCommand a;
    private static volatile anzq b;
    public static final anxr logStreamEventsCommand;

    private LogStreamEventsCommandOuterClass$LogStreamEventsCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new LogStreamEventsCommandOuterClass$LogStreamEventsCommand();
            case 4:
                return new aukk();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (LogStreamEventsCommandOuterClass$LogStreamEventsCommand.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        LogStreamEventsCommandOuterClass$LogStreamEventsCommand logStreamEventsCommandOuterClass$LogStreamEventsCommand = new LogStreamEventsCommandOuterClass$LogStreamEventsCommand();
        a = logStreamEventsCommandOuterClass$LogStreamEventsCommand;
        anxl.registerDefaultInstance(LogStreamEventsCommandOuterClass$LogStreamEventsCommand.class, logStreamEventsCommandOuterClass$LogStreamEventsCommand);
        apxu apxu = apxu.d;
        LogStreamEventsCommandOuterClass$LogStreamEventsCommand logStreamEventsCommandOuterClass$LogStreamEventsCommand2 = a;
        logStreamEventsCommand = anxl.newSingularGeneratedExtension(apxu, logStreamEventsCommandOuterClass$LogStreamEventsCommand2, logStreamEventsCommandOuterClass$LogStreamEventsCommand2, null, 191842732, aobm.MESSAGE, LogStreamEventsCommandOuterClass$LogStreamEventsCommand.class);
    }
}
