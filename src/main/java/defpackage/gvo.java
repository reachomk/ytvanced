package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gvo */
final class gvo implements OnClickListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ apnp b;
    private final /* synthetic */ gvg c;

    gvo(gvg gvg, int i, apnp apnp) {
        this.c = gvg;
        this.a = i;
        this.b = apnp;
    }

    public final void onClick(View view) {
        gvg gvg = this.c;
        gvg.aq = this.a;
        aaas aaas = gvg.al;
        apxu apxu = this.b.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
