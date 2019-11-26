package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kbj */
final class kbj implements OnClickListener {
    private final /* synthetic */ kbg a;

    public final void onClick(View view) {
        appk appk = this.a.b;
        if (appk != null) {
            appm appm = appk.c;
            if (appm == null) {
                appm = appm.c;
            }
            aphg aphg = appm.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 4096) != 0) {
                kbg kbg = this.a;
                aaas aaas = kbg.a;
                appm = kbg.b.c;
                if (appm == null) {
                    appm = appm.c;
                }
                aphg = appm.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                apxu apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
    }

    /* synthetic */ kbj(kbg kbg) {
        this.a = kbg;
    }
}
