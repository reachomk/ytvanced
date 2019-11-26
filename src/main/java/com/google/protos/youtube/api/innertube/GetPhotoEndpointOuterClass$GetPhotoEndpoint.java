package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aphj;
import defpackage.apxu;
import defpackage.arml;
import defpackage.arqz;
import defpackage.arrb;
import defpackage.arrc;

public final class GetPhotoEndpointOuterClass$GetPhotoEndpoint extends anxl implements anzf {
    public static final GetPhotoEndpointOuterClass$GetPhotoEndpoint f;
    public static final anxr getPhotoEndpoint;
    private static volatile anzq h;
    public int a;
    public int b;
    public aphj c;
    public arrb d;
    public arml e;
    private byte g = (byte) 2;

    private GetPhotoEndpointOuterClass$GetPhotoEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\f\u0000\u0002Љ\u0001\u0003\t\u0002\u0004Љ\u0003", new Object[]{"a", "b", arrc.a, "c", "d", "e"});
            case 3:
                return new GetPhotoEndpointOuterClass$GetPhotoEndpoint();
            case 4:
                return new arqz();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (GetPhotoEndpointOuterClass$GetPhotoEndpoint.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint = new GetPhotoEndpointOuterClass$GetPhotoEndpoint();
        f = getPhotoEndpointOuterClass$GetPhotoEndpoint;
        anxl.registerDefaultInstance(GetPhotoEndpointOuterClass$GetPhotoEndpoint.class, getPhotoEndpointOuterClass$GetPhotoEndpoint);
        apxu apxu = apxu.d;
        GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint2 = f;
        getPhotoEndpoint = anxl.newSingularGeneratedExtension(apxu, getPhotoEndpointOuterClass$GetPhotoEndpoint2, getPhotoEndpointOuterClass$GetPhotoEndpoint2, null, 99404607, aobm.MESSAGE, GetPhotoEndpointOuterClass$GetPhotoEndpoint.class);
    }
}
