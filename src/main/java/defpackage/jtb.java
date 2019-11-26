package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jtb */
final /* synthetic */ class jtb implements OnClickListener {
    private final jsy a;
    private final aqgn b;

    jtb(jsy jsy, aqgn aqgn) {
        this.a = jsy;
        this.b = aqgn;
    }

    public final void onClick(View view) {
        jsy jsy = this.a;
        aqgn aqgn = this.b;
        aaas aaas = jsy.a;
        apxu apxu = aqgn.h;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
