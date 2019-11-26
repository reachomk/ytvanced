package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqmv;
import defpackage.aqpl;

public final class ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint extends anxl implements anzf {
    public static final anxr conversationReplyPanelEndpoint;
    public static final ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint d;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public aqpl c;
    private byte e = (byte) 2;

    private ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint();
            case 4:
                return new aqmv();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint = new ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint();
        d = conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint;
        anxl.registerDefaultInstance(ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.class, conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint);
        apxu apxu = apxu.d;
        ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint2 = d;
        conversationReplyPanelEndpoint = anxl.newSingularGeneratedExtension(apxu, conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint2, conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint2, null, 71845583, aobm.MESSAGE, ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.class);
    }
}
