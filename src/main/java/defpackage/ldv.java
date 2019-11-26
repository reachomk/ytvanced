package defpackage;

import com.google.android.youtube.R;
import java.util.List;

/* renamed from: ldv */
final /* synthetic */ class ldv implements xar {
    private final ldt a;

    ldv(ldt ldt) {
        this.a = ldt;
    }

    public final void accept(Object obj) {
        ldt ldt = this.a;
        aaff aaff = (aaff) obj;
        ldt.l();
        ldt.k();
        ldt.a.a(aaff.b());
        if (aaff.e()) {
            ldt.f.b(R.string.no_results_found);
        } else {
            List d = aaff.d();
            if (!d.isEmpty()) {
                ldt.g.b(((aafp) d.get(0)).a());
            }
            ldt.f.b();
        }
        apxu[] apxuArr = aaff.a.i;
        if (apxuArr != null) {
            ldt.c.a(apxuArr, null);
        }
    }
}
