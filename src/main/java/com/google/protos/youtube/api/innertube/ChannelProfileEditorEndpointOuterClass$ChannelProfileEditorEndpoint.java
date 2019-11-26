package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apnm;
import defpackage.apxu;

public final class ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint extends anxl implements anzf {
    public static final ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint a;
    private static volatile anzq b;
    public static final anxr channelProfileEditorEndpoint;

    private ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint() {
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
                return new ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint();
            case 4:
                return new apnm();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint.class) {
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
        ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint = new ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint();
        a = channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint;
        anxl.registerDefaultInstance(ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint.class, channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint);
        apxu apxu = apxu.d;
        ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint2 = a;
        channelProfileEditorEndpoint = anxl.newSingularGeneratedExtension(apxu, channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint2, channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint2, null, 101493342, aobm.MESSAGE, ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint.class);
    }
}
