package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axky;
import defpackage.axla;

public final class ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint extends anxl implements anzf {
    public static final ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint j;
    private static volatile anzq k;
    public static final anxr shoppingServiceEndpoint;
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public String i;

    private ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.h = str;
        this.i = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0007\u0005\u0006\b\u0006\u0007\b\u0007\b\b\u0004", new Object[]{"a", "b", axla.a, "c", "d", "e", "g", "h", "i", "f"});
            case 3:
                return new ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint();
            case 4:
                return new axky();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint = new ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint();
        j = shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint;
        anxl.registerDefaultInstance(ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.class, shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint);
        apxu apxu = apxu.d;
        ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint2 = j;
        shoppingServiceEndpoint = anxl.newSingularGeneratedExtension(apxu, shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint2, shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint2, null, 228712450, aobm.MESSAGE, ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.class);
    }
}
