package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apnz;
import defpackage.apog;
import defpackage.apxu;

public final class ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint extends anxl implements anzf {
    public static final ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint c;
    public static final anxr channelProfileFieldEditorEndpoint;
    private static volatile anzq e;
    public int a;
    public apog b;
    private byte d = (byte) 2;

    private ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint() {
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
                return new ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint();
            case 4:
                return new apnz();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.class) {
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
        ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint = new ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint();
        c = channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;
        anxl.registerDefaultInstance(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.class, channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint);
        apxu apxu = apxu.d;
        ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint2 = c;
        channelProfileFieldEditorEndpoint = anxl.newSingularGeneratedExtension(apxu, channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint2, channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint2, null, 106088718, aobm.MESSAGE, ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.class);
    }
}
