package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dqq */
final class dqq implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ dqr b;

    dqq(dqr dqr, aaas aaas) {
        this.b = dqr;
        this.a = aaas;
    }

    public final void onClick(View view) {
        aaas aaas = this.a;
        if (aaas != null) {
            aaas.a(this.b.b, null);
            this.b.a.g();
        }
    }
}
