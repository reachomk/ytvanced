package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azmw;

public final class YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint extends anxl implements anzf {
    public static final YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint c;
    private static volatile anzq d;
    public static final anxr ypcGetOfflineUpsellEndpoint;
    public int a;
    public String b = "";

    private YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint() {
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
                return new YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint();
            case 4:
                return new azmw();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.class) {
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
        YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint = new YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint();
        c = ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
        anxl.registerDefaultInstance(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.class, ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint);
        apxu apxu = apxu.d;
        YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint2 = c;
        ypcGetOfflineUpsellEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint2, ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint2, null, 133724106, aobm.MESSAGE, YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.class);
    }
}
