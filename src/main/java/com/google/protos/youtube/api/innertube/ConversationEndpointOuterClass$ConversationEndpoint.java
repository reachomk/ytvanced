package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqls;

public final class ConversationEndpointOuterClass$ConversationEndpoint extends anxl implements anzf {
    public static final ConversationEndpointOuterClass$ConversationEndpoint c;
    public static final anxr conversationEndpoint;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private ConversationEndpointOuterClass$ConversationEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new ConversationEndpointOuterClass$ConversationEndpoint();
            case 4:
                return new aqls();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ConversationEndpointOuterClass$ConversationEndpoint.class) {
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
        ConversationEndpointOuterClass$ConversationEndpoint conversationEndpointOuterClass$ConversationEndpoint = new ConversationEndpointOuterClass$ConversationEndpoint();
        c = conversationEndpointOuterClass$ConversationEndpoint;
        anxl.registerDefaultInstance(ConversationEndpointOuterClass$ConversationEndpoint.class, conversationEndpointOuterClass$ConversationEndpoint);
        apxu apxu = apxu.d;
        ConversationEndpointOuterClass$ConversationEndpoint conversationEndpointOuterClass$ConversationEndpoint2 = c;
        conversationEndpoint = anxl.newSingularGeneratedExtension(apxu, conversationEndpointOuterClass$ConversationEndpoint2, conversationEndpointOuterClass$ConversationEndpoint2, null, 71845582, aobm.MESSAGE, ConversationEndpointOuterClass$ConversationEndpoint.class);
    }
}
