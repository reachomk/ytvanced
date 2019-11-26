package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aurk;

public final class MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint extends anxl implements anzf {
    public static final MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint a;
    private static volatile anzq b;
    public static final anxr mdxEditPairedScreensEndpoint;

    private MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint() {
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
                return new MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint();
            case 4:
                return new aurk();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint.class) {
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
        MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint mdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint = new MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint();
        a = mdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint;
        anxl.registerDefaultInstance(MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint.class, mdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint);
        apxu apxu = apxu.d;
        MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint mdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint2 = a;
        mdxEditPairedScreensEndpoint = anxl.newSingularGeneratedExtension(apxu, mdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint2, mdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint2, null, 88490428, aobm.MESSAGE, MdxEditPairedScreensEndpointOuterClass$MdxEditPairedScreensEndpoint.class);
    }
}
