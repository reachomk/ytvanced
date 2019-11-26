package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axho;
import defpackage.axhx;

public final class ShareEndpointOuterClass$ShareEndpoint extends anxl implements anzf {
    public static final ShareEndpointOuterClass$ShareEndpoint e;
    private static volatile anzq g;
    public static final anxr shareEndpoint;
    public int a;
    public String b;
    public String c;
    public axhx d;
    private byte f = (byte) 2;

    private ShareEndpointOuterClass$ShareEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\b\u0000\u0002\b\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ShareEndpointOuterClass$ShareEndpoint();
            case 4:
                return new axho();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ShareEndpointOuterClass$ShareEndpoint.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ShareEndpointOuterClass$ShareEndpoint shareEndpointOuterClass$ShareEndpoint = new ShareEndpointOuterClass$ShareEndpoint();
        e = shareEndpointOuterClass$ShareEndpoint;
        anxl.registerDefaultInstance(ShareEndpointOuterClass$ShareEndpoint.class, shareEndpointOuterClass$ShareEndpoint);
        apxu apxu = apxu.d;
        ShareEndpointOuterClass$ShareEndpoint shareEndpointOuterClass$ShareEndpoint2 = e;
        shareEndpoint = anxl.newSingularGeneratedExtension(apxu, shareEndpointOuterClass$ShareEndpoint2, shareEndpointOuterClass$ShareEndpoint2, null, 85383280, aobm.MESSAGE, ShareEndpointOuterClass$ShareEndpoint.class);
    }
}
