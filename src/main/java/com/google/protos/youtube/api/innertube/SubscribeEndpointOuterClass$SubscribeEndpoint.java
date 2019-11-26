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
import defpackage.axwu;

public final class SubscribeEndpointOuterClass$SubscribeEndpoint extends anxl implements anzf {
    public static final SubscribeEndpointOuterClass$SubscribeEndpoint e;
    private static volatile anzq f;
    public static final anxr subscribeEndpoint;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c;
    public String d;

    private SubscribeEndpointOuterClass$SubscribeEndpoint() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\b\u0000\u0003\b\u0001", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new SubscribeEndpointOuterClass$SubscribeEndpoint();
            case 4:
                return new axwu();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (SubscribeEndpointOuterClass$SubscribeEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint = new SubscribeEndpointOuterClass$SubscribeEndpoint();
        e = subscribeEndpointOuterClass$SubscribeEndpoint;
        anxl.registerDefaultInstance(SubscribeEndpointOuterClass$SubscribeEndpoint.class, subscribeEndpointOuterClass$SubscribeEndpoint);
        apxu apxu = apxu.d;
        SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint2 = e;
        subscribeEndpoint = anxl.newSingularGeneratedExtension(apxu, subscribeEndpointOuterClass$SubscribeEndpoint2, subscribeEndpointOuterClass$SubscribeEndpoint2, null, 68997349, aobm.MESSAGE, SubscribeEndpointOuterClass$SubscribeEndpoint.class);
    }
}
