package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wcy */
final /* synthetic */ class wcy implements OnClickListener {
    private final wcv a;
    private final aphg b;
    private final Map c;

    wcy(wcv wcv, aphg aphg, Map map) {
        this.a = wcv;
        this.b = aphg;
        this.c = map;
    }

    public final void onClick(View view) {
        apxu apxu;
        wcv wcv = this.a;
        aphg aphg = this.b;
        Map map = this.c;
        int i = aphg.a;
        if ((i & 2048) != 0) {
            apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else if ((i & 4096) == 0) {
            apxu = null;
        } else {
            apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        wcv.a.a(apxu, map);
    }
}
