package defpackage;

import java.util.Map;

/* renamed from: yba */
final /* synthetic */ class yba implements bqj {
    private final yax a;
    private final algc b;
    private final Map c;

    yba(yax yax, algc algc, Map map) {
        this.a = yax;
        this.b = algc;
        this.c = map;
    }

    public final void a(Object obj) {
        yax yax = this.a;
        algc algc = this.b;
        Map map = this.c;
        aseo aseo = (aseo) obj;
        boolean a = algc != null ? algc.a(aseo) : false;
        amxo amxo = (amxo) yax.d.iterator();
        while (amxo.hasNext()) {
            ((algc) amxo.next()).a(aseo);
        }
        if (!(aseo.d.size() == 0 || a)) {
            yax.b.a(aseo.d, (Object) map);
        }
        if (aseo.e.size() != 0) {
            yax.b.a(aseo.e, map);
        }
        alia.a(map, yax.c).b(new acvs(aseo.g));
        if ((aseo.a & 2) != 0) {
            aaas a2 = alia.a(map, yax.b);
            apxu apxu = aseo.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            a2.a(apxu, map);
        }
    }
}
