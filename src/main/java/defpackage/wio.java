package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wio */
final /* synthetic */ class wio implements OnClickListener {
    private final wih a;
    private final aphg b;
    private final Map c;

    wio(wih wih, aphg aphg, Map map) {
        this.a = wih;
        this.b = aphg;
        this.c = map;
    }

    public final void onClick(View view) {
        wih wih = this.a;
        aphg aphg = this.b;
        Map map = this.c;
        if ((aphg.a & 4096) != 0) {
            aaas aaas = wih.d;
            apxu apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, map);
        }
    }
}
