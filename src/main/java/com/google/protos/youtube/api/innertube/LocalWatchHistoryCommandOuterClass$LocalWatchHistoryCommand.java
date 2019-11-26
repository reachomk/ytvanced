package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aujx;
import defpackage.aujy;

public final class LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand extends anxl implements anzf {
    public static final LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand d;
    private static volatile anzq e;
    public static final anxr localWatchHistoryCommand;
    public int a;
    public int b;
    public String c = "";

    private LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001", new Object[]{"a", "b", aujy.a, "c"});
            case 3:
                return new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
            case 4:
                return new aujx();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class) {
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
        LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand = new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
        d = localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
        anxl.registerDefaultInstance(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class, localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand);
        apxu apxu = apxu.d;
        LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand2 = d;
        localWatchHistoryCommand = anxl.newSingularGeneratedExtension(apxu, localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand2, localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand2, null, 246157926, aobm.MESSAGE, LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class);
    }
}
