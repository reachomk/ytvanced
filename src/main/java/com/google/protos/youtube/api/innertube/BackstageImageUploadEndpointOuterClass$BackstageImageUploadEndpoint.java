package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apav;
import defpackage.apbg;
import defpackage.apbi;
import defpackage.apxu;

public final class BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint extends anxl implements anzf {
    public static final anxr backstageImageUploadEndpoint;
    public static final BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint f;
    private static volatile anzq h;
    public int a;
    public String b;
    public String c;
    public apbi d;
    public apav e;
    private byte g = (byte) 2;

    private BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002\b\u0001\u0003\t\u0002\u0004Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint();
            case 4:
                return new apbg();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class) {
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
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = new BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint();
        f = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
        anxl.registerDefaultInstance(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
        apxu apxu = apxu.d;
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2 = f;
        backstageImageUploadEndpoint = anxl.newSingularGeneratedExtension(apxu, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2, null, 125827176, aobm.MESSAGE, BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class);
    }
}
