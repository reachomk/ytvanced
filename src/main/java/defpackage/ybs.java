package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ybs */
public final /* synthetic */ class ybs implements OnClickListener {
    private final ybo a;

    public ybs(ybo ybo) {
        this.a = ybo;
    }

    public final void onClick(View view) {
        zcq zcq = this.a.az;
        if (!zcq.d) {
            aphv a = zcq.a(zcq.f);
            if (!(a == null || (a.a & 512) == 0)) {
                aaas aaas = zcq.a;
                apxu apxu = a.h;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
        zcq.d = true;
        zcq.b.b(zcq.a(zcq.a(zcq.f), zcq.d));
        zcq.b.b(zcq.c);
    }
}
