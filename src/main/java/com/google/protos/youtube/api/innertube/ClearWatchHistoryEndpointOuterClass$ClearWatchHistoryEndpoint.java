package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apuf;
import defpackage.apxu;

public final class ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint extends anxl implements anzf {
    public static final ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint b;
    public static final anxr clearWatchHistoryEndpoint;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", apxu.class});
            case 3:
                return new ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint();
            case 4:
                return new apuf();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint = new ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint();
        b = clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;
        anxl.registerDefaultInstance(ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.class, clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint);
        apxu apxu = apxu.d;
        ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint2 = b;
        clearWatchHistoryEndpoint = anxl.newSingularGeneratedExtension(apxu, clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint2, clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint2, null, 63121550, aobm.MESSAGE, ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.class);
    }
}
