package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avuz;

public final class PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint extends anxl implements anzf {
    public static final PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint a;
    private static volatile anzq c;
    public static final anxr pauseSearchHistoryEndpoint;
    private byte b = (byte) 2;

    private PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint() {
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
                return new PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint();
            case 4:
                return new avuz();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint.class) {
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
        PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint pauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint = new PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint();
        a = pauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint;
        anxl.registerDefaultInstance(PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint.class, pauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint);
        apxu apxu = apxu.d;
        PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint pauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint2 = a;
        pauseSearchHistoryEndpoint = anxl.newSingularGeneratedExtension(apxu, pauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint2, pauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint2, null, 69875349, aobm.MESSAGE, PauseSearchHistoryEndpointOuterClass$PauseSearchHistoryEndpoint.class);
    }
}
