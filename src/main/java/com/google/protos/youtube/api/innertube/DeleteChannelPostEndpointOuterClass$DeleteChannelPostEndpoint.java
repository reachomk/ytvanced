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
import defpackage.aqun;

public final class DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint extends anxl implements anzf {
    public static final DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint d;
    public static final anxr deleteChannelPostEndpoint;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\b\u0000\u0002Л", new Object[]{"a", "b", "c", apxu.class});
            case 3:
                return new DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint();
            case 4:
                return new aqun();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint.class) {
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
        DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint deleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint = new DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint();
        d = deleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint;
        anxl.registerDefaultInstance(DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint.class, deleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint);
        apxu apxu = apxu.d;
        DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint deleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint2 = d;
        deleteChannelPostEndpoint = anxl.newSingularGeneratedExtension(apxu, deleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint2, deleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint2, null, 89668214, aobm.MESSAGE, DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint.class);
    }
}
