package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avye;
import defpackage.avyf;

public final class PhonebookEndpointOuterClass$PhonebookEndpoint extends anxl implements anzf {
    public static final PhonebookEndpointOuterClass$PhonebookEndpoint c;
    private static volatile anzq e;
    public static final anxr phonebookEndpoint;
    public int a;
    public avye b;
    private byte d = (byte) 2;

    private PhonebookEndpointOuterClass$PhonebookEndpoint() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new PhonebookEndpointOuterClass$PhonebookEndpoint();
            case 4:
                return new avyf();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (PhonebookEndpointOuterClass$PhonebookEndpoint.class) {
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
        PhonebookEndpointOuterClass$PhonebookEndpoint phonebookEndpointOuterClass$PhonebookEndpoint = new PhonebookEndpointOuterClass$PhonebookEndpoint();
        c = phonebookEndpointOuterClass$PhonebookEndpoint;
        anxl.registerDefaultInstance(PhonebookEndpointOuterClass$PhonebookEndpoint.class, phonebookEndpointOuterClass$PhonebookEndpoint);
        apxu apxu = apxu.d;
        PhonebookEndpointOuterClass$PhonebookEndpoint phonebookEndpointOuterClass$PhonebookEndpoint2 = c;
        phonebookEndpoint = anxl.newSingularGeneratedExtension(apxu, phonebookEndpointOuterClass$PhonebookEndpoint2, phonebookEndpointOuterClass$PhonebookEndpoint2, null, 126338921, aobm.MESSAGE, PhonebookEndpointOuterClass$PhonebookEndpoint.class);
    }
}
