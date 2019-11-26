package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aymw;

public final class UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint extends anxl implements anzf {
    public static final UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint d;
    private static volatile anzq e;
    public static final anxr unlimitedManageFamilyEndpoint;
    public int a;
    public String b = "";
    public anvu c = anvu.a;

    private UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint();
            case 4:
                return new aymw();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint = new UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint();
        d = unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint;
        anxl.registerDefaultInstance(UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.class, unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint);
        apxu apxu = apxu.d;
        UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint2 = d;
        unlimitedManageFamilyEndpoint = anxl.newSingularGeneratedExtension(apxu, unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint2, unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint2, null, 129506414, aobm.MESSAGE, UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.class);
    }
}
