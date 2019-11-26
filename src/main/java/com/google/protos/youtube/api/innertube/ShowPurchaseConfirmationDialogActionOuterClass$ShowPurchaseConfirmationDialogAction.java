package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axmf;
import defpackage.axmg;

public final class ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction extends anxl implements anzf {
    public static final ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction c;
    private static volatile anzq e;
    public static final anxr showPurchaseConfirmationDialogAction;
    public int a;
    public axmf b;
    private byte d = (byte) 2;

    private ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
            case 4:
                return new axmg();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class) {
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
        ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction = new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
        c = showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction;
        anxl.registerDefaultInstance(ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class, showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction);
        apxu apxu = apxu.d;
        ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction2 = c;
        showPurchaseConfirmationDialogAction = anxl.newSingularGeneratedExtension(apxu, showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction2, showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction2, null, 116405387, aobm.MESSAGE, ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class);
    }
}
