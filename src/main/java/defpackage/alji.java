package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alji */
final class alji implements OnClickListener {
    private final /* synthetic */ aljg a;

    alji(aljg aljg) {
        this.a = aljg;
    }

    public final void onClick(View view) {
        alff alff = (alff) this.a.ae;
        aqia aqia = (aqia) alff.d;
        if (aqia != null) {
            aphj aphj = aqia.f;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 4096) != 0) {
                aaas aaas = alff.a;
                aphj aphj2 = aqia.f;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphg aphg2 = aphj2.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                apxu apxu = aphg2.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
        this.a.f();
    }
}
