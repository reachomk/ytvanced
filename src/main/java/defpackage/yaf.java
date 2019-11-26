package defpackage;

import com.google.protos.youtube.api.innertube.EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint;
import java.util.Map;

/* renamed from: yaf */
public final class yaf implements aaap {
    public final aaas a;
    public final xoi b;
    private final aarh c;

    public yaf(aarh aarh, aaas aaas, xoi xoi) {
        this.c = (aarh) amqw.a((Object) aarh);
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (xoi) amqw.a((Object) xoi);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anjg anjg = (anjg) map.get("EndpointUtil.FutureCallback");
        aarh aarh = this.c;
        anxr access$000 = anxl.checkIsLite(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.editNonGaiaConnectionStateEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        String str = ((EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint) obj).b;
        anvu anvu = apxu.b;
        afsw yai = new yai(this, map, anjg);
        aaml aati = new aati(aarh.c, aarh.d.c(), str);
        aati.a(anvu);
        aarh.a(asmk.d, aarh.g, aasa.a, aasc.a).a(aati, yai);
    }
}
