package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: algi */
final /* synthetic */ class algi implements OnClickListener {
    private final algg a;

    algi(algg algg) {
        this.a = algg;
    }

    public final void onClick(View view) {
        for (almv b : this.a.f.b) {
            b.b();
        }
    }
}
