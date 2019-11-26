package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aptj;
import defpackage.apxu;

public final class ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint extends anxl implements anzf {
    public static final ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint c;
    public static final anxr chatVisibilityEndpoint;
    private static volatile anzq d;
    public int a;
    public boolean b;

    private ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007\u0000", new Object[]{"a", "b"});
            case 3:
                return new ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint();
            case 4:
                return new aptj();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.class) {
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
        ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint chatVisibilityEndpointOuterClass$ChatVisibilityEndpoint = new ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint();
        c = chatVisibilityEndpointOuterClass$ChatVisibilityEndpoint;
        anxl.registerDefaultInstance(ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.class, chatVisibilityEndpointOuterClass$ChatVisibilityEndpoint);
        apxu apxu = apxu.d;
        ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint chatVisibilityEndpointOuterClass$ChatVisibilityEndpoint2 = c;
        chatVisibilityEndpoint = anxl.newSingularGeneratedExtension(apxu, chatVisibilityEndpointOuterClass$ChatVisibilityEndpoint2, chatVisibilityEndpointOuterClass$ChatVisibilityEndpoint2, null, 142199674, aobm.MESSAGE, ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.class);
    }
}
