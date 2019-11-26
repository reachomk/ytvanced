package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aonc;
import defpackage.apxu;

public final class AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint extends anxl implements anzf {
    public static final anxr addToPlaylistEndpoint;
    public static final AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint c;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint() {
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
                return new AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint();
            case 4:
                return new aonc();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.class) {
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
        AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint addToPlaylistEndpointOuterClass$AddToPlaylistEndpoint = new AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint();
        c = addToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
        anxl.registerDefaultInstance(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.class, addToPlaylistEndpointOuterClass$AddToPlaylistEndpoint);
        apxu apxu = apxu.d;
        AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint addToPlaylistEndpointOuterClass$AddToPlaylistEndpoint2 = c;
        addToPlaylistEndpoint = anxl.newSingularGeneratedExtension(apxu, addToPlaylistEndpointOuterClass$AddToPlaylistEndpoint2, addToPlaylistEndpointOuterClass$AddToPlaylistEndpoint2, null, 69487224, aobm.MESSAGE, AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.class);
    }
}
