package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apkx;
import defpackage.aplh;
import defpackage.apxu;

public final class ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint extends anxl implements anzf {
    public static final anxr channelCreationFormEndpoint;
    public static final ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint d;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;
    public int c;

    private ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0000\u0003\f\u0001", new Object[]{"a", "b", "c", aplh.a});
            case 3:
                return new ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint();
            case 4:
                return new apkx();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class) {
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
        ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint = new ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint();
        d = channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
        anxl.registerDefaultInstance(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint);
        apxu apxu = apxu.d;
        ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint2 = d;
        channelCreationFormEndpoint = anxl.newSingularGeneratedExtension(apxu, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint2, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint2, null, 77125633, aobm.MESSAGE, ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class);
    }
}
