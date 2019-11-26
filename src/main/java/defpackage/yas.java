package defpackage;

import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import java.util.List;

/* renamed from: yas */
final class yas implements afsw {
    private final /* synthetic */ yar a;
    private final /* synthetic */ apxu b;
    private final /* synthetic */ List c;

    yas(yar yar, apxu apxu, List list) {
        this.a = yar;
        this.b = apxu;
        this.c = list;
    }

    public final void a(bqn bqn) {
        yar yar = this.a;
        if (yar != null) {
            apxu apxu = this.b;
            anxr access$000 = anxl.checkIsLite(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            yar.a(((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint) b).b);
        }
    }
}
