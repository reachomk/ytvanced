package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axbc;

public final class ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint extends anxl implements anzf {
    public static final ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint a;
    private static volatile anzq c;
    public static final anxr resumeSearchHistoryEndpoint;
    private byte b = (byte) 2;

    private ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint() {
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
                return new ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint();
            case 4:
                return new axbc();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint.class) {
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
        ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint resumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint = new ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint();
        a = resumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint;
        anxl.registerDefaultInstance(ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint.class, resumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint);
        apxu apxu = apxu.d;
        ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint resumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint2 = a;
        resumeSearchHistoryEndpoint = anxl.newSingularGeneratedExtension(apxu, resumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint2, resumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint2, null, 69871316, aobm.MESSAGE, ResumeSearchHistoryEndpointOuterClass$ResumeSearchHistoryEndpoint.class);
    }
}
