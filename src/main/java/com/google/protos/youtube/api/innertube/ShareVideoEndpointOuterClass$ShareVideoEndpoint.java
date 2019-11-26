package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axhw;

public final class ShareVideoEndpointOuterClass$ShareVideoEndpoint extends anxl implements anzf {
    public static final ShareVideoEndpointOuterClass$ShareVideoEndpoint d;
    private static volatile anzq e;
    public static final anxr shareVideoEndpoint;
    public int a;
    public String b;
    public String c;

    private ShareVideoEndpointOuterClass$ShareVideoEndpoint() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new ShareVideoEndpointOuterClass$ShareVideoEndpoint();
            case 4:
                return new axhw();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShareVideoEndpointOuterClass$ShareVideoEndpoint.class) {
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
        ShareVideoEndpointOuterClass$ShareVideoEndpoint shareVideoEndpointOuterClass$ShareVideoEndpoint = new ShareVideoEndpointOuterClass$ShareVideoEndpoint();
        d = shareVideoEndpointOuterClass$ShareVideoEndpoint;
        anxl.registerDefaultInstance(ShareVideoEndpointOuterClass$ShareVideoEndpoint.class, shareVideoEndpointOuterClass$ShareVideoEndpoint);
        apxu apxu = apxu.d;
        ShareVideoEndpointOuterClass$ShareVideoEndpoint shareVideoEndpointOuterClass$ShareVideoEndpoint2 = d;
        shareVideoEndpoint = anxl.newSingularGeneratedExtension(apxu, shareVideoEndpointOuterClass$ShareVideoEndpoint2, shareVideoEndpointOuterClass$ShareVideoEndpoint2, null, 73844178, aobm.MESSAGE, ShareVideoEndpointOuterClass$ShareVideoEndpoint.class);
    }
}
