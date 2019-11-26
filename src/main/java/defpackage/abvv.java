package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abvv */
final /* synthetic */ class abvv implements OnClickListener {
    private final abvm a;
    private final aphg b;

    abvv(abvm abvm, aphg aphg) {
        this.a = abvm;
        this.b = aphg;
    }

    public final void onClick(View view) {
        abvm abvm = this.a;
        aphg aphg = this.b;
        if ((aphg.a & 4096) != 0) {
            abrl abrl = abvm.i;
            apxu apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            abrl.a(apxu);
        }
        if ((aphg.a & 2048) != 0) {
            abrl abrl2 = abvm.i;
            apxu apxu2 = aphg.l;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            abrl2.a(apxu2);
        }
    }
}
