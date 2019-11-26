package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avtx;

public final class OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint extends anxl implements anzf {
    public static final OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint a;
    private static volatile anzq b;
    public static final anxr openSourceLicensesEndpoint;

    private OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint() {
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
                return new OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint();
            case 4:
                return new avtx();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class) {
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
        OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint = new OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint();
        a = openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint;
        anxl.registerDefaultInstance(OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class, openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint);
        apxu apxu = apxu.d;
        OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint2 = a;
        openSourceLicensesEndpoint = anxl.newSingularGeneratedExtension(apxu, openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint2, openSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint2, null, 102687288, aobm.MESSAGE, OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class);
    }
}
