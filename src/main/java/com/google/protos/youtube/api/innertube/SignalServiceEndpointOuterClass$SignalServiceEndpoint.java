package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axnq;

public final class SignalServiceEndpointOuterClass$SignalServiceEndpoint extends anxl implements anzf {
    public static final SignalServiceEndpointOuterClass$SignalServiceEndpoint b;
    private static volatile anzq d;
    public static final anxr signalServiceEndpoint;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private SignalServiceEndpointOuterClass$SignalServiceEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", apxu.class});
            case 3:
                return new SignalServiceEndpointOuterClass$SignalServiceEndpoint();
            case 4:
                return new axnq();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (SignalServiceEndpointOuterClass$SignalServiceEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        SignalServiceEndpointOuterClass$SignalServiceEndpoint signalServiceEndpointOuterClass$SignalServiceEndpoint = new SignalServiceEndpointOuterClass$SignalServiceEndpoint();
        b = signalServiceEndpointOuterClass$SignalServiceEndpoint;
        anxl.registerDefaultInstance(SignalServiceEndpointOuterClass$SignalServiceEndpoint.class, signalServiceEndpointOuterClass$SignalServiceEndpoint);
        apxu apxu = apxu.d;
        SignalServiceEndpointOuterClass$SignalServiceEndpoint signalServiceEndpointOuterClass$SignalServiceEndpoint2 = b;
        signalServiceEndpoint = anxl.newSingularGeneratedExtension(apxu, signalServiceEndpointOuterClass$SignalServiceEndpoint2, signalServiceEndpointOuterClass$SignalServiceEndpoint2, null, 124290411, aobm.MESSAGE, SignalServiceEndpointOuterClass$SignalServiceEndpoint.class);
    }
}
