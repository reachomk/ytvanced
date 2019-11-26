package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iwm */
final class iwm implements OnClickListener {
    private final /* synthetic */ apxu a;
    private final /* synthetic */ iwg b;

    iwm(iwg iwg, apxu apxu) {
        this.b = iwg;
        this.a = apxu;
    }

    public final void onClick(View view) {
        apxu apxu = this.a;
        if (apxu != null) {
            this.b.a.a(apxu, null);
        }
    }
}
