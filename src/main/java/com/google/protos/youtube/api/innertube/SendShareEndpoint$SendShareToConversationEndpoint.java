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
import defpackage.arml;
import defpackage.aseu;
import defpackage.asfa;
import defpackage.axfm;

public final class SendShareEndpoint$SendShareToConversationEndpoint extends anxl implements anzf {
    public static final SendShareEndpoint$SendShareToConversationEndpoint f;
    private static volatile anzq h;
    public static final anxr sendShareToConversationEndpoint;
    public int a;
    public asfa b;
    public aseu c;
    public aqnn d;
    public arml e;
    private byte g = (byte) 2;

    private SendShareEndpoint$SendShareToConversationEndpoint() {
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
                return new SendShareEndpoint$SendShareToConversationEndpoint();
            case 4:
                return new axfm();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (SendShareEndpoint$SendShareToConversationEndpoint.class) {
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
        SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint = new SendShareEndpoint$SendShareToConversationEndpoint();
        f = sendShareEndpoint$SendShareToConversationEndpoint;
        anxl.registerDefaultInstance(SendShareEndpoint$SendShareToConversationEndpoint.class, sendShareEndpoint$SendShareToConversationEndpoint);
        apxu apxu = apxu.d;
        SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint2 = f;
        sendShareToConversationEndpoint = anxl.newSingularGeneratedExtension(apxu, sendShareEndpoint$SendShareToConversationEndpoint2, sendShareEndpoint$SendShareToConversationEndpoint2, null, 92589349, aobm.MESSAGE, SendShareEndpoint$SendShareToConversationEndpoint.class);
    }
}
