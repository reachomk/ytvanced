package defpackage;

import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Map;

/* renamed from: evd */
final class evd implements afsw {
    private final /* synthetic */ Map a;
    private final /* synthetic */ SubscribeEndpointOuterClass$SubscribeEndpoint b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ evg d;
    private final /* synthetic */ bblw e;
    private final /* synthetic */ apxu f;
    private final /* synthetic */ eve g;

    evd(eve eve, Map map, SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint, boolean z, evg evg, bblw bblw, apxu apxu) {
        this.g = eve;
        this.a = map;
        this.b = subscribeEndpointOuterClass$SubscribeEndpoint;
        this.c = z;
        this.d = evg;
        this.e = bblw;
        this.f = apxu;
    }

    public final void a(bqn bqn) {
        this.g.a.c(bqn);
        apxu apxu = this.f;
        anxr access$000 = anxl.checkIsLite(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        for (String a : ((SubscribeEndpointOuterClass$SubscribeEndpoint) r0).b) {
            grw a2 = grw.a(this.g.c, a);
            if (a2 != null) {
                akmw c = a2.k().b(this.c).c();
                this.g.c.a(c.a(), c);
            }
        }
        evg evg = this.d;
        if (evg != null) {
            evf evf = evg.b;
            if (evf != null) {
                evf.b();
            }
        }
        bblw bblw = this.e;
        if (bblw != null) {
            bblw.a(bqn);
        }
    }
}
