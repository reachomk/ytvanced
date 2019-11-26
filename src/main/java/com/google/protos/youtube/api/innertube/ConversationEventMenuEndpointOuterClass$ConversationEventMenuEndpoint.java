package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqlt;

public final class ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint extends anxl implements anzf {
    public static final ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint a;
    private static volatile anzq b;
    public static final anxr conversationEventMenuEndpoint;

    private ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint();
            case 4:
                return new aqlt();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint conversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint = new ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint();
        a = conversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint;
        anxl.registerDefaultInstance(ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint.class, conversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint);
        apxu apxu = apxu.d;
        ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint conversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint2 = a;
        conversationEventMenuEndpoint = anxl.newSingularGeneratedExtension(apxu, conversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint2, conversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint2, null, 98982392, aobm.MESSAGE, ConversationEventMenuEndpointOuterClass$ConversationEventMenuEndpoint.class);
    }
}
