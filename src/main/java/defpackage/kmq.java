package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kmq */
final class kmq implements OnClickListener {
    private final /* synthetic */ kmr a;

    kmq(kmr kmr) {
        this.a = kmr;
    }

    public final void onClick(View view) {
        kmr kmr = this.a;
        ayxd ayxd = kmr.b;
        if (ayxd != null) {
            aphj aphj = ayxd.d;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 2048) != 0) {
                aaas aaas = kmr.a;
                aphj aphj2 = ayxd.d;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphg aphg2 = aphj2.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                apxu apxu = aphg2.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
            kmr = this.a;
            if (kmr.c != null) {
                aphj aphj3 = kmr.b.d;
                if (aphj3 == null) {
                    aphj3 = aphj.d;
                }
                if ((aphj3.a & 1) != 0) {
                    aphj3 = this.a.b.d;
                    if (aphj3 == null) {
                        aphj3 = aphj.d;
                    }
                    aphg aphg3 = aphj3.b;
                    if (aphg3 == null) {
                        aphg3 = aphg.s;
                    }
                    if ((aphg3.a & 262144) != 0) {
                        kmr = this.a;
                        acvx acvx = kmr.c;
                        aphj3 = kmr.b.d;
                        if (aphj3 == null) {
                            aphj3 = aphj.d;
                        }
                        aphg3 = aphj3.b;
                        if (aphg3 == null) {
                            aphg3 = aphg.s;
                        }
                        acvx.a(3, new acvs(aphg3.r), null);
                    }
                }
            }
        }
    }
}
