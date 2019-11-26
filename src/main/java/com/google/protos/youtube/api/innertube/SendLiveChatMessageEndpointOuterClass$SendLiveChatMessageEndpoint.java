package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axfj;

public final class SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint extends anxl implements anzf {
    public static final SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint e;
    private static volatile anzq g;
    public static final anxr sendLiveChatMessageEndpoint;
    public int a;
    public anvu b = anvu.a;
    public anyd c = anxl.emptyProtobufList();
    public String d = "";
    private byte f = (byte) 2;

    private SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\n\u0000\u0002Л\u0003\b\u0001", new Object[]{"a", "b", "c", apxu.class, "d"});
            case 3:
                return new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
            case 4:
                return new axfj();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class) {
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
        SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
        e = sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
        anxl.registerDefaultInstance(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class, sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint);
        apxu apxu = apxu.d;
        SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint2 = e;
        sendLiveChatMessageEndpoint = anxl.newSingularGeneratedExtension(apxu, sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint2, sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint2, null, 120929770, aobm.MESSAGE, SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class);
    }
}
