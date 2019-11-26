package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hdz */
final class hdz implements OnClickListener {
    private final /* synthetic */ hea a;

    public final void onClick(View view) {
        int ordinal = this.a.i.a.ordinal();
        if (ordinal == 1) {
            this.a.j.d();
        } else if (ordinal == 2) {
            this.a.j.aJ_();
        } else if (ordinal == 5) {
            if (this.a.k.a() == 4) {
                adqe c = this.a.l.c();
                if (c != null) {
                    c.w();
                }
                return;
            }
            this.a.j.j();
        }
    }

    /* synthetic */ hdz(hea hea) {
        this.a = hea;
    }
}
