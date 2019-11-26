package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axht;

public final class SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint extends anxl implements anzf {
    public static final SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint d;
    private static volatile anzq f;
    public static final anxr sharePrivateVideoEndpoint;
    public int a;
    public String b = "";
    public apxu c;
    private byte e = (byte) 2;

    private SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
            case 4:
                return new axht();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint = new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
        d = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
        anxl.registerDefaultInstance(SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint);
        apxu apxu = apxu.d;
        SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint2 = d;
        sharePrivateVideoEndpoint = anxl.newSingularGeneratedExtension(apxu, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint2, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint2, null, 117735229, aobm.MESSAGE, SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class);
    }
}
