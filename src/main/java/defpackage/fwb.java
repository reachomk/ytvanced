package defpackage;

import com.google.protos.youtube.api.innertube.PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint;
import java.util.Map;

/* renamed from: fwb */
public final class fwb implements aaap {
    public final aaas a;
    public final joi b;
    private final aavs c;

    public fwb(aaas aaas, aavs aavs, joi joi) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.c = (aavs) amqw.a((Object) aavs);
        this.b = (joi) amqw.a((Object) joi);
    }

    public final void a(apxu apxu, Map map) {
        aavs aavs = this.c;
        aaml aavq = new aavq(aavs.c, aavs.d.c());
        aavq.a(apxu.b);
        anxr access$000 = anxl.checkIsLite(PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint.purchaseDataPlanEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aavq.a = ((PurchaseDataPlanEndpointOuterClass$PurchaseDataPlanEndpoint) b).b;
        aavs aavs2 = this.c;
        aavs2.a.a(aavq, new fwe(this, map));
    }
}
