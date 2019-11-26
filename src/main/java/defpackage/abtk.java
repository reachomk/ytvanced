package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abtk */
final class abtk implements OnClickListener {
    private final /* synthetic */ aphg a;
    private final /* synthetic */ abtl b;

    abtk(abtl abtl, aphg aphg) {
        this.b = abtl;
        this.a = aphg;
    }

    public final void onClick(View view) {
        aaas aaas = this.b.a;
        apxu apxu = this.a.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
