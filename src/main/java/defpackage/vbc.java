package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: vbc */
final class vbc implements OnClickListener {
    private final /* synthetic */ vba a;

    vbc(vba vba) {
        this.a = vba;
    }

    public final void onClick(View view) {
        vbh vbh = this.a.b;
        if (vbh != null) {
            vbh.a();
        }
    }
}
