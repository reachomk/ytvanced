package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aoyy;
import defpackage.apxu;
import defpackage.arml;
import defpackage.armr;

public final class AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint extends anxl implements anzf {
    public static final anxr autoOfflineVideosEndpoint;
    public static final AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint f;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public arml c;
    public arml d;
    public armr e;
    private byte g = (byte) 2;

    private AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint();
            case 4:
                return new aoyy();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint.class) {
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
        AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint = new AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint();
        f = autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint;
        anxl.registerDefaultInstance(AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint.class, autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint);
        apxu apxu = apxu.d;
        AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint2 = f;
        autoOfflineVideosEndpoint = anxl.newSingularGeneratedExtension(apxu, autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint2, autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint2, null, 142485417, aobm.MESSAGE, AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint.class);
    }
}
