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
import defpackage.avin;
import defpackage.avio;

public final class MuteAdEndpointOuterClass$MuteAdEndpoint extends anxl implements anzf {
    public static final MuteAdEndpointOuterClass$MuteAdEndpoint d;
    private static volatile anzq f;
    public static final anxr muteAdEndpoint;
    public int a;
    public int b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private MuteAdEndpointOuterClass$MuteAdEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002\f\u0000\u0003Л", new Object[]{"a", "b", avio.a, "c", apxu.class});
            case 3:
                return new MuteAdEndpointOuterClass$MuteAdEndpoint();
            case 4:
                return new avin();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (MuteAdEndpointOuterClass$MuteAdEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint = new MuteAdEndpointOuterClass$MuteAdEndpoint();
        d = muteAdEndpointOuterClass$MuteAdEndpoint;
        anxl.registerDefaultInstance(MuteAdEndpointOuterClass$MuteAdEndpoint.class, muteAdEndpointOuterClass$MuteAdEndpoint);
        apxu apxu = apxu.d;
        MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint2 = d;
        muteAdEndpoint = anxl.newSingularGeneratedExtension(apxu, muteAdEndpointOuterClass$MuteAdEndpoint2, muteAdEndpointOuterClass$MuteAdEndpoint2, null, 69108384, aobm.MESSAGE, MuteAdEndpointOuterClass$MuteAdEndpoint.class);
    }
}
