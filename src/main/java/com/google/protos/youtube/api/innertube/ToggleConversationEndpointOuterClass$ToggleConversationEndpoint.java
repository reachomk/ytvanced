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
import defpackage.ayhi;

public final class ToggleConversationEndpointOuterClass$ToggleConversationEndpoint extends anxl implements anzf {
    public static final ToggleConversationEndpointOuterClass$ToggleConversationEndpoint b;
    private static volatile anzq d;
    public static final anxr toggleConversationEndpoint;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private ToggleConversationEndpointOuterClass$ToggleConversationEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", apxu.class});
            case 3:
                return new ToggleConversationEndpointOuterClass$ToggleConversationEndpoint();
            case 4:
                return new ayhi();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        ToggleConversationEndpointOuterClass$ToggleConversationEndpoint toggleConversationEndpointOuterClass$ToggleConversationEndpoint = new ToggleConversationEndpointOuterClass$ToggleConversationEndpoint();
        b = toggleConversationEndpointOuterClass$ToggleConversationEndpoint;
        anxl.registerDefaultInstance(ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.class, toggleConversationEndpointOuterClass$ToggleConversationEndpoint);
        apxu apxu = apxu.d;
        ToggleConversationEndpointOuterClass$ToggleConversationEndpoint toggleConversationEndpointOuterClass$ToggleConversationEndpoint2 = b;
        toggleConversationEndpoint = anxl.newSingularGeneratedExtension(apxu, toggleConversationEndpointOuterClass$ToggleConversationEndpoint2, toggleConversationEndpointOuterClass$ToggleConversationEndpoint2, null, 131184017, aobm.MESSAGE, ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.class);
    }
}
