package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;

/* renamed from: dzp */
final /* synthetic */ class dzp implements Runnable {
    private final dzq a;
    private final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint b;

    dzp(dzq dzq, ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint) {
        this.a = dzq;
        this.b = scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
    }

    public final void run() {
        dzq dzq = this.a;
        ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint = this.b;
        fmx fmx = dzq.a;
        String str = scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.c;
        fmx.a();
        fmy fmy = (fmy) fmx.e.get(str);
        if (fmy != null) {
            View view = (View) fmy.a.get();
            aruh aruh = (aruh) fmy.b.get();
            acvx acvx = (acvx) fmy.c.get();
            albc albc = (albc) fmy.d.get();
            if (view != null && aruh != null && view.isShown() && abe.H(view)) {
                fmx.a(aruh, view, null, acvx, albc, true, false);
                return;
            }
            fmx.e.remove(str);
        }
    }
}
