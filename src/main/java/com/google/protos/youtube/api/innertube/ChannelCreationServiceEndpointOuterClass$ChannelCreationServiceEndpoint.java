package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aplg;
import defpackage.apxu;
import defpackage.azrm;

public final class ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint extends anxl implements anzf {
    public static final anxr channelCreationServiceEndpoint;
    public static final ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint d;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;
    public azrm c;

    private ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0000\u0003\t\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint();
            case 4:
                return new aplg();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = new ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint();
        d = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
        anxl.registerDefaultInstance(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.class, channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint);
        apxu apxu = apxu.d;
        ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint2 = d;
        channelCreationServiceEndpoint = anxl.newSingularGeneratedExtension(apxu, channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint2, channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint2, null, 75058710, aobm.MESSAGE, ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.class);
    }
}
