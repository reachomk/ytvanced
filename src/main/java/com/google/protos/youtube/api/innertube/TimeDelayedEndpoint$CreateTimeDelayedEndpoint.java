package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayhd;

public final class TimeDelayedEndpoint$CreateTimeDelayedEndpoint extends anxl implements anzf {
    public static final anxr createTimeDelayedEndpoint;
    public static final TimeDelayedEndpoint$CreateTimeDelayedEndpoint g;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public int c;
    public anyd d = anxl.emptyProtobufList();
    public apxu e;
    public anyd f = anxl.emptyProtobufList();
    private byte h = (byte) 2;

    private TimeDelayedEndpoint$CreateTimeDelayedEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0003\u0001\b\u0000\u0002\u0004\u0001\u0003Л\u0004Љ\u0002\u0005Л", new Object[]{"a", "b", "c", "d", apxu.class, "e", "f", apxu.class});
            case 3:
                return new TimeDelayedEndpoint$CreateTimeDelayedEndpoint();
            case 4:
                return new ayhd();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint = new TimeDelayedEndpoint$CreateTimeDelayedEndpoint();
        g = timeDelayedEndpoint$CreateTimeDelayedEndpoint;
        anxl.registerDefaultInstance(TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class, timeDelayedEndpoint$CreateTimeDelayedEndpoint);
        apxu apxu = apxu.d;
        TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint2 = g;
        createTimeDelayedEndpoint = anxl.newSingularGeneratedExtension(apxu, timeDelayedEndpoint$CreateTimeDelayedEndpoint2, timeDelayedEndpoint$CreateTimeDelayedEndpoint2, null, 165976025, aobm.MESSAGE, TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class);
    }
}
