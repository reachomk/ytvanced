package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arqw;

public final class GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint extends anxl implements anzf {
    public static final GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint c;
    private static volatile anzq d;
    public static final anxr getBroadcastSetupEndpoint;
    public int a;
    public String b = "";

    private GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\b\u0001", new Object[]{"a", "b"});
            case 3:
                return new GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint();
            case 4:
                return new arqw();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class) {
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
        GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint = new GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint();
        c = getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint;
        anxl.registerDefaultInstance(GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class, getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint);
        apxu apxu = apxu.d;
        GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint2 = c;
        getBroadcastSetupEndpoint = anxl.newSingularGeneratedExtension(apxu, getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint2, getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint2, null, 147869735, aobm.MESSAGE, GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class);
    }
}
