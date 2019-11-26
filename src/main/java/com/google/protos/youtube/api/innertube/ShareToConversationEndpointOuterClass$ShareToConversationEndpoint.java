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
import defpackage.aqnn;
import defpackage.axhs;
import defpackage.axhv;

public final class ShareToConversationEndpointOuterClass$ShareToConversationEndpoint extends anxl implements anzf {
    public static final ShareToConversationEndpointOuterClass$ShareToConversationEndpoint i;
    private static volatile anzq k;
    public static final anxr shareToConversationEndpoint;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public axhs d;
    public String e;
    public String f;
    public aqnn g;
    public String h;
    private byte j = (byte) 2;

    private ShareToConversationEndpointOuterClass$ShareToConversationEndpoint() {
        String str = "";
        this.e = str;
        this.f = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0001\u0001\u001a\u0002\u001a\u0003\b\u0001\u0004\b\u0002\u0006Љ\u0003\u0007\b\u0004\b\t\u0000", new Object[]{"a", "b", "c", "e", "f", "g", "h", "d"});
            case 3:
                return new ShareToConversationEndpointOuterClass$ShareToConversationEndpoint();
            case 4:
                return new axhv();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (ShareToConversationEndpointOuterClass$ShareToConversationEndpoint.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ShareToConversationEndpointOuterClass$ShareToConversationEndpoint shareToConversationEndpointOuterClass$ShareToConversationEndpoint = new ShareToConversationEndpointOuterClass$ShareToConversationEndpoint();
        i = shareToConversationEndpointOuterClass$ShareToConversationEndpoint;
        anxl.registerDefaultInstance(ShareToConversationEndpointOuterClass$ShareToConversationEndpoint.class, shareToConversationEndpointOuterClass$ShareToConversationEndpoint);
        apxu apxu = apxu.d;
        ShareToConversationEndpointOuterClass$ShareToConversationEndpoint shareToConversationEndpointOuterClass$ShareToConversationEndpoint2 = i;
        shareToConversationEndpoint = anxl.newSingularGeneratedExtension(apxu, shareToConversationEndpointOuterClass$ShareToConversationEndpoint2, shareToConversationEndpointOuterClass$ShareToConversationEndpoint2, null, 78309992, aobm.MESSAGE, ShareToConversationEndpointOuterClass$ShareToConversationEndpoint.class);
    }
}
