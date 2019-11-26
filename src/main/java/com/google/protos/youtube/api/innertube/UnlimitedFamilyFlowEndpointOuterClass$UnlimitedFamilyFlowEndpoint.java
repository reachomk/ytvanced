package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aymo;
import defpackage.aymp;

public final class UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint extends anxl implements anzf {
    public static final UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint c;
    private static volatile anzq e;
    public static final anxr unlimitedFamilyFlowEndpoint;
    public int a;
    public aymo b;
    private byte d = (byte) 2;

    private UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㲔㲔\u0001\u0000\u0000\u0001㲔Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint();
            case 4:
                return new aymp();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint = new UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint();
        c = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
        anxl.registerDefaultInstance(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.class, unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint);
        apxu apxu = apxu.d;
        UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint2 = c;
        unlimitedFamilyFlowEndpoint = anxl.newSingularGeneratedExtension(apxu, unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint2, unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint2, null, 128200871, aobm.MESSAGE, UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.class);
    }
}
