package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awve;

public final class RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand extends anxl implements anzf {
    public static final RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand a;
    private static volatile anzq b;
    public static final anxr recordStreamEventsCommand;

    private RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand() {
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
                return new RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand();
            case 4:
                return new awve();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.class) {
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
        RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand = new RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand();
        a = recordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
        anxl.registerDefaultInstance(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.class, recordStreamEventsCommandOuterClass$RecordStreamEventsCommand);
        apxu apxu = apxu.d;
        RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand2 = a;
        recordStreamEventsCommand = anxl.newSingularGeneratedExtension(apxu, recordStreamEventsCommandOuterClass$RecordStreamEventsCommand2, recordStreamEventsCommandOuterClass$RecordStreamEventsCommand2, null, 191776071, aobm.MESSAGE, RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.class);
    }
}
