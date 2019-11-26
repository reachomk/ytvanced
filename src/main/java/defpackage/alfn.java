package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: alfn */
final /* synthetic */ class alfn implements OnClickListener {
    private final alfk a;
    private final artr b;

    alfn(alfk alfk, artr artr) {
        this.a = alfk;
        this.b = artr;
    }

    public final void onClick(View view) {
        Map a;
        alfk alfk = this.a;
        Object obj = this.b;
        if ((obj.a & 16) != 0) {
            a = acwi.a(obj);
            aaas aaas = alfk.b;
            apxu apxu = obj.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, a);
        }
        if ((obj.a & 32) != 0) {
            a = acwi.a(obj, false);
            aaas aaas2 = alfk.b;
            apxu apxu2 = obj.g;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            aaas2.a(apxu2, a);
        }
    }
}
