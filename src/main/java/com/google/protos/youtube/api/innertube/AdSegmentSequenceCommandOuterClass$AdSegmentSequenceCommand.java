package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aogv;
import defpackage.aokg;
import defpackage.apxu;

public final class AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand extends anxl implements anzf {
    public static final anxr adSegmentSequenceCommand;
    public static final AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001", new Object[]{"a", "b", aogv.a, "c"});
            case 3:
                return new AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand();
            case 4:
                return new aokg();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand.class) {
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
        AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand adSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand = new AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand();
        d = adSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand;
        anxl.registerDefaultInstance(AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand.class, adSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand);
        apxu apxu = apxu.d;
        AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand adSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand2 = d;
        adSegmentSequenceCommand = anxl.newSingularGeneratedExtension(apxu, adSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand2, adSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand2, null, 184568622, aobm.MESSAGE, AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand.class);
    }
}
