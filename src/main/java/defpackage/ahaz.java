package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ahaz */
final /* synthetic */ class ahaz implements OnClickListener {
    private final ahax a;
    private final ahcr b;

    ahaz(ahax ahax, ahcr ahcr) {
        this.a = ahax;
        this.b = ahcr;
    }

    public final void onClick(View view) {
        aphg aphg;
        ahax ahax = this.a;
        ahcr ahcr = this.b;
        if (view == ahax.m) {
            if (ahcr != null) {
                ahcr.a();
            }
            aphg = ahax.o;
        } else if (view != ahax.n) {
            aphg = null;
        } else {
            if (ahcr != null) {
                ahcr.b();
            }
            aphg = ahax.p;
        }
        ahax.a(aphg);
        ahax.l.dismiss();
    }
}
