package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: uxi */
final class uxi implements OnClickListener {
    private final /* synthetic */ uyb a;
    private final /* synthetic */ uxh b;

    uxi(uxh uxh, uyb uyb) {
        this.b = uxh;
        this.a = uyb;
    }

    public final void onClick(View view) {
        aanu aanu = this.b.a;
        if (aanu != null) {
            this.a.a(aanu);
        }
    }
}
