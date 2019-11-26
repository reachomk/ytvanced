package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aohq;
import defpackage.aohr;
import defpackage.apxu;

public final class AdFeedbackEndpointOuterClass$AdFeedbackEndpoint extends anxl implements anzf {
    public static final anxr adFeedbackEndpoint;
    public static final AdFeedbackEndpointOuterClass$AdFeedbackEndpoint c;
    private static volatile anzq e;
    public int a;
    public aohq b;
    private byte d = (byte) 2;

    private AdFeedbackEndpointOuterClass$AdFeedbackEndpoint() {
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
                return new AdFeedbackEndpointOuterClass$AdFeedbackEndpoint();
            case 4:
                return new aohr();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class) {
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
        AdFeedbackEndpointOuterClass$AdFeedbackEndpoint adFeedbackEndpointOuterClass$AdFeedbackEndpoint = new AdFeedbackEndpointOuterClass$AdFeedbackEndpoint();
        c = adFeedbackEndpointOuterClass$AdFeedbackEndpoint;
        anxl.registerDefaultInstance(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class, adFeedbackEndpointOuterClass$AdFeedbackEndpoint);
        apxu apxu = apxu.d;
        AdFeedbackEndpointOuterClass$AdFeedbackEndpoint adFeedbackEndpointOuterClass$AdFeedbackEndpoint2 = c;
        adFeedbackEndpoint = anxl.newSingularGeneratedExtension(apxu, adFeedbackEndpointOuterClass$AdFeedbackEndpoint2, adFeedbackEndpointOuterClass$AdFeedbackEndpoint2, null, 79296801, aobm.MESSAGE, AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class);
    }
}
