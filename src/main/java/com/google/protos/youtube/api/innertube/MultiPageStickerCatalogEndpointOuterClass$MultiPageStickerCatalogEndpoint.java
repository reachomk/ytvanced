package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avec;

public final class MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint extends anxl implements anzf {
    public static final MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint a;
    private static volatile anzq b;
    public static final anxr multiPageStickerCatalogEndpoint;

    private MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint() {
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
                return new MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint();
            case 4:
                return new avec();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class) {
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
        MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint multiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint = new MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint();
        a = multiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint;
        anxl.registerDefaultInstance(MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class, multiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint);
        apxu apxu = apxu.d;
        MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint multiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint2 = a;
        multiPageStickerCatalogEndpoint = anxl.newSingularGeneratedExtension(apxu, multiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint2, multiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint2, null, 167996903, aobm.MESSAGE, MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class);
    }
}
