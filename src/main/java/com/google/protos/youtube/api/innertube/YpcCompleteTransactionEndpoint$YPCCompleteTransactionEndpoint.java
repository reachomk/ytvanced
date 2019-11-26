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
import defpackage.azml;

public final class YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint extends anxl implements anzf {
    public static final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint d;
    private static volatile anzq f;
    public static final anxr ypcCompleteTransactionEndpoint;
    public int a;
    public String b = "";
    public anvu c;
    private byte e = (byte) 2;

    private YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint() {
        anxl.emptyProtobufList();
        this.c = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\b\u0000\u0003\n\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint();
            case 4:
                return new azml();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint = new YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint();
        d = ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
        anxl.registerDefaultInstance(YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint);
        apxu apxu = apxu.d;
        YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint2 = d;
        ypcCompleteTransactionEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint2, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint2, null, 137730199, aobm.MESSAGE, YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class);
    }
}
