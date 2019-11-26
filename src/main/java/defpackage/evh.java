package defpackage;

import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Map;

/* renamed from: evh */
final class evh implements afsw {
    private final /* synthetic */ Map a;
    private final /* synthetic */ apxu b;
    private final /* synthetic */ evg c;
    private final /* synthetic */ bblw d;
    private final /* synthetic */ evi e;

    evh(evi evi, Map map, apxu apxu, evg evg, bblw bblw) {
        this.e = evi;
        this.a = map;
        this.b = apxu;
        this.c = evg;
        this.d = bblw;
    }

    public final void a(bqn bqn) {
        this.e.a.c(bqn);
        apxu apxu = this.b;
        anxr access$000 = anxl.checkIsLite(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        for (String a : ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) r0).b) {
            akmw a2 = grw.a(this.e.c, a);
            if (a2 != null) {
                this.e.c.a(a2.a(), a2);
            }
        }
        evg evg = this.c;
        if (evg != null) {
            evf evf = evg.b;
            if (evf != null) {
                evf.b();
            }
        }
        bblw bblw = this.d;
        if (bblw != null) {
            bblw.a(bqn);
        }
    }
}
