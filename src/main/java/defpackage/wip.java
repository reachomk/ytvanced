package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wip */
final /* synthetic */ class wip implements OnClickListener {
    private final wih a;
    private final aphg b;
    private final acvx c;
    private final Map d;

    wip(wih wih, aphg aphg, acvx acvx, Map map) {
        this.a = wih;
        this.b = aphg;
        this.c = acvx;
        this.d = map;
    }

    public final void onClick(View view) {
        wih wih = this.a;
        aphg aphg = this.b;
        acvx acvx = this.c;
        Map map = this.d;
        int i = aphg.a;
        if ((i & 4096) != 0) {
            if ((i & 262144) != 0) {
                acvx.a(3, new acvs(aphg.r), null);
            }
            aaas aaas = wih.d;
            apxu apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, map);
        }
    }
}
