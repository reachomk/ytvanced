package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apud;
import defpackage.apxu;

public final class ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint extends anxl implements anzf {
    public static final ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint a;
    private static volatile anzq c;
    public static final anxr clearSearchHistoryEndpoint;
    private byte b = (byte) 2;

    private ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint() {
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
                return new ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint();
            case 4:
                return new apud();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint.class) {
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
        ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint clearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint = new ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint();
        a = clearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint;
        anxl.registerDefaultInstance(ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint.class, clearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint);
        apxu apxu = apxu.d;
        ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint clearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint2 = a;
        clearSearchHistoryEndpoint = anxl.newSingularGeneratedExtension(apxu, clearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint2, clearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint2, null, 69943289, aobm.MESSAGE, ClearSearchHistoryEndpointOuterClass$ClearSearchHistoryEndpoint.class);
    }
}
