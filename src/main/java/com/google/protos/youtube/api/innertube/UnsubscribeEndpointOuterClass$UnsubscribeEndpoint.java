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
import defpackage.ayrd;
import defpackage.ayre;

public final class UnsubscribeEndpointOuterClass$UnsubscribeEndpoint extends anxl implements anzf {
    public static final UnsubscribeEndpointOuterClass$UnsubscribeEndpoint f;
    private static volatile anzq h;
    public static final anxr unsubscribeEndpoint;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c;
    public String d;
    public ayrd e;
    private byte g = (byte) 2;

    private UnsubscribeEndpointOuterClass$UnsubscribeEndpoint() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001\u001a\u0002\b\u0000\u0004\b\u0001\u0005Љ\u0002", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new UnsubscribeEndpointOuterClass$UnsubscribeEndpoint();
            case 4:
                return new ayre();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        UnsubscribeEndpointOuterClass$UnsubscribeEndpoint unsubscribeEndpointOuterClass$UnsubscribeEndpoint = new UnsubscribeEndpointOuterClass$UnsubscribeEndpoint();
        f = unsubscribeEndpointOuterClass$UnsubscribeEndpoint;
        anxl.registerDefaultInstance(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class, unsubscribeEndpointOuterClass$UnsubscribeEndpoint);
        apxu apxu = apxu.d;
        UnsubscribeEndpointOuterClass$UnsubscribeEndpoint unsubscribeEndpointOuterClass$UnsubscribeEndpoint2 = f;
        unsubscribeEndpoint = anxl.newSingularGeneratedExtension(apxu, unsubscribeEndpointOuterClass$UnsubscribeEndpoint2, unsubscribeEndpointOuterClass$UnsubscribeEndpoint2, null, 68997401, aobm.MESSAGE, UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class);
    }
}
