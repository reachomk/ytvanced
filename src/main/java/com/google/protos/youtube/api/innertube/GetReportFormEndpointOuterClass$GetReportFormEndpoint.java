package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arre;

public final class GetReportFormEndpointOuterClass$GetReportFormEndpoint extends anxl implements anzf {
    public static final GetReportFormEndpointOuterClass$GetReportFormEndpoint c;
    private static volatile anzq d;
    public static final anxr getReportFormEndpoint;
    public int a;
    public String b = "";

    private GetReportFormEndpointOuterClass$GetReportFormEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new GetReportFormEndpointOuterClass$GetReportFormEndpoint();
            case 4:
                return new arre();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (GetReportFormEndpointOuterClass$GetReportFormEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        GetReportFormEndpointOuterClass$GetReportFormEndpoint getReportFormEndpointOuterClass$GetReportFormEndpoint = new GetReportFormEndpointOuterClass$GetReportFormEndpoint();
        c = getReportFormEndpointOuterClass$GetReportFormEndpoint;
        anxl.registerDefaultInstance(GetReportFormEndpointOuterClass$GetReportFormEndpoint.class, getReportFormEndpointOuterClass$GetReportFormEndpoint);
        apxu apxu = apxu.d;
        GetReportFormEndpointOuterClass$GetReportFormEndpoint getReportFormEndpointOuterClass$GetReportFormEndpoint2 = c;
        getReportFormEndpoint = anxl.newSingularGeneratedExtension(apxu, getReportFormEndpointOuterClass$GetReportFormEndpoint2, getReportFormEndpointOuterClass$GetReportFormEndpoint2, null, 113762617, aobm.MESSAGE, GetReportFormEndpointOuterClass$GetReportFormEndpoint.class);
    }
}
