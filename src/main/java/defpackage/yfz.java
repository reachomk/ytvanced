package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: yfz */
final class yfz implements OnLongClickListener {
    private final /* synthetic */ yga a;

    yfz(yga yga) {
        this.a = yga;
    }

    public final boolean onLongClick(View view) {
        aqoz aqoz = this.a.b;
        if (aqoz != null) {
            auvr auvr = aqoz.n;
            if (auvr == null) {
                auvr = auvr.c;
            }
            if ((auvr.a & 1) != 0) {
                yga yga = this.a;
                auvr auvr2 = yga.b.n;
                if (auvr2 == null) {
                    auvr2 = auvr.c;
                }
                auvn auvn = auvr2.b;
                if (auvn == null) {
                    auvn = auvn.l;
                }
                yga.a.a(auvn, yga.b);
                return true;
            }
        }
        return false;
    }
}
