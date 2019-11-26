package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: drj */
final class drj implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ drg b;

    drj(drg drg, aaas aaas) {
        this.b = drg;
        this.a = aaas;
    }

    public final void onClick(View view) {
        apxu apxu = this.b.a;
        if (apxu != null) {
            this.a.a(apxu, null);
        }
    }
}
