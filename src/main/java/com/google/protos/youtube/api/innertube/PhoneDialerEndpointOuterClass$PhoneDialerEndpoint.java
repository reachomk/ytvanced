package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avwj;

public final class PhoneDialerEndpointOuterClass$PhoneDialerEndpoint extends anxl implements anzf {
    public static final PhoneDialerEndpointOuterClass$PhoneDialerEndpoint c;
    private static volatile anzq d;
    public static final anxr phoneDialerEndpoint;
    public int a;
    public String b = "";

    private PhoneDialerEndpointOuterClass$PhoneDialerEndpoint() {
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
                return new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
            case 4:
                return new avwj();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class) {
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
        PhoneDialerEndpointOuterClass$PhoneDialerEndpoint phoneDialerEndpointOuterClass$PhoneDialerEndpoint = new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
        c = phoneDialerEndpointOuterClass$PhoneDialerEndpoint;
        anxl.registerDefaultInstance(PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class, phoneDialerEndpointOuterClass$PhoneDialerEndpoint);
        apxu apxu = apxu.d;
        PhoneDialerEndpointOuterClass$PhoneDialerEndpoint phoneDialerEndpointOuterClass$PhoneDialerEndpoint2 = c;
        phoneDialerEndpoint = anxl.newSingularGeneratedExtension(apxu, phoneDialerEndpointOuterClass$PhoneDialerEndpoint2, phoneDialerEndpointOuterClass$PhoneDialerEndpoint2, null, 100946440, aobm.MESSAGE, PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class);
    }
}
