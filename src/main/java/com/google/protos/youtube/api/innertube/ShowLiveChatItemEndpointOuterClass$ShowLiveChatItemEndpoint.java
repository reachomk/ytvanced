package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.audp;
import defpackage.axlt;

public final class ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint extends anxl implements anzf {
    public static final ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint c;
    private static volatile anzq e;
    public static final anxr showLiveChatItemEndpoint;
    public int a;
    public audp b;
    private byte d = (byte) 2;

    private ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
            case 4:
                return new axlt();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint = new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
        c = showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;
        anxl.registerDefaultInstance(ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class, showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint);
        apxu apxu = apxu.d;
        ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint2 = c;
        showLiveChatItemEndpoint = anxl.newSingularGeneratedExtension(apxu, showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint2, showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint2, null, 135843030, aobm.MESSAGE, ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class);
    }
}
