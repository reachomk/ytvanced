package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axak;
import defpackage.axuf;

public final class StickerCatalogEndpointOuterClass$StickerCatalogEndpoint extends anxl implements anzf {
    public static final StickerCatalogEndpointOuterClass$StickerCatalogEndpoint c;
    private static volatile anzq e;
    public static final anxr stickerCatalogEndpoint;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private StickerCatalogEndpointOuterClass$StickerCatalogEndpoint() {
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
                return new StickerCatalogEndpointOuterClass$StickerCatalogEndpoint();
            case 4:
                return new axuf();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.class) {
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
        StickerCatalogEndpointOuterClass$StickerCatalogEndpoint stickerCatalogEndpointOuterClass$StickerCatalogEndpoint = new StickerCatalogEndpointOuterClass$StickerCatalogEndpoint();
        c = stickerCatalogEndpointOuterClass$StickerCatalogEndpoint;
        anxl.registerDefaultInstance(StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.class, stickerCatalogEndpointOuterClass$StickerCatalogEndpoint);
        apxu apxu = apxu.d;
        StickerCatalogEndpointOuterClass$StickerCatalogEndpoint stickerCatalogEndpointOuterClass$StickerCatalogEndpoint2 = c;
        stickerCatalogEndpoint = anxl.newSingularGeneratedExtension(apxu, stickerCatalogEndpointOuterClass$StickerCatalogEndpoint2, stickerCatalogEndpointOuterClass$StickerCatalogEndpoint2, null, 153501069, aobm.MESSAGE, StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.class);
    }
}
