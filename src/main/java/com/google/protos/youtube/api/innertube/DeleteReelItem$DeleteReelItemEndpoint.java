package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqur;

public final class DeleteReelItem$DeleteReelItemEndpoint extends anxl implements anzf {
    public static final DeleteReelItem$DeleteReelItemEndpoint d;
    public static final anxr deleteReelItemEndpoint;
    private static volatile anzq e;
    public int a;
    public String b;
    public String c;

    private DeleteReelItem$DeleteReelItemEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new DeleteReelItem$DeleteReelItemEndpoint();
            case 4:
                return new aqur();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (DeleteReelItem$DeleteReelItemEndpoint.class) {
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
        DeleteReelItem$DeleteReelItemEndpoint deleteReelItem$DeleteReelItemEndpoint = new DeleteReelItem$DeleteReelItemEndpoint();
        d = deleteReelItem$DeleteReelItemEndpoint;
        anxl.registerDefaultInstance(DeleteReelItem$DeleteReelItemEndpoint.class, deleteReelItem$DeleteReelItemEndpoint);
        apxu apxu = apxu.d;
        DeleteReelItem$DeleteReelItemEndpoint deleteReelItem$DeleteReelItemEndpoint2 = d;
        deleteReelItemEndpoint = anxl.newSingularGeneratedExtension(apxu, deleteReelItem$DeleteReelItemEndpoint2, deleteReelItem$DeleteReelItemEndpoint2, null, 152328454, aobm.MESSAGE, DeleteReelItem$DeleteReelItemEndpoint.class);
    }
}
