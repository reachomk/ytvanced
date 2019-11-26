package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arxx;

public final class InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint extends anxl implements anzf {
    public static final InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint a;
    private static volatile anzq b;
    public static final anxr inlineMutedSettingsMenuEndpoint;

    private InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint();
            case 4:
                return new arxx();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint = new InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint();
        a = inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint;
        anxl.registerDefaultInstance(InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class, inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint);
        apxu apxu = apxu.d;
        InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint2 = a;
        inlineMutedSettingsMenuEndpoint = anxl.newSingularGeneratedExtension(apxu, inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint2, inlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint2, null, 148127366, aobm.MESSAGE, InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class);
    }
}
