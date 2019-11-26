package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqwy;

public final class DismissalEndpointOuterClass$DismissalEndpoint extends anxl implements anzf {
    public static final DismissalEndpointOuterClass$DismissalEndpoint d;
    public static final anxr dismissalEndpoint;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private DismissalEndpointOuterClass$DismissalEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\b\u0000\u0002Л", new Object[]{"a", "b", "c", apxu.class});
            case 3:
                return new DismissalEndpointOuterClass$DismissalEndpoint();
            case 4:
                return new aqwy();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (DismissalEndpointOuterClass$DismissalEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        DismissalEndpointOuterClass$DismissalEndpoint dismissalEndpointOuterClass$DismissalEndpoint = new DismissalEndpointOuterClass$DismissalEndpoint();
        d = dismissalEndpointOuterClass$DismissalEndpoint;
        anxl.registerDefaultInstance(DismissalEndpointOuterClass$DismissalEndpoint.class, dismissalEndpointOuterClass$DismissalEndpoint);
        apxu apxu = apxu.d;
        DismissalEndpointOuterClass$DismissalEndpoint dismissalEndpointOuterClass$DismissalEndpoint2 = d;
        dismissalEndpoint = anxl.newSingularGeneratedExtension(apxu, dismissalEndpointOuterClass$DismissalEndpoint2, dismissalEndpointOuterClass$DismissalEndpoint2, null, 63120728, aobm.MESSAGE, DismissalEndpointOuterClass$DismissalEndpoint.class);
    }
}
