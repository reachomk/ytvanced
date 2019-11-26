package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hvo */
final /* synthetic */ class hvo implements OnClickListener {
    private final hvj a;
    private final aphg b;

    hvo(hvj hvj, aphg aphg) {
        this.a = hvj;
        this.b = aphg;
    }

    public final void onClick(View view) {
        hvj hvj = this.a;
        aphg aphg = this.b;
        if ((aphg.a & 262144) != 0) {
            hvj.e.a(3, new acvs(aphg.r), null);
        }
        aaas aaas = hvj.f;
        apxu apxu = aphg.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
