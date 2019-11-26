package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aufp;

public final class LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint extends anxl implements anzf {
    public static final LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint c;
    private static volatile anzq d;
    public static final anxr liveChatPurchaseMessageEndpoint;
    public int a;
    public anvu b = anvu.a;

    private LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n\u0000", new Object[]{"a", "b"});
            case 3:
                return new LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint();
            case 4:
                return new aufp();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class) {
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
        LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint = new LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint();
        c = liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint;
        anxl.registerDefaultInstance(LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class, liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint);
        apxu apxu = apxu.d;
        LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint2 = c;
        liveChatPurchaseMessageEndpoint = anxl.newSingularGeneratedExtension(apxu, liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint2, liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint2, null, 133030216, aobm.MESSAGE, LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class);
    }
}
