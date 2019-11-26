package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avrh;
import defpackage.avri;
import defpackage.axak;

public final class OfflineVideoEndpointOuterClass$OfflineVideoEndpoint extends anxl implements anzf {
    public static final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint f;
    private static volatile anzq h;
    public static final anxr offlineVideoEndpoint;
    public int a;
    public String b;
    public String c;
    public int d;
    public axak e;
    private byte g = (byte) 2;

    private OfflineVideoEndpointOuterClass$OfflineVideoEndpoint() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002\f\u0002\u0004Љ\u0004\u0005\b\u0001", new Object[]{"a", "b", "d", avri.a, "e", "c"});
            case 3:
                return new OfflineVideoEndpointOuterClass$OfflineVideoEndpoint();
            case 4:
                return new avrh();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class) {
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
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = new OfflineVideoEndpointOuterClass$OfflineVideoEndpoint();
        f = offlineVideoEndpointOuterClass$OfflineVideoEndpoint;
        anxl.registerDefaultInstance(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class, offlineVideoEndpointOuterClass$OfflineVideoEndpoint);
        apxu apxu = apxu.d;
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = f;
        offlineVideoEndpoint = anxl.newSingularGeneratedExtension(apxu, offlineVideoEndpointOuterClass$OfflineVideoEndpoint2, offlineVideoEndpointOuterClass$OfflineVideoEndpoint2, null, 73080600, aobm.MESSAGE, OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class);
    }
}
