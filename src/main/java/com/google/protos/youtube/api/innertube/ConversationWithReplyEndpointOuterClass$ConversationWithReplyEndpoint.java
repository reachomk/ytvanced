package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqpr;
import defpackage.aqps;
import defpackage.aqtc;

public final class ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint extends anxl implements anzf {
    public static final anxr conversationWithReplyEndpoint;
    public static final ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint g;
    private static volatile anzq i;
    public int a;
    public String b;
    public String c;
    public aqpr d;
    public String e;
    public aqtc f;
    private byte h = (byte) 2;

    private ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0002\u0003\b\u0001\t\t\u0004\n\b\u0003", new Object[]{"a", "b", "d", "c", "f", "e"});
            case 3:
                return new ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint();
            case 4:
                return new aqps();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint = new ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint();
        g = conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint;
        anxl.registerDefaultInstance(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.class, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint);
        apxu apxu = apxu.d;
        ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint2 = g;
        conversationWithReplyEndpoint = anxl.newSingularGeneratedExtension(apxu, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint2, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint2, null, 96329534, aobm.MESSAGE, ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.class);
    }
}
