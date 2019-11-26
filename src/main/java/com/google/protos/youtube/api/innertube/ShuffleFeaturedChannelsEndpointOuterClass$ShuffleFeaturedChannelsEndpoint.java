package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axnf;

public final class ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint extends anxl implements anzf {
    public static final ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint a;
    private static volatile anzq b;
    public static final anxr shuffleFeaturedChannelsEndpoint;

    private ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint();
            case 4:
                return new axnf();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint shuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint = new ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint();
        a = shuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint;
        anxl.registerDefaultInstance(ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint.class, shuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint);
        apxu apxu = apxu.d;
        ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint shuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint2 = a;
        shuffleFeaturedChannelsEndpoint = anxl.newSingularGeneratedExtension(apxu, shuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint2, shuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint2, null, 65754754, aobm.MESSAGE, ShuffleFeaturedChannelsEndpointOuterClass$ShuffleFeaturedChannelsEndpoint.class);
    }
}
