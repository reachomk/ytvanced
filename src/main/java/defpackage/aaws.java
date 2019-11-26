package defpackage;

import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: aaws */
final class aaws implements afsw {
    private final /* synthetic */ apxu a;
    private final /* synthetic */ Map b;
    private final /* synthetic */ arjq c;
    private final /* synthetic */ aawr d;

    aaws(aawr aawr, apxu apxu, Map map, arjq arjq) {
        this.d = aawr;
        this.a = apxu;
        this.b = map;
        this.c = arjq;
    }

    public final void a(bqn bqn) {
        this.d.a.d(new aawx(this.a, xsb.c(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        arjq arjq = this.c;
        if (arjq == null || (arjq.a & 32) == 0) {
            this.d.e.a((int) R.string.common_error_generic);
            return;
        }
        aaas aaas = this.d.b;
        apxu apxu = arjq.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, this.b);
    }
}
