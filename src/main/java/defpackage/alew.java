package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alew */
final class alew implements OnClickListener {
    private final /* synthetic */ aphg a;
    private final /* synthetic */ alex b;

    alew(alex alex, aphg aphg) {
        this.b = alex;
        this.a = aphg;
    }

    public final void onClick(View view) {
        aphg aphg = this.a;
        if (aphg != null) {
            aaas aaas;
            apxu apxu;
            if ((aphg.a & 4096) != 0) {
                aaas = this.b.b;
                apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
            aphg = this.a;
            if ((aphg.a & 2048) != 0) {
                aaas = this.b.b;
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
        alex alex = this.b;
        alex.g = true;
        albo albo = alex.e;
        if (albo != null) {
            albo.e();
        }
    }
}
