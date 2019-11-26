package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aogn;
import defpackage.aogp;
import defpackage.apxu;

public final class AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint extends anxl implements anzf {
    public static final anxr adChoicesDialogEndpoint;
    public static final AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint c;
    private static volatile anzq e;
    public int a;
    public aogp b;
    private byte d = (byte) 2;

    private AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint() {
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
                return new AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint();
            case 4:
                return new aogn();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class) {
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
        AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint = new AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint();
        c = adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
        anxl.registerDefaultInstance(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class, adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint);
        apxu apxu = apxu.d;
        AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint2 = c;
        adChoicesDialogEndpoint = anxl.newSingularGeneratedExtension(apxu, adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint2, adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint2, null, 83457823, aobm.MESSAGE, AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class);
    }
}
