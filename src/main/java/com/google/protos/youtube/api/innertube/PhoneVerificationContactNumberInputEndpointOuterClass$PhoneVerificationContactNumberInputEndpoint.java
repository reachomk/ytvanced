package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avxi;
import defpackage.avxk;

public final class PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint extends anxl implements anzf {
    public static final PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint c;
    private static volatile anzq e;
    public static final anxr phoneVerificationContactNumberInputEndpoint;
    public int a;
    public avxk b;
    private byte d = (byte) 2;

    private PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint() {
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
                return new PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint();
            case 4:
                return new avxi();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.class) {
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
        PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint = new PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint();
        c = phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint;
        anxl.registerDefaultInstance(PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.class, phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint);
        apxu apxu = apxu.d;
        PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint2 = c;
        phoneVerificationContactNumberInputEndpoint = anxl.newSingularGeneratedExtension(apxu, phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint2, phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint2, null, 134477788, aobm.MESSAGE, PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.class);
    }
}
