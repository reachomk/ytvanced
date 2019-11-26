package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.araz;

public final class EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint extends anxl implements anzf {
    public static final EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint c;
    private static volatile anzq d;
    public static final anxr editVideoMetadataEndpoint;
    public int a;
    public String b = "";

    private EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint() {
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
                return new EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint();
            case 4:
                return new araz();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class) {
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
        EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint = new EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint();
        c = editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint;
        anxl.registerDefaultInstance(EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint);
        apxu apxu = apxu.d;
        EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint2 = c;
        editVideoMetadataEndpoint = anxl.newSingularGeneratedExtension(apxu, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint2, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint2, null, 63560970, aobm.MESSAGE, EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class);
    }
}
