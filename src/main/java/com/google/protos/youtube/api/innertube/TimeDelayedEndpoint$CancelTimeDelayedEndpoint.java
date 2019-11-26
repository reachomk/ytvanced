package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayhb;

public final class TimeDelayedEndpoint$CancelTimeDelayedEndpoint extends anxl implements anzf {
    public static final TimeDelayedEndpoint$CancelTimeDelayedEndpoint c;
    public static final anxr cancelTimeDelayedEndpoint;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private TimeDelayedEndpoint$CancelTimeDelayedEndpoint() {
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
                return new TimeDelayedEndpoint$CancelTimeDelayedEndpoint();
            case 4:
                return new ayhb();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (TimeDelayedEndpoint$CancelTimeDelayedEndpoint.class) {
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
        TimeDelayedEndpoint$CancelTimeDelayedEndpoint timeDelayedEndpoint$CancelTimeDelayedEndpoint = new TimeDelayedEndpoint$CancelTimeDelayedEndpoint();
        c = timeDelayedEndpoint$CancelTimeDelayedEndpoint;
        anxl.registerDefaultInstance(TimeDelayedEndpoint$CancelTimeDelayedEndpoint.class, timeDelayedEndpoint$CancelTimeDelayedEndpoint);
        apxu apxu = apxu.d;
        TimeDelayedEndpoint$CancelTimeDelayedEndpoint timeDelayedEndpoint$CancelTimeDelayedEndpoint2 = c;
        cancelTimeDelayedEndpoint = anxl.newSingularGeneratedExtension(apxu, timeDelayedEndpoint$CancelTimeDelayedEndpoint2, timeDelayedEndpoint$CancelTimeDelayedEndpoint2, null, 166907542, aobm.MESSAGE, TimeDelayedEndpoint$CancelTimeDelayedEndpoint.class);
    }
}
