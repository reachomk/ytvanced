package defpackage;

import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CreateTimeDelayedEndpoint;
import java.util.Map;

/* renamed from: fxt */
final class fxt implements Runnable {
    private final TimeDelayedEndpoint$CreateTimeDelayedEndpoint a;
    private final Map b;
    private final String c;
    private final /* synthetic */ fxu d;

    public fxt(fxu fxu, TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint, Map map, String str) {
        this.d = fxu;
        this.a = timeDelayedEndpoint$CreateTimeDelayedEndpoint;
        this.b = map;
        this.c = str;
    }

    public final void run() {
        aabd.a(this.d.a, this.a.d, this.b);
        aabd.a(this.d.a, this.a.f, this.b);
        aaas aaas = this.d.a;
        apxu apxu = this.a.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, this.b);
        this.d.b.remove(this.c);
    }
}
