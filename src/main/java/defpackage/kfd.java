package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kfd */
final class kfd implements OnClickListener {
    private final /* synthetic */ auwd a;
    private final /* synthetic */ kfa b;

    kfd(kfa kfa, auwd auwd) {
        this.b = kfa;
        this.a = auwd;
    }

    public final void onClick(View view) {
        aaas aaas = this.b.a;
        apxu apxu = this.a.i;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, acwi.a(this.a));
    }
}
