package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arml;
import defpackage.ayup;

public final class UploadPhotoEndpointOuterClass$UploadPhotoEndpoint extends anxl implements anzf {
    public static final UploadPhotoEndpointOuterClass$UploadPhotoEndpoint h;
    private static volatile anzq j;
    public static final anxr uploadPhotoEndpoint;
    public int a;
    public int b = 0;
    public Object c;
    public String d;
    public String e;
    public arml f;
    public arml g;
    private byte i = (byte) 2;

    private UploadPhotoEndpointOuterClass$UploadPhotoEndpoint() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001\b\u0000\u0002м\u0000\u0003м\u0000\u0005Љ\u0005\u0006Љ\u0006\u0007\b\u0001", new Object[]{"c", "b", "a", "d", apxu.class, apxu.class, "f", "g", "e"});
            case 3:
                return new UploadPhotoEndpointOuterClass$UploadPhotoEndpoint();
            case 4:
                return new ayup();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = new UploadPhotoEndpointOuterClass$UploadPhotoEndpoint();
        h = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
        anxl.registerDefaultInstance(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.class, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
        apxu apxu = apxu.d;
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint2 = h;
        uploadPhotoEndpoint = anxl.newSingularGeneratedExtension(apxu, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint2, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint2, null, 99402190, aobm.MESSAGE, UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.class);
    }
}
