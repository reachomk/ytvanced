package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayec;

public final class TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint extends anxl implements anzf {
    public static final TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint c;
    private static volatile anzq d;
    public static final anxr takePictureForThumbnailEndpoint;
    public int a;
    public String b = "";

    private TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\b\u0001", new Object[]{"a", "b"});
            case 3:
                return new TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint();
            case 4:
                return new ayec();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint = new TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint();
        c = takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint;
        anxl.registerDefaultInstance(TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class, takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint);
        apxu apxu = apxu.d;
        TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint2 = c;
        takePictureForThumbnailEndpoint = anxl.newSingularGeneratedExtension(apxu, takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint2, takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint2, null, 124581055, aobm.MESSAGE, TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class);
    }
}
