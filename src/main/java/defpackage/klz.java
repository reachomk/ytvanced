package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: klz */
final /* synthetic */ class klz implements OnClickListener {
    private final klw a;

    klz(klw klw) {
        this.a = klw;
    }

    public final void onClick(View view) {
        klw klw = this.a;
        aygy aygy = klw.b;
        apxu apxu = null;
        if (aygy != null) {
            int i = aygy.b;
            if (i == 6) {
                apxu = (apxu) aygy.c;
            } else if (i == 5) {
                apxu = (apxu) aygy.c;
            }
        }
        if (apxu != null) {
            klw.a.a(apxu, klw.c);
        }
    }
}
