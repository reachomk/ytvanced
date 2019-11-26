package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axmi;

public final class ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint extends anxl implements anzf {
    public static final ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint c;
    private static volatile anzq e;
    public static final anxr showPurchaseConfirmationEndpoint;
    public int a;
    public apxu b;
    private byte d = (byte) 2;

    private ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint() {
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
                return new ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint();
            case 4:
                return new axmi();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint.class) {
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
        ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint showPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint = new ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint();
        c = showPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint;
        anxl.registerDefaultInstance(ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint.class, showPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint);
        apxu apxu = apxu.d;
        ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint showPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint2 = c;
        showPurchaseConfirmationEndpoint = anxl.newSingularGeneratedExtension(apxu, showPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint2, showPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint2, null, 116199210, aobm.MESSAGE, ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint.class);
    }
}
