package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aurb;
import defpackage.autt;

public final class MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint extends anxl implements anzf {
    public static final MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint c;
    private static volatile anzq d;
    public static final anxr mdxConnectNavigationEndpoint;
    public int a;
    public autt b;

    private MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t\u0001", new Object[]{"a", "b"});
            case 3:
                return new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
            case 4:
                return new aurb();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class) {
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
        MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint = new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
        c = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;
        anxl.registerDefaultInstance(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class, mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint);
        apxu apxu = apxu.d;
        MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint2 = c;
        mdxConnectNavigationEndpoint = anxl.newSingularGeneratedExtension(apxu, mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint2, mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint2, null, 119886855, aobm.MESSAGE, MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class);
    }
}
