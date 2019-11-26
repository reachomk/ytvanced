package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gfv */
final /* synthetic */ class gfv implements OnClickListener {
    private final gfs a;
    private final aphg b;
    private final acvx c;

    gfv(gfs gfs, aphg aphg, acvx acvx) {
        this.a = gfs;
        this.b = aphg;
        this.c = acvx;
    }

    public final void onClick(View view) {
        gfs gfs = this.a;
        aphg aphg = this.b;
        acvx acvx = this.c;
        if ((aphg.a & 262144) != 0) {
            acvx.a(3, new acvs(aphg.r), null);
        }
        aaas aaas = gfs.a;
        apxu apxu = aphg.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
