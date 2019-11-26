package defpackage;

import com.google.protos.youtube.api.innertube.GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint;
import java.util.Map;

/* renamed from: dxt */
public final class dxt implements aaap {
    public final acwa a;
    public final xci b;
    private final aavs c;

    public dxt(aavs aavs, acwa acwa, xci xci) {
        this.c = aavs;
        this.a = acwa;
        this.b = xci;
    }

    public final void a(apxu apxu, Map map) {
        aavs aavs = this.c;
        aaml aavr = new aavr(aavs.c, aavs.d.c());
        aavr.a(apxu.b);
        anxr access$000 = anxl.checkIsLite(GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint.getDataPlanPromoEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aavr.a = ((GetDataPlanPromoEndpointOuterClass$GetDataPlanPromoEndpoint) b).b;
        aavs aavs2 = this.c;
        aavs2.g.a(aavr, new dxw(this));
    }
}
