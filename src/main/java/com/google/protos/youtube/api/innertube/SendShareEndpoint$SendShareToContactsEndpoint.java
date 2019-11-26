package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqnn;
import defpackage.ases;
import defpackage.asfa;
import defpackage.axfl;

public final class SendShareEndpoint$SendShareToContactsEndpoint extends anxl implements anzf {
    public static final SendShareEndpoint$SendShareToContactsEndpoint f;
    private static volatile anzq h;
    public static final anxr sendShareToContactsEndpoint;
    public int a;
    public asfa b;
    public ases c;
    public aqnn d;
    public apxu e;
    private byte g = (byte) 2;

    private SendShareEndpoint$SendShareToContactsEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\t\u0000\u0002\t\u0001\u0003Љ\u0002\u0004Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new SendShareEndpoint$SendShareToContactsEndpoint();
            case 4:
                return new axfl();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (SendShareEndpoint$SendShareToContactsEndpoint.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = new SendShareEndpoint$SendShareToContactsEndpoint();
        f = sendShareEndpoint$SendShareToContactsEndpoint;
        anxl.registerDefaultInstance(SendShareEndpoint$SendShareToContactsEndpoint.class, sendShareEndpoint$SendShareToContactsEndpoint);
        apxu apxu = apxu.d;
        SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint2 = f;
        sendShareToContactsEndpoint = anxl.newSingularGeneratedExtension(apxu, sendShareEndpoint$SendShareToContactsEndpoint2, sendShareEndpoint$SendShareToContactsEndpoint2, null, 92775415, aobm.MESSAGE, SendShareEndpoint$SendShareToContactsEndpoint.class);
    }
}
