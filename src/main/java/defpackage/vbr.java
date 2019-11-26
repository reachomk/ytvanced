package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: vbr */
final class vbr implements OnClickListener {
    private final /* synthetic */ vbp a;

    vbr(vbp vbp) {
        this.a = vbp;
    }

    public final void onClick(View view) {
        vbt vbt = this.a.ad;
        if (vbt != null) {
            vbt.a();
        }
    }
}
