package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.atzn;
import defpackage.axak;

public final class LightweightCameraEndpointOuterClass$LightweightCameraEndpoint extends anxl implements anzf {
    public static final LightweightCameraEndpointOuterClass$LightweightCameraEndpoint f;
    private static volatile anzq h;
    public static final anxr lightweightCameraEndpoint;
    public int a;
    public int b;
    public apxu c;
    public anyd d = anxl.emptyProtobufList();
    public String e = "";
    private byte g = (byte) 2;

    private LightweightCameraEndpointOuterClass$LightweightCameraEndpoint() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0002\u0002\u0004\u0001\u0003Љ\u0002\u0005Л\u0006\b\u0004", new Object[]{"a", "b", "c", "d", axak.class, "e"});
            case 3:
                return new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
            case 4:
                return new atzn();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class) {
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
        LightweightCameraEndpointOuterClass$LightweightCameraEndpoint lightweightCameraEndpointOuterClass$LightweightCameraEndpoint = new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
        f = lightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
        anxl.registerDefaultInstance(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class, lightweightCameraEndpointOuterClass$LightweightCameraEndpoint);
        apxu apxu = apxu.d;
        LightweightCameraEndpointOuterClass$LightweightCameraEndpoint lightweightCameraEndpointOuterClass$LightweightCameraEndpoint2 = f;
        lightweightCameraEndpoint = anxl.newSingularGeneratedExtension(apxu, lightweightCameraEndpointOuterClass$LightweightCameraEndpoint2, lightweightCameraEndpointOuterClass$LightweightCameraEndpoint2, null, 139979438, aobm.MESSAGE, LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class);
    }
}
