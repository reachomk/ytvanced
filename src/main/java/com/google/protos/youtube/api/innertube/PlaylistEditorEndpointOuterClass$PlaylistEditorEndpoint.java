package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awhr;

public final class PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint extends anxl implements anzf {
    public static final PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint c;
    private static volatile anzq d;
    public static final anxr playlistEditorEndpoint;
    public int a;
    public String b = "";

    private PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint();
            case 4:
                return new awhr();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class) {
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
        PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint playlistEditorEndpointOuterClass$PlaylistEditorEndpoint = new PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint();
        c = playlistEditorEndpointOuterClass$PlaylistEditorEndpoint;
        anxl.registerDefaultInstance(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class, playlistEditorEndpointOuterClass$PlaylistEditorEndpoint);
        apxu apxu = apxu.d;
        PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint playlistEditorEndpointOuterClass$PlaylistEditorEndpoint2 = c;
        playlistEditorEndpoint = anxl.newSingularGeneratedExtension(apxu, playlistEditorEndpointOuterClass$PlaylistEditorEndpoint2, playlistEditorEndpointOuterClass$PlaylistEditorEndpoint2, null, 93440769, aobm.MESSAGE, PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class);
    }
}
