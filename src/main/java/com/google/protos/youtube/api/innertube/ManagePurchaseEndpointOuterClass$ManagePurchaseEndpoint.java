package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aumq;
import defpackage.aumr;

public final class ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint extends anxl implements anzf {
    public static final ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint c;
    private static volatile anzq e;
    public static final anxr managePurchaseEndpoint;
    public int a;
    public aumq b;
    private byte d = (byte) 2;

    private ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint() {
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
                return new ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint();
            case 4:
                return new aumr();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class) {
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
        ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint managePurchaseEndpointOuterClass$ManagePurchaseEndpoint = new ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint();
        c = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint;
        anxl.registerDefaultInstance(ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class, managePurchaseEndpointOuterClass$ManagePurchaseEndpoint);
        apxu apxu = apxu.d;
        ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint managePurchaseEndpointOuterClass$ManagePurchaseEndpoint2 = c;
        managePurchaseEndpoint = anxl.newSingularGeneratedExtension(apxu, managePurchaseEndpointOuterClass$ManagePurchaseEndpoint2, managePurchaseEndpointOuterClass$ManagePurchaseEndpoint2, null, 95591119, aobm.MESSAGE, ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class);
    }
}
