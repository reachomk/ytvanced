package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avot;
import defpackage.avou;
import defpackage.axak;

public final class OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint extends anxl implements anzf {
    public static final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint e;
    private static volatile anzq g;
    public static final anxr offlinePlaylistEndpoint;
    public int a;
    public String b = "";
    public int c;
    public axak d;
    private byte f = (byte) 2;

    private OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\b\u0000\u0002\f\u0001\u0004Љ\u0003", new Object[]{"a", "b", "c", avou.a, "d"});
            case 3:
                return new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
            case 4:
                return new avot();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
        e = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
        anxl.registerDefaultInstance(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint);
        apxu apxu = apxu.d;
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2 = e;
        offlinePlaylistEndpoint = anxl.newSingularGeneratedExtension(apxu, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2, null, 73082583, aobm.MESSAGE, OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class);
    }
}
