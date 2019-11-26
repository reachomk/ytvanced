package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ailx */
final class ailx implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ aily b;

    ailx(aily aily, aaas aaas) {
        this.b = aily;
        this.a = aaas;
    }

    public final void onClick(View view) {
        apxu apxu = this.b.a;
        if (apxu != null) {
            this.a.a(apxu, null);
        }
    }
}
