package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.auhw;

public final class LiveCreationEndpointOuterClass$LiveCreationEndpoint extends anxl implements anzf {
    public static final LiveCreationEndpointOuterClass$LiveCreationEndpoint a;
    private static volatile anzq b;
    public static final anxr liveCreationEndpoint;

    private LiveCreationEndpointOuterClass$LiveCreationEndpoint() {
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
                return new LiveCreationEndpointOuterClass$LiveCreationEndpoint();
            case 4:
                return new auhw();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (LiveCreationEndpointOuterClass$LiveCreationEndpoint.class) {
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
        LiveCreationEndpointOuterClass$LiveCreationEndpoint liveCreationEndpointOuterClass$LiveCreationEndpoint = new LiveCreationEndpointOuterClass$LiveCreationEndpoint();
        a = liveCreationEndpointOuterClass$LiveCreationEndpoint;
        anxl.registerDefaultInstance(LiveCreationEndpointOuterClass$LiveCreationEndpoint.class, liveCreationEndpointOuterClass$LiveCreationEndpoint);
        apxu apxu = apxu.d;
        LiveCreationEndpointOuterClass$LiveCreationEndpoint liveCreationEndpointOuterClass$LiveCreationEndpoint2 = a;
        liveCreationEndpoint = anxl.newSingularGeneratedExtension(apxu, liveCreationEndpointOuterClass$LiveCreationEndpoint2, liveCreationEndpointOuterClass$LiveCreationEndpoint2, null, 122546829, aobm.MESSAGE, LiveCreationEndpointOuterClass$LiveCreationEndpoint.class);
    }
}
