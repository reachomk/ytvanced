package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jxl */
final class jxl implements OnClickListener {
    private final /* synthetic */ apxu a;
    private final /* synthetic */ jxe b;

    jxl(jxe jxe, apxu apxu) {
        this.b = jxe;
        this.a = apxu;
    }

    public final void onClick(View view) {
        apxu apxu = this.a;
        if (apxu != null) {
            this.b.a.a(apxu, null);
        }
    }
}
