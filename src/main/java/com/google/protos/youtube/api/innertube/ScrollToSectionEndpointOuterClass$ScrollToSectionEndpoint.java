package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axcm;

public final class ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint extends anxl implements anzf {
    public static final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint d;
    private static volatile anzq e;
    public static final anxr scrollToSectionEndpoint;
    public int a;
    public String b;
    public String c;

    private ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint();
            case 4:
                return new axcm();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint = new ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint();
        d = scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
        anxl.registerDefaultInstance(ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint);
        apxu apxu = apxu.d;
        ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint2 = d;
        scrollToSectionEndpoint = anxl.newSingularGeneratedExtension(apxu, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint2, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint2, null, 135727656, aobm.MESSAGE, ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class);
    }
}
