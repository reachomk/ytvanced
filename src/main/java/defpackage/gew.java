package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: gew */
final /* synthetic */ class gew implements OnClickListener {
    private final geu a;
    private final aphg b;
    private final Map c;

    gew(geu geu, aphg aphg, Map map) {
        this.a = geu;
        this.b = aphg;
        this.c = map;
    }

    public final void onClick(View view) {
        geu geu = this.a;
        aphg aphg = this.b;
        Map map = this.c;
        view.setEnabled(false);
        aaas aaas = geu.c;
        apxu apxu = aphg.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, map);
        view.postDelayed(new gez(view), 1000);
    }
}
