package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awtn;

public final class PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint extends anxl implements anzf {
    public static final PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint a;
    private static volatile anzq c;
    public static final anxr pushNotificationDialogButtonEndpoint;
    private byte b = (byte) 2;

    private PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                if (obj != null) {
                    b = (byte) 1;
                }
                this.b = b;
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint();
            case 4:
                return new awtn();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint pushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint = new PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint();
        a = pushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint;
        anxl.registerDefaultInstance(PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint.class, pushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint);
        apxu apxu = apxu.d;
        PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint pushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint2 = a;
        pushNotificationDialogButtonEndpoint = anxl.newSingularGeneratedExtension(apxu, pushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint2, pushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint2, null, 85763623, aobm.MESSAGE, PushNotificationDialogButtonEndpointOuterClass$PushNotificationDialogButtonEndpoint.class);
    }
}
