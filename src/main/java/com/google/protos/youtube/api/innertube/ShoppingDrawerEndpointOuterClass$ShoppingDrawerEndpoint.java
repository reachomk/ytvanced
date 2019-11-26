package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axkv;
import defpackage.axkw;

public final class ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint extends anxl implements anzf {
    public static final ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint d;
    private static volatile anzq e;
    public static final anxr shoppingDrawerEndpoint;
    public int a;
    public int b;
    public int c;

    private ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001", new Object[]{"a", "b", axkw.a, "c"});
            case 3:
                return new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
            case 4:
                return new axkv();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint = new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
        d = shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint;
        anxl.registerDefaultInstance(ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class, shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint);
        apxu apxu = apxu.d;
        ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint2 = d;
        shoppingDrawerEndpoint = anxl.newSingularGeneratedExtension(apxu, shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint2, shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint2, null, 154446441, aobm.MESSAGE, ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class);
    }
}
