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
import defpackage.aqpt;

public final class CopyTextEndpointOuterClass$CopyTextEndpoint extends anxl implements anzf {
    public static final anxr copyTextEndpoint;
    public static final CopyTextEndpointOuterClass$CopyTextEndpoint d;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private CopyTextEndpointOuterClass$CopyTextEndpoint() {
        anxl.emptyProtobufList();
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
                return new CopyTextEndpointOuterClass$CopyTextEndpoint();
            case 4:
                return new aqpt();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (CopyTextEndpointOuterClass$CopyTextEndpoint.class) {
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
        CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint = new CopyTextEndpointOuterClass$CopyTextEndpoint();
        d = copyTextEndpointOuterClass$CopyTextEndpoint;
        anxl.registerDefaultInstance(CopyTextEndpointOuterClass$CopyTextEndpoint.class, copyTextEndpointOuterClass$CopyTextEndpoint);
        apxu apxu = apxu.d;
        CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint2 = d;
        copyTextEndpoint = anxl.newSingularGeneratedExtension(apxu, copyTextEndpointOuterClass$CopyTextEndpoint2, copyTextEndpointOuterClass$CopyTextEndpoint2, null, 90198251, aobm.MESSAGE, CopyTextEndpointOuterClass$CopyTextEndpoint.class);
    }
}
