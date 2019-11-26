package defpackage;

import com.google.protos.youtube.api.innertube.FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fuj */
public final class fuj implements aaap {
    public final kmc a;
    public final acwa b;
    private final Executor c;
    private final aapn d;

    public fuj(kmc kmc, aapn aapn, acwa acwa, Executor executor) {
        this.a = kmc;
        this.d = aapn;
        this.b = acwa;
        this.c = executor;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.fetchTopicPickerEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.fetchTopicPickerEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint = (FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint) obj;
            if ((fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.a & 1) != 0) {
                aaps a = this.d.a();
                a.c(fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.b);
                a.a(apxu.b);
                asbl asbl = (asbl) asbi.b.createBuilder();
                asbl.a(fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.d);
                a.p = (asbi) ((anxl) asbl.build());
                if (!((fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.a & 2) == 0 || fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.c.isEmpty())) {
                    a.d(fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.c);
                }
                kmc kmc = this.a;
                xoy fum = new fum(this, a);
                if (kmc.f == null) {
                    kmc.a();
                }
                kmc.e.a(fum);
                kmc.e();
                kmc.e.c();
                kmc.e.a();
                kmc.d = true;
                a(a);
            }
        }
    }

    public final void a(aaps aaps) {
        anjv a = this.d.a(aaps, this.c);
        aniv aniv = aniv.a;
        kmc kmc = this.a;
        kmc.getClass();
        xan.a(a, aniv, new ful(kmc), new fuo(this));
    }
}
