package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqdk;

public final class CommitVideoEndpointOuterClass$CommitVideoEndpoint extends anxl implements anzf {
    public static final CommitVideoEndpointOuterClass$CommitVideoEndpoint a;
    private static volatile anzq b;
    public static final anxr commitVideoEndpoint;

    private CommitVideoEndpointOuterClass$CommitVideoEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new CommitVideoEndpointOuterClass$CommitVideoEndpoint();
            case 4:
                return new aqdk();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (CommitVideoEndpointOuterClass$CommitVideoEndpoint.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        CommitVideoEndpointOuterClass$CommitVideoEndpoint commitVideoEndpointOuterClass$CommitVideoEndpoint = new CommitVideoEndpointOuterClass$CommitVideoEndpoint();
        a = commitVideoEndpointOuterClass$CommitVideoEndpoint;
        anxl.registerDefaultInstance(CommitVideoEndpointOuterClass$CommitVideoEndpoint.class, commitVideoEndpointOuterClass$CommitVideoEndpoint);
        apxu apxu = apxu.d;
        CommitVideoEndpointOuterClass$CommitVideoEndpoint commitVideoEndpointOuterClass$CommitVideoEndpoint2 = a;
        commitVideoEndpoint = anxl.newSingularGeneratedExtension(apxu, commitVideoEndpointOuterClass$CommitVideoEndpoint2, commitVideoEndpointOuterClass$CommitVideoEndpoint2, null, 69321641, aobm.MESSAGE, CommitVideoEndpointOuterClass$CommitVideoEndpoint.class);
    }
}
