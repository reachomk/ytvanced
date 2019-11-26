package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iwl */
final class iwl implements OnClickListener {
    private final /* synthetic */ apxu a;
    private final /* synthetic */ iwg b;

    iwl(iwg iwg, apxu apxu) {
        this.b = iwg;
        this.a = apxu;
    }

    public final void onClick(View view) {
        this.b.a.a(this.a, null);
    }
}
