package defpackage;

import com.google.protos.youtube.api.innertube.ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint;
import java.util.Map;

/* renamed from: eah */
public final class eah implements aaap {
    private final aaas a;

    public eah(aaas aaas) {
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        aaas aaas = this.a;
        anxr access$000 = anxl.checkIsLite(ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint.showPurchaseConfirmationEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        apxu = ((ShowPurchaseConfirmationEndpointOuterClass$ShowPurchaseConfirmationEndpoint) b).b;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
