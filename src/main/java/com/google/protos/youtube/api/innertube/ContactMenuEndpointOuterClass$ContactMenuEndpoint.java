package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqkh;
import defpackage.aqtc;

public final class ContactMenuEndpointOuterClass$ContactMenuEndpoint extends anxl implements anzf {
    public static final anxr contactMenuEndpoint;
    public static final ContactMenuEndpointOuterClass$ContactMenuEndpoint d;
    private static volatile anzq e;
    public int a;
    public String b = "";
    public aqtc c;

    private ContactMenuEndpointOuterClass$ContactMenuEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\b\u0000\u0003\t\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ContactMenuEndpointOuterClass$ContactMenuEndpoint();
            case 4:
                return new aqkh();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ContactMenuEndpointOuterClass$ContactMenuEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        ContactMenuEndpointOuterClass$ContactMenuEndpoint contactMenuEndpointOuterClass$ContactMenuEndpoint = new ContactMenuEndpointOuterClass$ContactMenuEndpoint();
        d = contactMenuEndpointOuterClass$ContactMenuEndpoint;
        anxl.registerDefaultInstance(ContactMenuEndpointOuterClass$ContactMenuEndpoint.class, contactMenuEndpointOuterClass$ContactMenuEndpoint);
        apxu apxu = apxu.d;
        ContactMenuEndpointOuterClass$ContactMenuEndpoint contactMenuEndpointOuterClass$ContactMenuEndpoint2 = d;
        contactMenuEndpoint = anxl.newSingularGeneratedExtension(apxu, contactMenuEndpointOuterClass$ContactMenuEndpoint2, contactMenuEndpointOuterClass$ContactMenuEndpoint2, null, 98695964, aobm.MESSAGE, ContactMenuEndpointOuterClass$ContactMenuEndpoint.class);
    }
}
