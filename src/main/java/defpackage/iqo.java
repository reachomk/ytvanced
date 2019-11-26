package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iqo */
final /* synthetic */ class iqo implements OnClickListener {
    private final iqp a;

    iqo(iqp iqp) {
        this.a = iqp;
    }

    public final void onClick(View view) {
        iqp iqp = this.a;
        nf U_ = iqp.U_();
        if (U_ instanceof irr) {
            irr irr = (irr) U_;
            irr.at.a(irr.as, iqp.W());
            irr.f();
            if (foh.A(irr.am)) {
                irr.ak();
            }
        }
        iqp.dismiss();
    }
}
