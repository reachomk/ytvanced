package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aofq;
import defpackage.apxu;
import defpackage.axfg;

public final class SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint extends anxl implements anzf {
    public static final SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint e;
    private static volatile anzq g;
    public static final anxr selectActiveIdentityEndpoint;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public apxu c;
    public apxu d;
    private byte f = (byte) 2;

    private SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001Л\u0003Љ\u0001\u0004Љ\u0002", new Object[]{"a", "b", aofq.class, "c", "d"});
            case 3:
                return new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
            case 4:
                return new axfg();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class) {
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
        SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint = new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
        e = selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
        anxl.registerDefaultInstance(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class, selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint);
        apxu apxu = apxu.d;
        SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint2 = e;
        selectActiveIdentityEndpoint = anxl.newSingularGeneratedExtension(apxu, selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint2, selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint2, null, 77196420, aobm.MESSAGE, SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class);
    }
}
