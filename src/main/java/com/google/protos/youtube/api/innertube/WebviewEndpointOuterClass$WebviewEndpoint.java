package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azke;

public final class WebviewEndpointOuterClass$WebviewEndpoint extends anxl implements anzf {
    public static final WebviewEndpointOuterClass$WebviewEndpoint e;
    private static volatile anzq g;
    public static final anxr webviewEndpoint;
    public int a;
    public String b = "";
    public apxu c;
    public boolean d;
    private byte f = (byte) 2;

    private WebviewEndpointOuterClass$WebviewEndpoint() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\b\u0000\u0003Љ\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new WebviewEndpointOuterClass$WebviewEndpoint();
            case 4:
                return new azke();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (WebviewEndpointOuterClass$WebviewEndpoint.class) {
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
        WebviewEndpointOuterClass$WebviewEndpoint webviewEndpointOuterClass$WebviewEndpoint = new WebviewEndpointOuterClass$WebviewEndpoint();
        e = webviewEndpointOuterClass$WebviewEndpoint;
        anxl.registerDefaultInstance(WebviewEndpointOuterClass$WebviewEndpoint.class, webviewEndpointOuterClass$WebviewEndpoint);
        apxu apxu = apxu.d;
        WebviewEndpointOuterClass$WebviewEndpoint webviewEndpointOuterClass$WebviewEndpoint2 = e;
        webviewEndpoint = anxl.newSingularGeneratedExtension(apxu, webviewEndpointOuterClass$WebviewEndpoint2, webviewEndpointOuterClass$WebviewEndpoint2, null, 77364463, aobm.MESSAGE, WebviewEndpointOuterClass$WebviewEndpoint.class);
    }
}
