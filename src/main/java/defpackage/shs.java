package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: shs */
final class shs implements OnClickListener {
    private final /* synthetic */ shn a;

    shs(shn shn) {
        this.a = shn;
    }

    public final void onClick(View view) {
        if (!this.a.i.c()) {
            this.a.h.a(view, shn.g, aodi.EVENT_ACCOUNT_SELECTION_SELECT_ACCOUNT);
            this.a.i.d();
        }
    }
}
