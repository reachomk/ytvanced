package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axhr;

public final class SharePlaylistEndpointOuterClass$SharePlaylistEndpoint extends anxl implements anzf {
    public static final SharePlaylistEndpointOuterClass$SharePlaylistEndpoint d;
    private static volatile anzq e;
    public static final anxr sharePlaylistEndpoint;
    public int a;
    public String b;
    public String c;

    private SharePlaylistEndpointOuterClass$SharePlaylistEndpoint() {
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
                return new SharePlaylistEndpointOuterClass$SharePlaylistEndpoint();
            case 4:
                return new axhr();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class) {
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
        SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint = new SharePlaylistEndpointOuterClass$SharePlaylistEndpoint();
        d = sharePlaylistEndpointOuterClass$SharePlaylistEndpoint;
        anxl.registerDefaultInstance(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint);
        apxu apxu = apxu.d;
        SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint2 = d;
        sharePlaylistEndpoint = anxl.newSingularGeneratedExtension(apxu, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint2, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint2, null, 73844191, aobm.MESSAGE, SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class);
    }
}
