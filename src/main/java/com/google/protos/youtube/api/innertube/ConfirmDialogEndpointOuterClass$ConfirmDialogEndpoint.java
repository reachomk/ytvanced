package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqhu;
import defpackage.aqhv;

public final class ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint extends anxl implements anzf {
    public static final ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint c;
    public static final anxr confirmDialogEndpoint;
    private static volatile anzq e;
    public int a;
    public aqhu b;
    private byte d = (byte) 2;

    private ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint() {
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
                return new ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint();
            case 4:
                return new aqhv();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class) {
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
        ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint = new ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint();
        c = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
        anxl.registerDefaultInstance(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class, confirmDialogEndpointOuterClass$ConfirmDialogEndpoint);
        apxu apxu = apxu.d;
        ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint2 = c;
        confirmDialogEndpoint = anxl.newSingularGeneratedExtension(apxu, confirmDialogEndpointOuterClass$ConfirmDialogEndpoint2, confirmDialogEndpointOuterClass$ConfirmDialogEndpoint2, null, 79289575, aobm.MESSAGE, ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class);
    }
}
