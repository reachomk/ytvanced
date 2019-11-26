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
import defpackage.aumn;

public final class ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint extends anxl implements anzf {
    public static final ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint c;
    private static volatile anzq d;
    public static final anxr manageLiveChatUserEndpoint;
    public int a;
    public anvu b = anvu.a;

    private ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint() {
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
                return new ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint();
            case 4:
                return new aumn();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.class) {
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
        ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint manageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint = new ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint();
        c = manageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint;
        anxl.registerDefaultInstance(ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.class, manageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint);
        apxu apxu = apxu.d;
        ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint manageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint2 = c;
        manageLiveChatUserEndpoint = anxl.newSingularGeneratedExtension(apxu, manageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint2, manageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint2, null, 133716455, aobm.MESSAGE, ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.class);
    }
}
