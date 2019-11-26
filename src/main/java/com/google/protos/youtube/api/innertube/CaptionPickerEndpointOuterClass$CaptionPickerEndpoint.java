package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apit;
import defpackage.apxu;

public final class CaptionPickerEndpointOuterClass$CaptionPickerEndpoint extends anxl implements anzf {
    public static final CaptionPickerEndpointOuterClass$CaptionPickerEndpoint c;
    public static final anxr captionPickerEndpoint;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private CaptionPickerEndpointOuterClass$CaptionPickerEndpoint() {
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
                return new CaptionPickerEndpointOuterClass$CaptionPickerEndpoint();
            case 4:
                return new apit();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.class) {
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
        CaptionPickerEndpointOuterClass$CaptionPickerEndpoint captionPickerEndpointOuterClass$CaptionPickerEndpoint = new CaptionPickerEndpointOuterClass$CaptionPickerEndpoint();
        c = captionPickerEndpointOuterClass$CaptionPickerEndpoint;
        anxl.registerDefaultInstance(CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.class, captionPickerEndpointOuterClass$CaptionPickerEndpoint);
        apxu apxu = apxu.d;
        CaptionPickerEndpointOuterClass$CaptionPickerEndpoint captionPickerEndpointOuterClass$CaptionPickerEndpoint2 = c;
        captionPickerEndpoint = anxl.newSingularGeneratedExtension(apxu, captionPickerEndpointOuterClass$CaptionPickerEndpoint2, captionPickerEndpointOuterClass$CaptionPickerEndpoint2, null, 74232380, aobm.MESSAGE, CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.class);
    }
}
