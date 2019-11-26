package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wte */
final class wte implements OnClickListener {
    private final /* synthetic */ wtf a;

    wte(wtf wtf) {
        this.a = wtf;
    }

    public final void onClick(View view) {
        wtf wtf = this.a;
        aynd aynd = wtf.a;
        if (aynd != null && (aynd.a & 4) != 0) {
            aphj aphj = aynd.e;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            wtf.a(aphg);
        }
    }
}
