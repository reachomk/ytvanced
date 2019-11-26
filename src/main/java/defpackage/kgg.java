package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kgg */
final class kgg implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ kgh b;

    kgg(kgh kgh, aaas aaas) {
        this.b = kgh;
        this.a = aaas;
    }

    public final void onClick(View view) {
        apxu apxu = this.b.a;
        if (apxu != null) {
            this.a.a(apxu, null);
        }
    }
}
