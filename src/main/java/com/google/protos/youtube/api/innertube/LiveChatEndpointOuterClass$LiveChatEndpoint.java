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
import defpackage.aucu;
import defpackage.aufw;

public final class LiveChatEndpointOuterClass$LiveChatEndpoint extends anxl implements anzf {
    public static final LiveChatEndpointOuterClass$LiveChatEndpoint d;
    private static volatile anzq f;
    public static final anxr liveChatEndpoint;
    public int a;
    public anvu b = anvu.a;
    public aufw c;
    private byte e = (byte) 2;

    private LiveChatEndpointOuterClass$LiveChatEndpoint() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\n\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new LiveChatEndpointOuterClass$LiveChatEndpoint();
            case 4:
                return new aucu();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (LiveChatEndpointOuterClass$LiveChatEndpoint.class) {
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
        LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = new LiveChatEndpointOuterClass$LiveChatEndpoint();
        d = liveChatEndpointOuterClass$LiveChatEndpoint;
        anxl.registerDefaultInstance(LiveChatEndpointOuterClass$LiveChatEndpoint.class, liveChatEndpointOuterClass$LiveChatEndpoint);
        apxu apxu = apxu.d;
        LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint2 = d;
        liveChatEndpoint = anxl.newSingularGeneratedExtension(apxu, liveChatEndpointOuterClass$LiveChatEndpoint2, liveChatEndpointOuterClass$LiveChatEndpoint2, null, 132716540, aobm.MESSAGE, LiveChatEndpointOuterClass$LiveChatEndpoint.class);
    }
}
