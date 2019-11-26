package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axts;

public final class StartStreamEndpointOuterClass$StartStreamEndpoint extends anxl implements anzf {
    public static final StartStreamEndpointOuterClass$StartStreamEndpoint c;
    private static volatile anzq e;
    public static final anxr startStreamEndpoint;
    public int a;
    public String b = "";
    private byte d = (byte) 2;

    private StartStreamEndpointOuterClass$StartStreamEndpoint() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\b\u0001", new Object[]{"a", "b"});
            case 3:
                return new StartStreamEndpointOuterClass$StartStreamEndpoint();
            case 4:
                return new axts();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (StartStreamEndpointOuterClass$StartStreamEndpoint.class) {
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
        StartStreamEndpointOuterClass$StartStreamEndpoint startStreamEndpointOuterClass$StartStreamEndpoint = new StartStreamEndpointOuterClass$StartStreamEndpoint();
        c = startStreamEndpointOuterClass$StartStreamEndpoint;
        anxl.registerDefaultInstance(StartStreamEndpointOuterClass$StartStreamEndpoint.class, startStreamEndpointOuterClass$StartStreamEndpoint);
        apxu apxu = apxu.d;
        StartStreamEndpointOuterClass$StartStreamEndpoint startStreamEndpointOuterClass$StartStreamEndpoint2 = c;
        startStreamEndpoint = anxl.newSingularGeneratedExtension(apxu, startStreamEndpointOuterClass$StartStreamEndpoint2, startStreamEndpointOuterClass$StartStreamEndpoint2, null, 147899445, aobm.MESSAGE, StartStreamEndpointOuterClass$StartStreamEndpoint.class);
    }
}
