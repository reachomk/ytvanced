package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axlq;
import defpackage.axlr;

public final class ShowInterstitialActionOuterClass$ShowInterstitialAction extends anxl implements anzf {
    public static final ShowInterstitialActionOuterClass$ShowInterstitialAction d;
    private static volatile anzq f;
    public static final anxr showInterstitialAction;
    public int a;
    public axlq b;
    public boolean c;
    private byte e = (byte) 2;

    private ShowInterstitialActionOuterClass$ShowInterstitialAction() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0003\u0007\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new ShowInterstitialActionOuterClass$ShowInterstitialAction();
            case 4:
                return new axlr();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ShowInterstitialActionOuterClass$ShowInterstitialAction.class) {
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
        ShowInterstitialActionOuterClass$ShowInterstitialAction showInterstitialActionOuterClass$ShowInterstitialAction = new ShowInterstitialActionOuterClass$ShowInterstitialAction();
        d = showInterstitialActionOuterClass$ShowInterstitialAction;
        anxl.registerDefaultInstance(ShowInterstitialActionOuterClass$ShowInterstitialAction.class, showInterstitialActionOuterClass$ShowInterstitialAction);
        apxu apxu = apxu.d;
        ShowInterstitialActionOuterClass$ShowInterstitialAction showInterstitialActionOuterClass$ShowInterstitialAction2 = d;
        showInterstitialAction = anxl.newSingularGeneratedExtension(apxu, showInterstitialActionOuterClass$ShowInterstitialAction2, showInterstitialActionOuterClass$ShowInterstitialAction2, null, 152165632, aobm.MESSAGE, ShowInterstitialActionOuterClass$ShowInterstitialAction.class);
    }
}
