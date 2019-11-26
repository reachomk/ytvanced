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
import defpackage.augl;
import defpackage.azmo;
import defpackage.azmp;

public final class YpcGetCartEndpoint$YPCGetCartEndpoint extends anxl implements anzf {
    public static final YpcGetCartEndpoint$YPCGetCartEndpoint k;
    private static volatile anzq m;
    public static final anxr ypcGetCartEndpoint;
    public int a;
    public String b;
    public anvu c;
    public String d;
    public long e;
    public String f;
    public augl g;
    public azmo h;
    public String i;
    public long j;
    private byte l = (byte) 2;

    private YpcGetCartEndpoint$YPCGetCartEndpoint() {
        String str = "";
        this.b = str;
        this.c = anvu.a;
        this.d = str;
        this.f = str;
        anxl.emptyProtobufList();
        this.i = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001\b\u0000\u0003Љ\u0006\u0004\n\u0001\u0005\u0002\u0003\u0006\b\u0004\u0007\t\u0005\n\b\t\u000b\u0003\n\f\b\u0002", new Object[]{"a", "b", "h", "c", "e", "f", "g", "i", "j", "d"});
            case 3:
                return new YpcGetCartEndpoint$YPCGetCartEndpoint();
            case 4:
                return new azmp();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (YpcGetCartEndpoint$YPCGetCartEndpoint.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = new YpcGetCartEndpoint$YPCGetCartEndpoint();
        k = ypcGetCartEndpoint$YPCGetCartEndpoint;
        anxl.registerDefaultInstance(YpcGetCartEndpoint$YPCGetCartEndpoint.class, ypcGetCartEndpoint$YPCGetCartEndpoint);
        apxu apxu = apxu.d;
        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint2 = k;
        ypcGetCartEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcGetCartEndpoint$YPCGetCartEndpoint2, ypcGetCartEndpoint$YPCGetCartEndpoint2, null, 95253721, aobm.MESSAGE, YpcGetCartEndpoint$YPCGetCartEndpoint.class);
    }
}
