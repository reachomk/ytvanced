package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arbb;

public final class EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint extends anxl implements anzf {
    public static final EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint c;
    private static volatile anzq d;
    public static final anxr editVideoThumbnailEndpoint;
    public int a;
    public String b = "";

    private EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint();
            case 4:
                return new arbb();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint = new EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint();
        c = editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint;
        anxl.registerDefaultInstance(EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class, editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint);
        apxu apxu = apxu.d;
        EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint2 = c;
        editVideoThumbnailEndpoint = anxl.newSingularGeneratedExtension(apxu, editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint2, editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint2, null, 136550626, aobm.MESSAGE, EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class);
    }
}
