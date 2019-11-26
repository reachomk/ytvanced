package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apub;
import defpackage.apxu;

public final class ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction extends anxl implements anzf {
    public static final ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction c;
    public static final anxr clearPersistentCacheAction;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction() {
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
                return new ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction();
            case 4:
                return new apub();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.class) {
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
        ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction clearPersistentCacheActionOuterClass$ClearPersistentCacheAction = new ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction();
        c = clearPersistentCacheActionOuterClass$ClearPersistentCacheAction;
        anxl.registerDefaultInstance(ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.class, clearPersistentCacheActionOuterClass$ClearPersistentCacheAction);
        apxu apxu = apxu.d;
        ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction clearPersistentCacheActionOuterClass$ClearPersistentCacheAction2 = c;
        clearPersistentCacheAction = anxl.newSingularGeneratedExtension(apxu, clearPersistentCacheActionOuterClass$ClearPersistentCacheAction2, clearPersistentCacheActionOuterClass$ClearPersistentCacheAction2, null, 166864056, aobm.MESSAGE, ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.class);
    }
}
