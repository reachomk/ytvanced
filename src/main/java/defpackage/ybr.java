package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ybr */
public final class ybr implements OnClickListener {
    private final /* synthetic */ ybo a;

    public ybr(ybo ybo) {
        this.a = ybo;
    }

    public final void onClick(View view) {
        this.a.av.a();
        xzs xzs = this.a.aw;
        azbj azbj = xzs.b;
        if (!(azbj == null || (azbj.a & 1) == 0)) {
            aaas aaas = xzs.a;
            apxu apxu = azbj.b;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
        this.a.aa();
    }
}
