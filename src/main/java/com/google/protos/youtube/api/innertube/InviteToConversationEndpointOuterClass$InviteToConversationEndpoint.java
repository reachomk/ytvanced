package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.atuz;

public final class InviteToConversationEndpointOuterClass$InviteToConversationEndpoint extends anxl implements anzf {
    public static final InviteToConversationEndpointOuterClass$InviteToConversationEndpoint e;
    private static volatile anzq f;
    public static final anxr inviteToConversationEndpoint;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();

    private InviteToConversationEndpointOuterClass$InviteToConversationEndpoint() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001\b\u0000\u0005\u001a\u0006\u001a", new Object[]{"a", "b", "d", "c"});
            case 3:
                return new InviteToConversationEndpointOuterClass$InviteToConversationEndpoint();
            case 4:
                return new atuz();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (InviteToConversationEndpointOuterClass$InviteToConversationEndpoint.class) {
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
        InviteToConversationEndpointOuterClass$InviteToConversationEndpoint inviteToConversationEndpointOuterClass$InviteToConversationEndpoint = new InviteToConversationEndpointOuterClass$InviteToConversationEndpoint();
        e = inviteToConversationEndpointOuterClass$InviteToConversationEndpoint;
        anxl.registerDefaultInstance(InviteToConversationEndpointOuterClass$InviteToConversationEndpoint.class, inviteToConversationEndpointOuterClass$InviteToConversationEndpoint);
        apxu apxu = apxu.d;
        InviteToConversationEndpointOuterClass$InviteToConversationEndpoint inviteToConversationEndpointOuterClass$InviteToConversationEndpoint2 = e;
        inviteToConversationEndpoint = anxl.newSingularGeneratedExtension(apxu, inviteToConversationEndpointOuterClass$InviteToConversationEndpoint2, inviteToConversationEndpointOuterClass$InviteToConversationEndpoint2, null, 74621980, aobm.MESSAGE, InviteToConversationEndpointOuterClass$InviteToConversationEndpoint.class);
    }
}
