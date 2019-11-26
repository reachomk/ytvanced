package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: uxn */
final class uxn implements OnClickListener {
    private final /* synthetic */ uxy a;
    private final /* synthetic */ uxk b;

    uxn(uxk uxk, uxy uxy) {
        this.b = uxk;
        this.a = uxy;
    }

    public final void onClick(View view) {
        aanv aanv = this.b.b;
        if (aanv != null) {
            this.a.a(aanv);
        }
    }
}
