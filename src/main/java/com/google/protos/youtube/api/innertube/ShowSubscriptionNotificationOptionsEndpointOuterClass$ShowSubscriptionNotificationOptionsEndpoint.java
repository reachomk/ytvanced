package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axmq;
import defpackage.axmr;

public final class ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint extends anxl implements anzf {
    public static final ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint c;
    private static volatile anzq e;
    public static final anxr showSubscriptionNotificationOptionsEndpoint;
    public int a;
    public axmq b;
    private byte d = (byte) 2;

    private ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint() {
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
                return new ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint();
            case 4:
                return new axmr();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint.class) {
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
        ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint showSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint = new ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint();
        c = showSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint;
        anxl.registerDefaultInstance(ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint.class, showSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint);
        apxu apxu = apxu.d;
        ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint showSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint2 = c;
        showSubscriptionNotificationOptionsEndpoint = anxl.newSingularGeneratedExtension(apxu, showSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint2, showSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint2, null, 137739979, aobm.MESSAGE, ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint.class);
    }
}
