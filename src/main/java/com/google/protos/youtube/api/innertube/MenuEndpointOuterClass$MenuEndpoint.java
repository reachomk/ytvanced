package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.auux;
import defpackage.auvr;

public final class MenuEndpointOuterClass$MenuEndpoint extends anxl implements anzf {
    public static final MenuEndpointOuterClass$MenuEndpoint c;
    private static volatile anzq e;
    public static final anxr menuEndpoint;
    public int a;
    public auvr b;
    private byte d = (byte) 2;

    private MenuEndpointOuterClass$MenuEndpoint() {
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
                return new MenuEndpointOuterClass$MenuEndpoint();
            case 4:
                return new auux();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (MenuEndpointOuterClass$MenuEndpoint.class) {
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
        MenuEndpointOuterClass$MenuEndpoint menuEndpointOuterClass$MenuEndpoint = new MenuEndpointOuterClass$MenuEndpoint();
        c = menuEndpointOuterClass$MenuEndpoint;
        anxl.registerDefaultInstance(MenuEndpointOuterClass$MenuEndpoint.class, menuEndpointOuterClass$MenuEndpoint);
        apxu apxu = apxu.d;
        MenuEndpointOuterClass$MenuEndpoint menuEndpointOuterClass$MenuEndpoint2 = c;
        menuEndpoint = anxl.newSingularGeneratedExtension(apxu, menuEndpointOuterClass$MenuEndpoint2, menuEndpointOuterClass$MenuEndpoint2, null, 98150882, aobm.MESSAGE, MenuEndpointOuterClass$MenuEndpoint.class);
    }
}
