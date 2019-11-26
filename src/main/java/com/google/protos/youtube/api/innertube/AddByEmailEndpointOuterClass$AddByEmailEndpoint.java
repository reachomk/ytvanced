package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aoma;
import defpackage.apxu;

public final class AddByEmailEndpointOuterClass$AddByEmailEndpoint extends anxl implements anzf {
    public static final anxr addByEmailEndpoint;
    public static final AddByEmailEndpointOuterClass$AddByEmailEndpoint c;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private AddByEmailEndpointOuterClass$AddByEmailEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new AddByEmailEndpointOuterClass$AddByEmailEndpoint();
            case 4:
                return new aoma();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (AddByEmailEndpointOuterClass$AddByEmailEndpoint.class) {
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
        AddByEmailEndpointOuterClass$AddByEmailEndpoint addByEmailEndpointOuterClass$AddByEmailEndpoint = new AddByEmailEndpointOuterClass$AddByEmailEndpoint();
        c = addByEmailEndpointOuterClass$AddByEmailEndpoint;
        anxl.registerDefaultInstance(AddByEmailEndpointOuterClass$AddByEmailEndpoint.class, addByEmailEndpointOuterClass$AddByEmailEndpoint);
        apxu apxu = apxu.d;
        AddByEmailEndpointOuterClass$AddByEmailEndpoint addByEmailEndpointOuterClass$AddByEmailEndpoint2 = c;
        addByEmailEndpoint = anxl.newSingularGeneratedExtension(apxu, addByEmailEndpointOuterClass$AddByEmailEndpoint2, addByEmailEndpointOuterClass$AddByEmailEndpoint2, null, 161983468, aobm.MESSAGE, AddByEmailEndpointOuterClass$AddByEmailEndpoint.class);
    }
}
