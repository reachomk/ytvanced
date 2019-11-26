package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kbd */
final /* synthetic */ class kbd implements OnClickListener {
    private final kba a;

    kbd(kba kba) {
        this.a = kba;
    }

    public final void onClick(View view) {
        aphg aphg;
        kba kba = this.a;
        aphj aphj = kba.l.c.i;
        if (aphj == null) {
            aphg = null;
        } else {
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        if (aphg == null || (aphg.a & 2048) == 0) {
            kbb kbb = kba.l;
            Object obj = kbb.c;
            apxu apxu = obj.g;
            if (apxu != null) {
                kbb.a.a(apxu, acwi.a(obj));
            }
        } else {
            aaas aaas = kba.l.a;
            apxu apxu2 = aphg.l;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            aaas.a(apxu2, acwi.a(kba.l.c));
        }
        kbb kbb2 = kba.l;
        kbb2.d = true;
        kba kba2 = kbb2.f;
        if (kba2 != null) {
            kba2.a.setVisibility(8);
        }
        kba = kbb2.e;
        if (kba != null) {
            kba.a.setVisibility(8);
        }
    }
}
