package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kbt */
final /* synthetic */ class kbt implements OnClickListener {
    private final kbq a;

    kbt(kbq kbq) {
        this.a = kbq;
    }

    public final void onClick(View view) {
        kbq kbq = this.a;
        kbs kbs = kbq.c;
        if (kbs != null) {
            kbs.W();
            return;
        }
        asnl asnl = kbq.b;
        if (asnl != null) {
            kbq.a.d(new aaxc(asnl));
        }
    }
}
