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
import defpackage.aqrb;

public final class CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint extends anxl implements anzf {
    public static final anxr createPlaylistEndpoint;
    public static final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint f;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c;
    public String d;
    public String e;

    private CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0001\u0000\u0001\u001a\u0002\b\u0000\u0007\b\u0002\b\b\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint();
            case 4:
                return new aqrb();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = new CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint();
        f = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        anxl.registerDefaultInstance(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.class, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint);
        apxu apxu = apxu.d;
        CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint2 = f;
        createPlaylistEndpoint = anxl.newSingularGeneratedExtension(apxu, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint2, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint2, null, 85650004, aobm.MESSAGE, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.class);
    }
}
