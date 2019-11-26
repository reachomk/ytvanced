package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axae;

public final class RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint extends anxl implements anzf {
    public static final RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint c;
    private static volatile anzq d;
    public static final anxr removeUpcomingEventReminderEndpoint;
    public int a;
    public String b = "";

    private RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint();
            case 4:
                return new axae();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint = new RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint();
        c = removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;
        anxl.registerDefaultInstance(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class, removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint);
        apxu apxu = apxu.d;
        RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint2 = c;
        removeUpcomingEventReminderEndpoint = anxl.newSingularGeneratedExtension(apxu, removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint2, removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint2, null, 124510444, aobm.MESSAGE, RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class);
    }
}
