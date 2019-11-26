package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axmp;

public final class ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction extends anxl implements anzf {
    public static final ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction c;
    private static volatile anzq d;
    public static final anxr showSubscribePromoAction;
    public int a;
    public String b = "";

    private ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction();
            case 4:
                return new axmp();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class) {
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
        ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction showSubscribePromoActionOuterClass$ShowSubscribePromoAction = new ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction();
        c = showSubscribePromoActionOuterClass$ShowSubscribePromoAction;
        anxl.registerDefaultInstance(ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class, showSubscribePromoActionOuterClass$ShowSubscribePromoAction);
        apxu apxu = apxu.d;
        ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction showSubscribePromoActionOuterClass$ShowSubscribePromoAction2 = c;
        showSubscribePromoAction = anxl.newSingularGeneratedExtension(apxu, showSubscribePromoActionOuterClass$ShowSubscribePromoAction2, showSubscribePromoActionOuterClass$ShowSubscribePromoAction2, null, 147359084, aobm.MESSAGE, ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class);
    }
}
