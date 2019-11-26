package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aovl;
import defpackage.apxu;
import defpackage.atwo;

public final class AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint extends anxl implements anzf {
    public static final anxr androidShareIntentEndpoint;
    public static final AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint e;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c;
    public String d;
    private byte f = (byte) 2;

    private AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0002\b\u0000\u0004\b\u0001", new Object[]{"a", "b", atwo.class, "c", "d"});
            case 3:
                return new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
            case 4:
                return new aovl();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
        e = androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
        anxl.registerDefaultInstance(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint);
        apxu apxu = apxu.d;
        AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint2 = e;
        androidShareIntentEndpoint = anxl.newSingularGeneratedExtension(apxu, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint2, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint2, null, 106983893, aobm.MESSAGE, AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class);
    }
}
