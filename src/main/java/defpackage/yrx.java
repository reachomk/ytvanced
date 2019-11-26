package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: yrx */
final /* synthetic */ class yrx implements Runnable {
    private final yrv a;
    private final ahc b;
    private final Map c;

    yrx(yrv yrv, ahc ahc, Map map) {
        this.a = yrv;
        this.b = ahc;
        this.c = map;
    }

    public final void run() {
        yrv yrv = this.a;
        ahc ahc = this.b;
        Map map = this.c;
        if (yrv.e) {
            yrv.c.clear();
            yrv.c.addAll(yrv.g);
            ahc.a(yrv.b);
            yrv.d.a();
            map.clear();
            for (int i = 0; i < yrv.c.size(); i++) {
                map.put(((yki) yrv.c.get(i)).a, Integer.valueOf(i));
            }
            yrv.f = false;
            List list = yrv.h;
            if (list != null) {
                yrv.h = null;
                yrv.a(list, map);
            }
        }
    }
}
