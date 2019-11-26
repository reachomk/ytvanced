package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aoua;
import defpackage.aoud;
import defpackage.apxu;

public final class AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint extends anxl implements anzf {
    public static final anxr androidOsApplicationSettingsEndpoint;
    public static final AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint d;
    private static volatile anzq e;
    public int a;
    public int b;
    public String c = "";

    private AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0000\u0003\b\u0001", new Object[]{"a", "b", aoua.a, "c"});
            case 3:
                return new AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint();
            case 4:
                return new aoud();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class) {
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
        AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint = new AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint();
        d = androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint;
        anxl.registerDefaultInstance(AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class, androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint);
        apxu apxu = apxu.d;
        AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint2 = d;
        androidOsApplicationSettingsEndpoint = anxl.newSingularGeneratedExtension(apxu, androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint2, androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint2, null, 128828810, aobm.MESSAGE, AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class);
    }
}
