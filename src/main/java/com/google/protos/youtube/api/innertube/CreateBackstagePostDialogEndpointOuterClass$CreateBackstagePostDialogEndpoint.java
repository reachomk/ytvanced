package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqqn;
import defpackage.aqqq;

public final class CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint extends anxl implements anzf {
    public static final CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint c;
    public static final anxr createBackstagePostDialogEndpoint;
    private static volatile anzq e;
    public int a;
    public aqqn b;
    private byte d = (byte) 2;

    private CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint() {
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
                return new CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint();
            case 4:
                return new aqqq();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.class) {
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
        CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint = new CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint();
        c = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
        anxl.registerDefaultInstance(CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.class, createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint);
        apxu apxu = apxu.d;
        CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint2 = c;
        createBackstagePostDialogEndpoint = anxl.newSingularGeneratedExtension(apxu, createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint2, createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint2, null, 117834934, aobm.MESSAGE, CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.class);
    }
}
