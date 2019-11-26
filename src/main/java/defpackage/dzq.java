package defpackage;

import com.google.protos.youtube.api.innertube.ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
import java.util.Map;

/* renamed from: dzq */
public final class dzq implements aaap {
    public final fmx a;

    public dzq(fmx fmx) {
        this.a = fmx;
    }

    public final void a(apxu apxu, Map map) {
        akxv akxv = (akxv) xsb.a(map, (Object) "sectionListController", akxv.class);
        if (akxv != null) {
            anxr access$000 = anxl.checkIsLite(ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.scrollToSectionEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint = (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint) b;
            Runnable dzp = (scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.a & 2) != 0 ? new dzp(this, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint) : null;
            akvy a = akxv.a(scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.b);
            if (a != null && a.a() != null && a.a().d() > 0) {
                akxv.a(scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.b, dzp);
            } else if (dzp != null) {
                dzp.run();
            }
        }
    }
}
