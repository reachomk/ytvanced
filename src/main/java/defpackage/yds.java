package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: yds */
final /* synthetic */ class yds implements OnClickListener {
    private final ydq a;
    private final aaas b;
    private final acvx c;

    yds(ydq ydq, aaas aaas, acvx acvx) {
        this.a = ydq;
        this.b = aaas;
        this.c = acvx;
    }

    public final void onClick(View view) {
        ydq ydq = this.a;
        aaas aaas = this.b;
        acvx acvx = this.c;
        if (ydq.e == null || ydq.b == null) {
            apxu apxu = ydq.c;
            if (apxu != null) {
                aaas.a(apxu, null);
            }
        } else {
            ydq.a(false);
            ydq.e.a(ydq.d, ydq.b);
        }
        aphj aphj = ydq.d.i;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        if ((aphg.a & 262144) != 0) {
            aphj aphj2 = ydq.d.i;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            aphg aphg2 = aphj2.b;
            if (aphg2 == null) {
                aphg2 = aphg.s;
            }
            acvx.a(3, new acvs(aphg2.r), null);
        }
    }
}
