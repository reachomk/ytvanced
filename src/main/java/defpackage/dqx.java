package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dqx */
final /* synthetic */ class dqx implements OnClickListener {
    private final dqu a;
    private final aaas b;

    dqx(dqu dqu, aaas aaas) {
        this.a = dqu;
        this.b = aaas;
    }

    public final void onClick(View view) {
        dqu dqu = this.a;
        aaas aaas = this.b;
        apxu apxu = dqu.e;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
    }
}
