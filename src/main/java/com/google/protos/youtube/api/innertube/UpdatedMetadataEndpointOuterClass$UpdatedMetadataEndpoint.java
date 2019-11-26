package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aysj;

public final class UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint extends anxl implements anzf {
    public static final UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint c;
    private static volatile anzq d;
    public static final anxr updatedMetadataEndpoint;
    public int a;
    public String b = "";

    private UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint() {
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
                return new UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint();
            case 4:
                return new aysj();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.class) {
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
        UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint updatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint = new UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint();
        c = updatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint;
        anxl.registerDefaultInstance(UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.class, updatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint);
        apxu apxu = apxu.d;
        UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint updatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint2 = c;
        updatedMetadataEndpoint = anxl.newSingularGeneratedExtension(apxu, updatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint2, updatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint2, null, 124861221, aobm.MESSAGE, UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.class);
    }
}
