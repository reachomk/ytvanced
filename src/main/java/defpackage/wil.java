package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wil */
final /* synthetic */ class wil implements OnClickListener {
    private final wih a;
    private final aphg b;
    private final acvx c;
    private final ajsn d;

    wil(wih wih, aphg aphg, acvx acvx, ajsn ajsn) {
        this.a = wih;
        this.b = aphg;
        this.c = acvx;
        this.d = ajsn;
    }

    public final void onClick(View view) {
        wih wih = this.a;
        aphg aphg = this.b;
        acvx acvx = this.c;
        ajsn ajsn = this.d;
        int i = aphg.a;
        if ((i & 4096) == 0) {
            if ((i & 262144) != 0) {
                acvx.a(3, new acvs(aphg.r), null);
            }
            wih.b(ajsn);
            return;
        }
        aaas aaas = wih.d;
        apxu apxu = aphg.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
