package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: vbd */
final class vbd implements OnClickListener {
    private final /* synthetic */ aphg a;
    private final /* synthetic */ vba b;

    vbd(vba vba, aphg aphg) {
        this.b = vba;
        this.a = aphg;
    }

    public final void onClick(View view) {
        vbh vbh = this.b.b;
        if (vbh != null) {
            apxu apxu = this.a.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            vbh.a(apxu);
        }
    }
}
