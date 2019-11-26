package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ycf */
final /* synthetic */ class ycf implements OnClickListener {
    private final ycd a;

    ycf(ycd ycd) {
        this.a = ycd;
    }

    public final void onClick(View view) {
        ycd ycd = this.a;
        xzj xzj = (xzj) ycd.ae;
        aphg a = xzj.a((akak) xzj.d);
        if (a != null) {
            if ((a.a & 262144) != 0) {
                xzj.a.a(3, new acvs(a.r), null);
            }
            if ((a.a & 8192) != 0) {
                aaas aaas = xzj.b;
                apxu apxu = a.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
        ycd.dismiss();
    }
}
