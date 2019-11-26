package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awna;

public final class PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint extends anxl implements anzf {
    public static final PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint c;
    private static volatile anzq d;
    public static final anxr prefetchSharePanelEndpoint;
    public int a;
    public String b = "";

    private PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint() {
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
                return new PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint();
            case 4:
                return new awna();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class) {
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
        PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint = new PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint();
        c = prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
        anxl.registerDefaultInstance(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class, prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint);
        apxu apxu = apxu.d;
        PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint2 = c;
        prefetchSharePanelEndpoint = anxl.newSingularGeneratedExtension(apxu, prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint2, prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint2, null, 116980193, aobm.MESSAGE, PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class);
    }
}
