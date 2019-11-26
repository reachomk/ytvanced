package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wnf */
final /* synthetic */ class wnf implements OnClickListener {
    private final wne a;
    private final aphg b;
    private final akor c;

    wnf(wne wne, aphg aphg, akor akor) {
        this.a = wne;
        this.b = aphg;
        this.c = akor;
    }

    public final void onClick(View view) {
        aaas aaas;
        apxu apxu;
        wne wne = this.a;
        Object obj = this.b;
        akor akor = this.c;
        wne.a = false;
        wne.c.a();
        Map a = acwi.a(obj);
        a.putAll(akor.b());
        if ((obj.a & 4096) != 0) {
            aaas = wne.b;
            apxu = obj.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, a);
        }
        if ((obj.a & 2048) != 0) {
            aaas = wne.b;
            apxu = obj.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, a);
        }
        if ((obj.a & 8192) != 0) {
            aaas aaas2 = wne.b;
            apxu apxu2 = obj.n;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            aaas2.a(apxu2, a);
        }
    }
}
