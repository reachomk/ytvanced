package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.atuy;
import defpackage.axak;

public final class InviteMoreEndpointOuterClass$InviteMoreEndpoint extends anxl implements anzf {
    public static final InviteMoreEndpointOuterClass$InviteMoreEndpoint d;
    private static volatile anzq f;
    public static final anxr inviteMoreEndpoint;
    public int a;
    public String b = "";
    public axak c;
    private byte e = (byte) 2;

    private InviteMoreEndpointOuterClass$InviteMoreEndpoint() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new InviteMoreEndpointOuterClass$InviteMoreEndpoint();
            case 4:
                return new atuy();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (InviteMoreEndpointOuterClass$InviteMoreEndpoint.class) {
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
        InviteMoreEndpointOuterClass$InviteMoreEndpoint inviteMoreEndpointOuterClass$InviteMoreEndpoint = new InviteMoreEndpointOuterClass$InviteMoreEndpoint();
        d = inviteMoreEndpointOuterClass$InviteMoreEndpoint;
        anxl.registerDefaultInstance(InviteMoreEndpointOuterClass$InviteMoreEndpoint.class, inviteMoreEndpointOuterClass$InviteMoreEndpoint);
        apxu apxu = apxu.d;
        InviteMoreEndpointOuterClass$InviteMoreEndpoint inviteMoreEndpointOuterClass$InviteMoreEndpoint2 = d;
        inviteMoreEndpoint = anxl.newSingularGeneratedExtension(apxu, inviteMoreEndpointOuterClass$InviteMoreEndpoint2, inviteMoreEndpointOuterClass$InviteMoreEndpoint2, null, 77296946, aobm.MESSAGE, InviteMoreEndpointOuterClass$InviteMoreEndpoint.class);
    }
}
