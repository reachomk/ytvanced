package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyy;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axnr;
import defpackage.axns;

public final class SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand extends anxl implements anzf {
    public static final SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand d;
    private static volatile anzq e;
    public static final anxr silentSubmitUserFeedbackCommand;
    public int a;
    public String b = "";
    public anyy c = anyy.b;

    private SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\b\u0000\u00022", new Object[]{"a", "b", "c", axns.a});
            case 3:
                return new SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand();
            case 4:
                return new axnr();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.class) {
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
        SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand = new SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand();
        d = silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand;
        anxl.registerDefaultInstance(SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.class, silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand);
        apxu apxu = apxu.d;
        SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand2 = d;
        silentSubmitUserFeedbackCommand = anxl.newSingularGeneratedExtension(apxu, silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand2, silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand2, null, 193239995, aobm.MESSAGE, SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.class);
    }
}
