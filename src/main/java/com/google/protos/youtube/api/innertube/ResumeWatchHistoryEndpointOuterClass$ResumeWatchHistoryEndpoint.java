package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axbd;

public final class ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint extends anxl implements anzf {
    public static final ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint a;
    private static volatile anzq c;
    public static final anxr resumeWatchHistoryEndpoint;
    private byte b = (byte) 2;

    private ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint() {
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
                return new ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint();
            case 4:
                return new axbd();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class) {
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
        ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint = new ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint();
        a = resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint;
        anxl.registerDefaultInstance(ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class, resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint);
        apxu apxu = apxu.d;
        ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint2 = a;
        resumeWatchHistoryEndpoint = anxl.newSingularGeneratedExtension(apxu, resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint2, resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint2, null, 63121560, aobm.MESSAGE, ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class);
    }
}
