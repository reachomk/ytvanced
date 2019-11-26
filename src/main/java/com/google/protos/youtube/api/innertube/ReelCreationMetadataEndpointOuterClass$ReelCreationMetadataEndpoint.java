package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arml;
import defpackage.awwu;
import defpackage.axak;

public final class ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint extends anxl implements anzf {
    public static final ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint e;
    private static volatile anzq g;
    public static final anxr reelCreationMetadataEndpoint;
    public int a;
    public axak b;
    public String c = "";
    public arml d;
    private byte f = (byte) 2;

    private ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001Љ\u0000\u0002\b\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint();
            case 4:
                return new awwu();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.class) {
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
        ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint = new ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint();
        e = reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint;
        anxl.registerDefaultInstance(ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.class, reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint);
        apxu apxu = apxu.d;
        ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint2 = e;
        reelCreationMetadataEndpoint = anxl.newSingularGeneratedExtension(apxu, reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint2, reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint2, null, 166774595, aobm.MESSAGE, ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.class);
    }
}
