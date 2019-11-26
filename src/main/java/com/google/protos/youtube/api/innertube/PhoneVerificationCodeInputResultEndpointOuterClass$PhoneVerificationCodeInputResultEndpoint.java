package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avws;
import defpackage.avwu;

public final class PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint extends anxl implements anzf {
    public static final PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint c;
    private static volatile anzq e;
    public static final anxr phoneVerificationCodeInputResultEndpoint;
    public int a;
    public avwu b;
    private byte d = (byte) 2;

    private PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint() {
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
                return new PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint();
            case 4:
                return new avws();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.class) {
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
        PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint = new PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint();
        c = phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint;
        anxl.registerDefaultInstance(PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.class, phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint);
        apxu apxu = apxu.d;
        PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint2 = c;
        phoneVerificationCodeInputResultEndpoint = anxl.newSingularGeneratedExtension(apxu, phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint2, phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint2, null, 132194316, aobm.MESSAGE, PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.class);
    }
}
