package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: lfe */
final /* synthetic */ class lfe implements OnClickListener {
    private final lff a;

    lfe(lff lff) {
        this.a = lff;
    }

    public final void onClick(View view) {
        apxu apxu;
        lff lff = this.a;
        aphg aphg = lff.d;
        if ((aphg.a & 4096) != 0) {
            apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        if (apxu == null) {
            aphg = lff.d;
            if ((aphg.a & 2048) != 0) {
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = null;
            }
        }
        if (apxu == null) {
            aphg = lff.d;
            if ((aphg.a & 8192) != 0) {
                apxu = aphg.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = null;
            }
        }
        lff.a.a(apxu, null);
    }
}
