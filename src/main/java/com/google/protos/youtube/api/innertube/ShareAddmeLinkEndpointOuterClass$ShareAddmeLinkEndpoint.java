package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axhn;

public final class ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint extends anxl implements anzf {
    public static final ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint a;
    private static volatile anzq b;
    public static final anxr shareAddmeLinkEndpoint;

    private ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint() {
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
                return new ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint();
            case 4:
                return new axhn();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint.class) {
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
        ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint shareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint = new ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint();
        a = shareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint;
        anxl.registerDefaultInstance(ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint.class, shareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint);
        apxu apxu = apxu.d;
        ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint shareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint2 = a;
        shareAddmeLinkEndpoint = anxl.newSingularGeneratedExtension(apxu, shareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint2, shareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint2, null, 171553850, aobm.MESSAGE, ShareAddmeLinkEndpointOuterClass$ShareAddmeLinkEndpoint.class);
    }
}
