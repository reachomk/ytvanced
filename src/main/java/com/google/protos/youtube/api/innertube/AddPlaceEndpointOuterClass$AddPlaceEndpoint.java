package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aomz;
import defpackage.apxu;
import defpackage.arml;

public final class AddPlaceEndpointOuterClass$AddPlaceEndpoint extends anxl implements anzf {
    public static final anxr addPlaceEndpoint;
    public static final AddPlaceEndpointOuterClass$AddPlaceEndpoint e;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public arml c;
    public arml d;
    private byte f = (byte) 2;

    private AddPlaceEndpointOuterClass$AddPlaceEndpoint() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
            case 4:
                return new aomz();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (AddPlaceEndpointOuterClass$AddPlaceEndpoint.class) {
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
        AddPlaceEndpointOuterClass$AddPlaceEndpoint addPlaceEndpointOuterClass$AddPlaceEndpoint = new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
        e = addPlaceEndpointOuterClass$AddPlaceEndpoint;
        anxl.registerDefaultInstance(AddPlaceEndpointOuterClass$AddPlaceEndpoint.class, addPlaceEndpointOuterClass$AddPlaceEndpoint);
        apxu apxu = apxu.d;
        AddPlaceEndpointOuterClass$AddPlaceEndpoint addPlaceEndpointOuterClass$AddPlaceEndpoint2 = e;
        addPlaceEndpoint = anxl.newSingularGeneratedExtension(apxu, addPlaceEndpointOuterClass$AddPlaceEndpoint2, addPlaceEndpointOuterClass$AddPlaceEndpoint2, null, 153675053, aobm.MESSAGE, AddPlaceEndpointOuterClass$AddPlaceEndpoint.class);
    }
}
