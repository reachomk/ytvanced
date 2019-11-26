package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awwz;
import defpackage.axak;

public final class ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint extends anxl implements anzf {
    public static final ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint c;
    private static volatile anzq e;
    public static final anxr reelEditVideoEndpoint;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint();
            case 4:
                return new awwz();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint reelEditVideoEndpointOuterClass$ReelEditVideoEndpoint = new ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint();
        c = reelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
        anxl.registerDefaultInstance(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class, reelEditVideoEndpointOuterClass$ReelEditVideoEndpoint);
        apxu apxu = apxu.d;
        ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint reelEditVideoEndpointOuterClass$ReelEditVideoEndpoint2 = c;
        reelEditVideoEndpoint = anxl.newSingularGeneratedExtension(apxu, reelEditVideoEndpointOuterClass$ReelEditVideoEndpoint2, reelEditVideoEndpointOuterClass$ReelEditVideoEndpoint2, null, 153734793, aobm.MESSAGE, ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class);
    }
}
