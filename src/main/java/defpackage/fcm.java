package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fcm */
final /* synthetic */ class fcm implements OnClickListener {
    private final fcj a;
    private final auuc b;
    private final Map c;
    private final aphg d;

    fcm(fcj fcj, auuc auuc, Map map, aphg aphg) {
        this.a = fcj;
        this.b = auuc;
        this.c = map;
        this.d = aphg;
    }

    public final void onClick(View view) {
        fcj fcj = this.a;
        Object obj = this.b;
        Map map = this.c;
        aphg aphg = this.d;
        Map a = acwi.a(obj);
        if (map != null) {
            HashMap hashMap = new HashMap(a);
            hashMap.putAll(map);
            a = hashMap;
        }
        if ((aphg.a & 2048) != 0) {
            aaas aaas = fcj.a;
            apxu apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, a);
        }
        if ((aphg.a & 4096) != 0) {
            aaas aaas2 = fcj.a;
            apxu apxu2 = aphg.m;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            aaas2.a(apxu2, a);
        }
    }
}
