package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azmv;

public final class YpcGetOffersEndpoint$YPCGetOffersEndpoint extends anxl implements anzf {
    public static final YpcGetOffersEndpoint$YPCGetOffersEndpoint a;
    private static volatile anzq c;
    public static final anxr ypcGetOffersEndpoint;
    private byte b = (byte) 2;

    private YpcGetOffersEndpoint$YPCGetOffersEndpoint() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                if (obj != null) {
                    b = (byte) 1;
                }
                this.b = b;
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new YpcGetOffersEndpoint$YPCGetOffersEndpoint();
            case 4:
                return new azmv();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (YpcGetOffersEndpoint$YPCGetOffersEndpoint.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        YpcGetOffersEndpoint$YPCGetOffersEndpoint ypcGetOffersEndpoint$YPCGetOffersEndpoint = new YpcGetOffersEndpoint$YPCGetOffersEndpoint();
        a = ypcGetOffersEndpoint$YPCGetOffersEndpoint;
        anxl.registerDefaultInstance(YpcGetOffersEndpoint$YPCGetOffersEndpoint.class, ypcGetOffersEndpoint$YPCGetOffersEndpoint);
        apxu apxu = apxu.d;
        YpcGetOffersEndpoint$YPCGetOffersEndpoint ypcGetOffersEndpoint$YPCGetOffersEndpoint2 = a;
        ypcGetOffersEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcGetOffersEndpoint$YPCGetOffersEndpoint2, ypcGetOffersEndpoint$YPCGetOffersEndpoint2, null, 89109416, aobm.MESSAGE, YpcGetOffersEndpoint$YPCGetOffersEndpoint.class);
    }
}
