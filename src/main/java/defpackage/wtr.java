package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wtr */
final /* synthetic */ class wtr implements OnClickListener {
    private final aaas a;
    private final aphg b;

    wtr(aaas aaas, aphg aphg) {
        this.a = aaas;
        this.b = aphg;
    }

    public final void onClick(View view) {
        aaas aaas = this.a;
        apxu apxu = this.b.n;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
