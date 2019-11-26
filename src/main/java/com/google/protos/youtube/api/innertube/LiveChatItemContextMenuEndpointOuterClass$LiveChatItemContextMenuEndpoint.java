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
import defpackage.audk;

public final class LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint extends anxl implements anzf {
    public static final LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint c;
    private static volatile anzq d;
    public static final anxr liveChatItemContextMenuEndpoint;
    public int a;
    public anvu b = anvu.a;

    private LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint() {
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
                return new LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint();
            case 4:
                return new audk();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class) {
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
        LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint = new LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint();
        c = liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint;
        anxl.registerDefaultInstance(LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class, liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint);
        apxu apxu = apxu.d;
        LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint2 = c;
        liveChatItemContextMenuEndpoint = anxl.newSingularGeneratedExtension(apxu, liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint2, liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint2, null, 122458429, aobm.MESSAGE, LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class);
    }
}
