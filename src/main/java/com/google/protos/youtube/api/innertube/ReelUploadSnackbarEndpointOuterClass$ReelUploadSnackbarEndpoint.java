package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awyr;

public final class ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint extends anxl implements anzf {
    public static final ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint d;
    private static volatile anzq f;
    public static final anxr reelUploadSnackbarEndpoint;
    public int a;
    public apxu b;
    public String c = "";
    private byte e = (byte) 2;

    private ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint();
            case 4:
                return new awyr();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint.class) {
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
        ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint = new ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint();
        d = reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint;
        anxl.registerDefaultInstance(ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint.class, reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint);
        apxu apxu = apxu.d;
        ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint2 = d;
        reelUploadSnackbarEndpoint = anxl.newSingularGeneratedExtension(apxu, reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint2, reelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint2, null, 167221110, aobm.MESSAGE, ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint.class);
    }
}
