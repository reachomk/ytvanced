package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kgr */
final class kgr implements OnClickListener {
    private final /* synthetic */ kgn a;

    public final void onClick(View view) {
        aphv a = this.a.c.a();
        if (kgn.a(a)) {
            for (luc d : this.a.f.a) {
                d.d();
            }
            aaas aaas = this.a.d;
            apxu apxu = a.i;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
            return;
        }
        kgn kgn = this.a;
        kgn.e.a(kgn.b.isSelected() ^ 1);
    }

    /* synthetic */ kgr(kgn kgn) {
        this.a = kgn;
    }
}
