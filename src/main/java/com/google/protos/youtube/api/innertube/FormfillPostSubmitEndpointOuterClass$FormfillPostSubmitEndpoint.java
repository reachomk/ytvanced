package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aojo;
import defpackage.apxu;
import defpackage.arnf;
import defpackage.arng;

public final class FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint extends anxl implements anzf {
    public static final FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint e;
    private static volatile anzq f;
    public static final anxr formfillPostSubmitEndpoint;
    public int a;
    public aojo b;
    public String c = "";
    public int d;

    private FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001\t\u0000\u0006\b\u0005\u0007\f\u0006", new Object[]{"a", "b", "c", "d", arng.a});
            case 3:
                return new FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint();
            case 4:
                return new arnf();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint = new FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint();
        e = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint;
        anxl.registerDefaultInstance(FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class, formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint);
        apxu apxu = apxu.d;
        FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint2 = e;
        formfillPostSubmitEndpoint = anxl.newSingularGeneratedExtension(apxu, formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint2, formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint2, null, 160183255, aobm.MESSAGE, FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class);
    }
}
