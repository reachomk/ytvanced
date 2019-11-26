package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fdj */
final /* synthetic */ class fdj implements OnClickListener {
    private final fbv a;
    private final fde b;

    fdj(fbv fbv, fde fde) {
        this.a = fbv;
        this.b = fde;
    }

    public final void onClick(View view) {
        fbv fbv = this.a;
        fde fde = this.b;
        fbv.a(1);
        OnClickListener g = fde.g();
        if (g != null) {
            g.onClick(view);
        }
    }
}
