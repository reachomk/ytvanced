package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: szs */
final /* synthetic */ class szs implements bbnp {
    private final szp a;

    szs(szp szp) {
        this.a = szp;
    }

    public final void a() {
        szp szp = this.a;
        int i = szp.a;
        amuw amuw = szp.g;
        szt szt = null;
        if (!(amuw == null || amuw.isEmpty())) {
            szt = szt.b().a(szp.g).a();
        }
        List a = szp.b.a(szv.a(1), szt);
        if (a.size() != 0) {
            int a2 = szp.f.a(i, ((szu) a.get(0)).a());
            szp.a(i, szp.c.a(szv.a(2), szt), a2);
            szp.a(i, szp.d.a(szv.a(3), szt), a2);
            if (!szp.e.isEmpty()) {
                amuw a3 = amuw.a(szp.e);
                ArrayList arrayList = new ArrayList(a3.size());
                amxo amxo = (amxo) a3.iterator();
                while (amxo.hasNext()) {
                    arrayList.add(szr.g().a(szv.a(4)).c(Long.valueOf(((Long) amxo.next()).longValue())));
                }
                szp.a(i, arrayList, a2);
            }
        }
    }
}
