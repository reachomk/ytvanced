package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kdn */
final class kdn implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ kdk b;

    kdn(kdk kdk, aaas aaas) {
        this.b = kdk;
        this.a = aaas;
    }

    public final void onClick(View view) {
        apxu apxu = this.b.a;
        if (apxu != null) {
            this.a.a(apxu, null);
        }
    }
}
