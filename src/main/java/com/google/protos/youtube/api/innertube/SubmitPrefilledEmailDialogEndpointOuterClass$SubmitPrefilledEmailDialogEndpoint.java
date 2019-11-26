package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axak;
import defpackage.axvq;

public final class SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint extends anxl implements anzf {
    public static final SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint c;
    private static volatile anzq e;
    public static final anxr submitPrefilledEmailDialogEndpoint;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint() {
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
                return new SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint();
            case 4:
                return new axvq();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint.class) {
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
        SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint submitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint = new SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint();
        c = submitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint;
        anxl.registerDefaultInstance(SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint.class, submitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint);
        apxu apxu = apxu.d;
        SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint submitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint2 = c;
        submitPrefilledEmailDialogEndpoint = anxl.newSingularGeneratedExtension(apxu, submitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint2, submitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint2, null, 157617808, aobm.MESSAGE, SubmitPrefilledEmailDialogEndpointOuterClass$SubmitPrefilledEmailDialogEndpoint.class);
    }
}
