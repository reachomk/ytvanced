package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: vaf */
final /* synthetic */ class vaf implements OnClickListener {
    private final vac a;

    vaf(vac vac) {
        this.a = vac;
    }

    public final void onClick(View view) {
        vac vac = this.a;
        if (vac.b != null) {
            vac.a.c();
            vac.b.a();
        }
    }
}
