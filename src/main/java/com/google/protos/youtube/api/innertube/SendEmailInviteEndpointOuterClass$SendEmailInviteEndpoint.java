package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axfi;

public final class SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint extends anxl implements anzf {
    public static final SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint a;
    private static volatile anzq b;
    public static final anxr sendEmailInviteEndpoint;

    private SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint();
            case 4:
                return new axfi();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint = new SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint();
        a = sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint;
        anxl.registerDefaultInstance(SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint.class, sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint);
        apxu apxu = apxu.d;
        SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint2 = a;
        sendEmailInviteEndpoint = anxl.newSingularGeneratedExtension(apxu, sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint2, sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint2, null, 164012079, aobm.MESSAGE, SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint.class);
    }
}
