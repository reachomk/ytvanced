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
import defpackage.aqtc;
import defpackage.axhy;

public final class SharedConversationEndpointOuterClass$SharedConversationEndpoint extends anxl implements anzf {
    public static final SharedConversationEndpointOuterClass$SharedConversationEndpoint i;
    private static volatile anzq k;
    public static final anxr sharedConversationEndpoint;
    public int a;
    public String b;
    public String c;
    public anvu d;
    public long e;
    public aqtc f;
    public String g;
    public apxu h;
    private byte j = (byte) 2;

    private SharedConversationEndpointOuterClass$SharedConversationEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = anvu.a;
        this.g = str;
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001\b\u0001\u0002\b\u0000\u0003\n\u0002\u0004\u0002\u0003\t\t\u0004\n\b\u0005\u000bЉ\u0006", new Object[]{"a", "c", "b", "d", "e", "f", "g", "h"});
            case 3:
                return new SharedConversationEndpointOuterClass$SharedConversationEndpoint();
            case 4:
                return new axhy();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (SharedConversationEndpointOuterClass$SharedConversationEndpoint.class) {
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
        SharedConversationEndpointOuterClass$SharedConversationEndpoint sharedConversationEndpointOuterClass$SharedConversationEndpoint = new SharedConversationEndpointOuterClass$SharedConversationEndpoint();
        i = sharedConversationEndpointOuterClass$SharedConversationEndpoint;
        anxl.registerDefaultInstance(SharedConversationEndpointOuterClass$SharedConversationEndpoint.class, sharedConversationEndpointOuterClass$SharedConversationEndpoint);
        apxu apxu = apxu.d;
        SharedConversationEndpointOuterClass$SharedConversationEndpoint sharedConversationEndpointOuterClass$SharedConversationEndpoint2 = i;
        sharedConversationEndpoint = anxl.newSingularGeneratedExtension(apxu, sharedConversationEndpointOuterClass$SharedConversationEndpoint2, sharedConversationEndpointOuterClass$SharedConversationEndpoint2, null, 99946850, aobm.MESSAGE, SharedConversationEndpointOuterClass$SharedConversationEndpoint.class);
    }
}
