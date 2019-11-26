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
import defpackage.aymn;
import defpackage.aynt;

public final class UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint extends anxl implements anzf {
    public static final UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint i;
    private static volatile anzq k;
    public static final anxr unlimitedCreateFamilyEndpoint;
    public int a;
    public String b;
    public aynt c;
    public aynt d;
    public apxu e;
    public apxu f;
    public String g;
    public anvu h;
    private byte j = (byte) 2;

    private UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint() {
        String str = "";
        this.b = str;
        this.g = str;
        this.h = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001\b\u0000\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007\b\u0006\b\n\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint();
            case 4:
                return new aymn();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = new UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint();
        i = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
        anxl.registerDefaultInstance(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class, unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint);
        apxu apxu = apxu.d;
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint2 = i;
        unlimitedCreateFamilyEndpoint = anxl.newSingularGeneratedExtension(apxu, unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint2, unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint2, null, 128069078, aobm.MESSAGE, UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class);
    }
}
