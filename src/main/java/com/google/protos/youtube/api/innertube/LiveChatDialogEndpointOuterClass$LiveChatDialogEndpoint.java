package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aucn;
import defpackage.aucp;

public final class LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint extends anxl implements anzf {
    public static final LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint c;
    private static volatile anzq e;
    public static final anxr liveChatDialogEndpoint;
    public int a;
    public aucp b;
    private byte d = (byte) 2;

    private LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint() {
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
                return new LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint();
            case 4:
                return new aucn();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.class) {
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
        LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint = new LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint();
        c = liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint;
        anxl.registerDefaultInstance(LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.class, liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint);
        apxu apxu = apxu.d;
        LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint2 = c;
        liveChatDialogEndpoint = anxl.newSingularGeneratedExtension(apxu, liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint2, liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint2, null, 146867030, aobm.MESSAGE, LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.class);
    }
}
