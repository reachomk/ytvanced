package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: aimc */
final class aimc implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ ailz b;

    aimc(ailz ailz, aaas aaas) {
        this.b = ailz;
        this.a = aaas;
    }

    public final void onClick(View view) {
        apxu apxu = this.b.a;
        if (apxu != null) {
            this.a.a(apxu, null);
        }
    }
}
