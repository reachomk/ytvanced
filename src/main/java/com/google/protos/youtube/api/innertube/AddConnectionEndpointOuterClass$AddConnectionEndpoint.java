package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aomd;
import defpackage.aomk;
import defpackage.apxu;

public final class AddConnectionEndpointOuterClass$AddConnectionEndpoint extends anxl implements anzf {
    public static final anxr addConnectionEndpoint;
    public static final AddConnectionEndpointOuterClass$AddConnectionEndpoint d;
    private static volatile anzq f;
    public int a;
    public aomd b;
    public String c = "";
    private byte e = (byte) 2;

    private AddConnectionEndpointOuterClass$AddConnectionEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new AddConnectionEndpointOuterClass$AddConnectionEndpoint();
            case 4:
                return new aomk();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (AddConnectionEndpointOuterClass$AddConnectionEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        AddConnectionEndpointOuterClass$AddConnectionEndpoint addConnectionEndpointOuterClass$AddConnectionEndpoint = new AddConnectionEndpointOuterClass$AddConnectionEndpoint();
        d = addConnectionEndpointOuterClass$AddConnectionEndpoint;
        anxl.registerDefaultInstance(AddConnectionEndpointOuterClass$AddConnectionEndpoint.class, addConnectionEndpointOuterClass$AddConnectionEndpoint);
        apxu apxu = apxu.d;
        AddConnectionEndpointOuterClass$AddConnectionEndpoint addConnectionEndpointOuterClass$AddConnectionEndpoint2 = d;
        addConnectionEndpoint = anxl.newSingularGeneratedExtension(apxu, addConnectionEndpointOuterClass$AddConnectionEndpoint2, addConnectionEndpointOuterClass$AddConnectionEndpoint2, null, 105789482, aobm.MESSAGE, AddConnectionEndpointOuterClass$AddConnectionEndpoint.class);
    }
}
