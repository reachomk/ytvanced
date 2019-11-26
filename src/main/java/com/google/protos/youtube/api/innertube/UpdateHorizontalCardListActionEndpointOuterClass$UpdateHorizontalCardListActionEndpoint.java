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
import defpackage.aysc;

public final class UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint extends anxl implements anzf {
    public static final UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint b;
    private static volatile anzq d;
    public static final anxr updateHorizontalCardListActionEndpoint;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", apxu.class});
            case 3:
                return new UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint();
            case 4:
                return new aysc();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint updateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint = new UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint();
        b = updateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint;
        anxl.registerDefaultInstance(UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.class, updateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint);
        apxu apxu = apxu.d;
        UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint updateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint2 = b;
        updateHorizontalCardListActionEndpoint = anxl.newSingularGeneratedExtension(apxu, updateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint2, updateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint2, null, 149801128, aobm.MESSAGE, UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.class);
    }
}
