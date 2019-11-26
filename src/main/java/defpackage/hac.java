package defpackage;

import com.google.protos.youtube.api.innertube.ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction;
import java.util.Map;

/* renamed from: hac */
public final class hac implements aaap {
    private final xci a;

    public hac(xci xci) {
        this.a = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        xci xci = this.a;
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        anxr access$000 = anxl.checkIsLite(ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.showPurchaseConfirmationDialogAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        xci.d(new gzu(c, (ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction) b));
    }
}
