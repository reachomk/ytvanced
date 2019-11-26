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
import defpackage.awhn;
import defpackage.awhq;

public final class PlaylistEditEndpointOuterClass$PlaylistEditEndpoint extends anxl implements anzf {
    public static final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint f;
    private static volatile anzq h;
    public static final anxr playlistEditEndpoint;
    public int a;
    public String b;
    public anyd c;
    public anyd d;
    public String e;
    private byte g = (byte) 2;

    private PlaylistEditEndpointOuterClass$PlaylistEditEndpoint() {
        String str = "";
        this.b = str;
        this.c = anxl.emptyProtobufList();
        this.d = anxl.emptyProtobufList();
        this.e = str;
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0002\u0001\b\u0000\u0002Л\u0003\b\u0001\u0005Л", new Object[]{"a", "b", "c", awhn.class, "e", "d", apxu.class});
            case 3:
                return new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
            case 4:
                return new awhq();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class) {
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
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
        f = playlistEditEndpointOuterClass$PlaylistEditEndpoint;
        anxl.registerDefaultInstance(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class, playlistEditEndpointOuterClass$PlaylistEditEndpoint);
        apxu apxu = apxu.d;
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint2 = f;
        playlistEditEndpoint = anxl.newSingularGeneratedExtension(apxu, playlistEditEndpointOuterClass$PlaylistEditEndpoint2, playlistEditEndpointOuterClass$PlaylistEditEndpoint2, null, 60666189, aobm.MESSAGE, PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class);
    }
}
