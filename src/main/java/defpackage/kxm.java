package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kxm */
final /* synthetic */ class kxm implements OnClickListener {
    private final kxn a;
    private final awnt b;

    kxm(kxn kxn, awnt awnt) {
        this.a = kxn;
        this.b = awnt;
    }

    public final void onClick(View view) {
        kxn kxn = this.a;
        awnt awnt = this.b;
        aaas aaas = kxn.b;
        apxu apxu = awnt.f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
