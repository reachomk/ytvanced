package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wuy */
final class wuy implements OnClickListener {
    private final /* synthetic */ wuw a;

    wuy(wuw wuw) {
        this.a = wuw;
    }

    public final void onClick(View view) {
        wuw wuw = this.a;
        azpf a = wuw.at.a();
        if (a != null && !wuw.av) {
            wuw.f(true);
            wph wph = wuw.au;
            String str = a.l;
            long c = wvi.c(a);
            byte[] d = wuw.ar.b.d();
            abmd a2 = wuw.ad.a();
            a2.c(str);
            a2.c = c;
            a2.a(d);
            wph.a(a2);
        }
    }
}
