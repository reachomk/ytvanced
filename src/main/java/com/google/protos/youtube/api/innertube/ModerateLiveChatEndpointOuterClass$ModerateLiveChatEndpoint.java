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
import defpackage.avci;

public final class ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint extends anxl implements anzf {
    public static final ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint c;
    private static volatile anzq d;
    public static final anxr moderateLiveChatEndpoint;
    public int a;
    public anvu b = anvu.a;

    private ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint() {
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
                return new ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint();
            case 4:
                return new avci();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class) {
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
        ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint = new ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint();
        c = moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint;
        anxl.registerDefaultInstance(ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class, moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint);
        apxu apxu = apxu.d;
        ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint2 = c;
        moderateLiveChatEndpoint = anxl.newSingularGeneratedExtension(apxu, moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint2, moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint2, null, 125606357, aobm.MESSAGE, ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class);
    }
}
