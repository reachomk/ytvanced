package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: epm */
final /* synthetic */ class epm implements OnClickListener {
    private final epn a;

    epm(epn epn) {
        this.a = epn;
    }

    public final void onClick(View view) {
        epn epn = this.a;
        Object obj = epn.c;
        if (obj != null) {
            aokt aokt = (aokt) obj;
            if ((aokt.a & 4) != 0) {
                epk epk = epn.d;
                if (epk != null) {
                    Object obj2 = aokt.d;
                    if (obj2 == null) {
                        obj2 = apxu.d;
                    }
                    epk.a(obj, amul.a(obj2));
                }
            }
        }
    }
}
