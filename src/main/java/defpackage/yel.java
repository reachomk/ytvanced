package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: yel */
final /* synthetic */ class yel implements OnClickListener {
    private final yem a;

    yel(yem yem) {
        this.a = yem;
    }

    public final void onClick(View view) {
        yem yem = this.a;
        yem.a.a(yem.d, yem.e, yem.f, yem);
        acvx acvx = yem.c;
        if (acvx != null) {
            aqnf aqnf = yem.f;
            if (aqnf != null && (aqnf.a & 256) != 0) {
                acvx.a(3, new acvs(aqnf.i.d()), null);
            }
        }
    }
}
