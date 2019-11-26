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
import defpackage.axfn;

public final class SendSmsEndpointOuterClass$SendSmsEndpoint extends anxl implements anzf {
    public static final SendSmsEndpointOuterClass$SendSmsEndpoint e;
    private static volatile anzq f;
    public static final anxr sendSmsEndpoint;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c;
    public String d;

    private SendSmsEndpointOuterClass$SendSmsEndpoint() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\b\u0000\u0003\b\u0001", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new SendSmsEndpointOuterClass$SendSmsEndpoint();
            case 4:
                return new axfn();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (SendSmsEndpointOuterClass$SendSmsEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SendSmsEndpointOuterClass$SendSmsEndpoint sendSmsEndpointOuterClass$SendSmsEndpoint = new SendSmsEndpointOuterClass$SendSmsEndpoint();
        e = sendSmsEndpointOuterClass$SendSmsEndpoint;
        anxl.registerDefaultInstance(SendSmsEndpointOuterClass$SendSmsEndpoint.class, sendSmsEndpointOuterClass$SendSmsEndpoint);
        apxu apxu = apxu.d;
        SendSmsEndpointOuterClass$SendSmsEndpoint sendSmsEndpointOuterClass$SendSmsEndpoint2 = e;
        sendSmsEndpoint = anxl.newSingularGeneratedExtension(apxu, sendSmsEndpointOuterClass$SendSmsEndpoint2, sendSmsEndpointOuterClass$SendSmsEndpoint2, null, 75581109, aobm.MESSAGE, SendSmsEndpointOuterClass$SendSmsEndpoint.class);
    }
}
