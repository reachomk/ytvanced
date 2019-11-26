package defpackage;

import com.google.protos.youtube.api.innertube.ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction;

/* renamed from: gzu */
public final class gzu extends zyf {
    public final awte a;

    public gzu(Object obj, ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction) {
        super(obj);
        axmf axmf = showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.b;
        if (axmf == null) {
            axmf = axmf.c;
        }
        boolean z = true;
        if ((axmf.a & 1) == 0) {
            z = false;
        }
        amqw.b(z);
        axmf = showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.b;
        if (axmf == null) {
            axmf = axmf.c;
        }
        awte awte = axmf.b;
        if (awte == null) {
            awte = awte.j;
        }
        this.a = awte;
    }
}
