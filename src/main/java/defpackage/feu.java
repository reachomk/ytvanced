package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: feu */
public final /* synthetic */ class feu implements OnClickListener {
    private final fev a;
    private final fez b;

    public feu(fev fev, fez fez) {
        this.a = fev;
        this.b = fez;
    }

    public final void onClick(View view) {
        fev fev = this.a;
        fez fez = this.b;
        if (fez.e().a()) {
            ((OnClickListener) fez.e().b()).onClick(view);
        }
        int g = fez.g();
        int i = g - 1;
        if (g != 0) {
            if (i != 4) {
                akxw akxw = fev.e;
                if (akxw != null) {
                    akxw.H_();
                    return;
                }
            } else if (fez.c().a()) {
                fev.b.a((apxu) fez.c().b(), null);
            }
            return;
        }
        throw null;
    }
}
