package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avvb;

public final class PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint extends anxl implements anzf {
    public static final PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint a;
    private static volatile anzq c;
    public static final anxr pauseWatchHistoryEndpoint;
    private byte b = (byte) 2;

    private PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint() {
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
                return new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
            case 4:
                return new avvb();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class) {
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
        PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint = new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
        a = pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint;
        anxl.registerDefaultInstance(PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class, pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint);
        apxu apxu = apxu.d;
        PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint2 = a;
        pauseWatchHistoryEndpoint = anxl.newSingularGeneratedExtension(apxu, pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint2, pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint2, null, 63121553, aobm.MESSAGE, PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class);
    }
}
