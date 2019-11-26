package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axhp;

public final class ShareEndpointOuterClass$ShareEntityEndpoint extends anxl implements anzf {
    public static final ShareEndpointOuterClass$ShareEntityEndpoint d;
    private static volatile anzq e;
    public static final anxr shareEntityEndpoint;
    public int a;
    public String b;
    public String c;

    private ShareEndpointOuterClass$ShareEntityEndpoint() {
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
                return new ShareEndpointOuterClass$ShareEntityEndpoint();
            case 4:
                return new axhp();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShareEndpointOuterClass$ShareEntityEndpoint.class) {
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
        ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = new ShareEndpointOuterClass$ShareEntityEndpoint();
        d = shareEndpointOuterClass$ShareEntityEndpoint;
        anxl.registerDefaultInstance(ShareEndpointOuterClass$ShareEntityEndpoint.class, shareEndpointOuterClass$ShareEntityEndpoint);
        apxu apxu = apxu.d;
        ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint2 = d;
        shareEntityEndpoint = anxl.newSingularGeneratedExtension(apxu, shareEndpointOuterClass$ShareEntityEndpoint2, shareEndpointOuterClass$ShareEntityEndpoint2, null, 90650344, aobm.MESSAGE, ShareEndpointOuterClass$ShareEntityEndpoint.class);
    }
}
