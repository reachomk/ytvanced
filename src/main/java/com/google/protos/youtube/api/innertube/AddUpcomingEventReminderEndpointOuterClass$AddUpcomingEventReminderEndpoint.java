package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aonn;
import defpackage.apxu;

public final class AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint extends anxl implements anzf {
    public static final anxr addUpcomingEventReminderEndpoint;
    public static final AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint c;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint() {
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
                return new AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint();
            case 4:
                return new aonn();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class) {
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
        AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint = new AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint();
        c = addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint;
        anxl.registerDefaultInstance(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class, addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint);
        apxu apxu = apxu.d;
        AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint2 = c;
        addUpcomingEventReminderEndpoint = anxl.newSingularGeneratedExtension(apxu, addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint2, addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint2, null, 123790168, aobm.MESSAGE, AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class);
    }
}
