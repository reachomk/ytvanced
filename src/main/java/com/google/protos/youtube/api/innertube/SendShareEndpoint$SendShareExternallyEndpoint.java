package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aseo;
import defpackage.aseq;
import defpackage.asfa;
import defpackage.axfk;

public final class SendShareEndpoint$SendShareExternallyEndpoint extends anxl implements anzf {
    public static final SendShareEndpoint$SendShareExternallyEndpoint e;
    private static volatile anzq g;
    public static final anxr sendShareExternallyEndpoint;
    public int a;
    public asfa b;
    public aseq c;
    public aseo d;
    private byte f = (byte) 2;

    private SendShareEndpoint$SendShareExternallyEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\t\u0000\u0002\t\u0001\u0004Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new SendShareEndpoint$SendShareExternallyEndpoint();
            case 4:
                return new axfk();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (SendShareEndpoint$SendShareExternallyEndpoint.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = new SendShareEndpoint$SendShareExternallyEndpoint();
        e = sendShareEndpoint$SendShareExternallyEndpoint;
        anxl.registerDefaultInstance(SendShareEndpoint$SendShareExternallyEndpoint.class, sendShareEndpoint$SendShareExternallyEndpoint);
        apxu apxu = apxu.d;
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = e;
        sendShareExternallyEndpoint = anxl.newSingularGeneratedExtension(apxu, sendShareEndpoint$SendShareExternallyEndpoint2, sendShareEndpoint$SendShareExternallyEndpoint2, null, 92310068, aobm.MESSAGE, SendShareEndpoint$SendShareExternallyEndpoint.class);
    }
}
