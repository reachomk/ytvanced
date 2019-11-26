package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wjm */
final /* synthetic */ class wjm implements OnClickListener {
    private final wjn a;

    wjm(wjn wjn) {
        this.a = wjn;
    }

    public final void onClick(View view) {
        wjn wjn = this.a;
        axql axql = wjn.b;
        if (axql != null) {
            apxu apxu;
            if (((axql.b == 3 ? (axqp) axql.c : axqp.c).a & 1) != 0) {
                wfb wfb = wjn.d;
                if (wfb != null) {
                    axqp axqp;
                    axql axql2 = wjn.b;
                    if (axql2.b == 3) {
                        axqp = (axqp) axql2.c;
                    } else {
                        axqp = axqp.c;
                    }
                    Object obj = axqp.b;
                    if (obj == null) {
                        obj = awzv.d;
                    }
                    wfb.a(ajtj.a(obj));
                }
            }
            axql = wjn.b;
            int i = axql.b;
            if (i == 5) {
                apxu = (apxu) axql.c;
            } else if (i != 6) {
                apxu = apxu.d;
            } else {
                apxu = (apxu) axql.c;
            }
            i = wjn.b.b;
            if (i == 5 || i == 6) {
                wjn.a.a(apxu, wjn.e);
            }
        }
        aoa aoa = wjn.c;
        if (aoa != null) {
            aoa.d();
        }
    }
}
