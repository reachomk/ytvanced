package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqms;

public final class ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint extends anxl implements anzf {
    public static final anxr conversationParticipantsEndpoint;
    public static final ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint e;
    private static volatile anzq f;
    public int a;
    public String b;
    public String c;
    public String d;

    private ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint() {
        String str = "";
        this.b = str;
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint();
            case 4:
                return new aqms();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.class) {
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
        ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint = new ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint();
        e = conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint;
        anxl.registerDefaultInstance(ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.class, conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint);
        apxu apxu = apxu.d;
        ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint2 = e;
        conversationParticipantsEndpoint = anxl.newSingularGeneratedExtension(apxu, conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint2, conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint2, null, 80296137, aobm.MESSAGE, ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.class);
    }
}
