package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azpr;

public final class YpcUpdateFopEndpoint$YPCUpdateFopEndpoint extends anxl implements anzf {
    public static final YpcUpdateFopEndpoint$YPCUpdateFopEndpoint c;
    private static volatile anzq d;
    public static final anxr ypcUpdateFopEndpoint;
    public int a;
    public String b = "";

    private YpcUpdateFopEndpoint$YPCUpdateFopEndpoint() {
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
                return new YpcUpdateFopEndpoint$YPCUpdateFopEndpoint();
            case 4:
                return new azpr();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.class) {
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
        YpcUpdateFopEndpoint$YPCUpdateFopEndpoint ypcUpdateFopEndpoint$YPCUpdateFopEndpoint = new YpcUpdateFopEndpoint$YPCUpdateFopEndpoint();
        c = ypcUpdateFopEndpoint$YPCUpdateFopEndpoint;
        anxl.registerDefaultInstance(YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.class, ypcUpdateFopEndpoint$YPCUpdateFopEndpoint);
        apxu apxu = apxu.d;
        YpcUpdateFopEndpoint$YPCUpdateFopEndpoint ypcUpdateFopEndpoint$YPCUpdateFopEndpoint2 = c;
        ypcUpdateFopEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcUpdateFopEndpoint$YPCUpdateFopEndpoint2, ypcUpdateFopEndpoint$YPCUpdateFopEndpoint2, null, 151765852, aobm.MESSAGE, YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.class);
    }
}
