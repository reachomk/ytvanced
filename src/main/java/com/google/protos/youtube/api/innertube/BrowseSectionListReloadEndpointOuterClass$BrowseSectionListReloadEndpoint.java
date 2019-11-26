package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apgq;
import defpackage.apgr;
import defpackage.apxu;

public final class BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint extends anxl implements anzf {
    public static final anxr browseSectionListReloadEndpoint;
    public static final BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint c;
    private static volatile anzq e;
    public int a;
    public apgq b;
    private byte d = (byte) 2;

    private BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint();
            case 4:
                return new apgr();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint = new BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint();
        c = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
        anxl.registerDefaultInstance(BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.class, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint);
        apxu apxu = apxu.d;
        BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint2 = c;
        browseSectionListReloadEndpoint = anxl.newSingularGeneratedExtension(apxu, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint2, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint2, null, 120837120, aobm.MESSAGE, BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.class);
    }
}
