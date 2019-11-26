package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arml;
import defpackage.avky;

public final class NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint extends anxl implements anzf {
    public static final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint g;
    private static volatile anzq i;
    public static final anxr notificationOptOutEndpoint;
    public int a;
    public anvu b = anvu.a;
    public arml c;
    public arml d;
    public anvu e;
    public anyd f;
    private byte h = (byte) 2;

    private NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint() {
        anxl.emptyProtobufList();
        this.e = anvu.a;
        this.f = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0001\u0003\u0003Љ\u0003\u0004Љ\u0004\u0005\n\u0001\b\n\u0005\tЛ", new Object[]{"a", "c", "d", "b", "e", "f", apxu.class});
            case 3:
                return new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
            case 4:
                return new avky();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
        g = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
        anxl.registerDefaultInstance(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class, notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint);
        apxu apxu = apxu.d;
        NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint2 = g;
        notificationOptOutEndpoint = anxl.newSingularGeneratedExtension(apxu, notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint2, notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint2, null, 65091333, aobm.MESSAGE, NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class);
    }
}
