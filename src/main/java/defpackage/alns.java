package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alns */
final class alns implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ alnt b;

    alns(alnt alnt, aaas aaas) {
        this.b = alnt;
        this.a = aaas;
    }

    public final void onClick(View view) {
        apxu apxu = this.b.a;
        if (apxu != null) {
            this.a.a(apxu, null);
        }
        apxu = this.b.b;
        if (apxu != null) {
            this.a.a(apxu, null);
        }
    }
}
