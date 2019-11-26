package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wir */
final /* synthetic */ class wir implements OnClickListener {
    private final wih a;
    private final aphg b;
    private final acvx c;

    wir(wih wih, aphg aphg, acvx acvx) {
        this.a = wih;
        this.b = aphg;
        this.c = acvx;
    }

    public final void onClick(View view) {
        wih wih = this.a;
        aphg aphg = this.b;
        acvx acvx = this.c;
        int i = aphg.a;
        if ((i & 4096) != 0) {
            if ((i & 262144) != 0) {
                acvx.a(3, new acvs(aphg.r), null);
            }
            aaas aaas = wih.d;
            apxu apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
