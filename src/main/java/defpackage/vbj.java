package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: vbj */
final /* synthetic */ class vbj implements OnClickListener {
    private final vbg a;

    vbj(vbg vbg) {
        this.a = vbg;
    }

    public final void onClick(View view) {
        vbg vbg = this.a;
        vbm vbm = vbg.ae;
        if (vbm != null) {
            vbm.a();
        }
        vbg.W();
    }
}
