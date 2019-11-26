package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kcm */
final class kcm implements OnClickListener {
    private final /* synthetic */ kcn a;

    kcm(kcn kcn) {
        this.a = kcn;
    }

    public final void onClick(View view) {
        kcn kcn = this.a;
        apxu apxu = kcn.b;
        if (apxu != null) {
            kcn.a.a(apxu, null);
        }
    }
}
