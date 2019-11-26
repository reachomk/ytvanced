package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azmy;
import defpackage.azmz;

public final class YpcOffersEndpoint$YPCOffersEndpoint extends anxl implements anzf {
    public static final YpcOffersEndpoint$YPCOffersEndpoint d;
    private static volatile anzq f;
    public static final anxr ypcOffersEndpoint;
    public int a;
    public String b = "";
    public azmy c;
    private byte e = (byte) 2;

    private YpcOffersEndpoint$YPCOffersEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001⩻\u0002\u0000\u0000\u0001\u0001\b\u0000⩻Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new YpcOffersEndpoint$YPCOffersEndpoint();
            case 4:
                return new azmz();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (YpcOffersEndpoint$YPCOffersEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        YpcOffersEndpoint$YPCOffersEndpoint ypcOffersEndpoint$YPCOffersEndpoint = new YpcOffersEndpoint$YPCOffersEndpoint();
        d = ypcOffersEndpoint$YPCOffersEndpoint;
        anxl.registerDefaultInstance(YpcOffersEndpoint$YPCOffersEndpoint.class, ypcOffersEndpoint$YPCOffersEndpoint);
        apxu apxu = apxu.d;
        YpcOffersEndpoint$YPCOffersEndpoint ypcOffersEndpoint$YPCOffersEndpoint2 = d;
        ypcOffersEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcOffersEndpoint$YPCOffersEndpoint2, ypcOffersEndpoint$YPCOffersEndpoint2, null, 64681250, aobm.MESSAGE, YpcOffersEndpoint$YPCOffersEndpoint.class);
    }
}
