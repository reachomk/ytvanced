package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aomv;
import defpackage.apxu;

public final class AddContactsEndpointOuterClass$AddContactsEndpoint extends anxl implements anzf {
    public static final anxr addContactsEndpoint;
    public static final AddContactsEndpointOuterClass$AddContactsEndpoint c;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private AddContactsEndpointOuterClass$AddContactsEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\b\u0001", new Object[]{"a", "b"});
            case 3:
                return new AddContactsEndpointOuterClass$AddContactsEndpoint();
            case 4:
                return new aomv();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (AddContactsEndpointOuterClass$AddContactsEndpoint.class) {
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
        AddContactsEndpointOuterClass$AddContactsEndpoint addContactsEndpointOuterClass$AddContactsEndpoint = new AddContactsEndpointOuterClass$AddContactsEndpoint();
        c = addContactsEndpointOuterClass$AddContactsEndpoint;
        anxl.registerDefaultInstance(AddContactsEndpointOuterClass$AddContactsEndpoint.class, addContactsEndpointOuterClass$AddContactsEndpoint);
        apxu apxu = apxu.d;
        AddContactsEndpointOuterClass$AddContactsEndpoint addContactsEndpointOuterClass$AddContactsEndpoint2 = c;
        addContactsEndpoint = anxl.newSingularGeneratedExtension(apxu, addContactsEndpointOuterClass$AddContactsEndpoint2, addContactsEndpointOuterClass$AddContactsEndpoint2, null, 126354119, aobm.MESSAGE, AddContactsEndpointOuterClass$AddContactsEndpoint.class);
    }
}
