package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: yop */
final /* synthetic */ class yop implements xsd {
    private final yon a;

    yop(yon yon) {
        this.a = yon;
    }

    public final void a(Object obj) {
        yon yon = this.a;
        aadz aadz = (aadz) obj;
        yon.k = (ylf) aadz.c();
        ymh ymh = (ymh) aadz.e().a("technodrome_metadata", ymh.d.getParserForType());
        ylf ylf = yon.k;
        if (ylf != null && ylf.b()) {
            Collection linkedHashSet;
            amul heartedContactEntityKeys = yon.k.getHeartedContactEntityKeys();
            if (!(ymh == null || (ymh.a & 1) == 0)) {
                int a = ymj.a(ymh.b);
                if (a != 0 && a == 2) {
                    linkedHashSet = new LinkedHashSet(heartedContactEntityKeys);
                    linkedHashSet.add(yon.i);
                    heartedContactEntityKeys = amul.a(linkedHashSet);
                } else {
                    int a2 = ymj.a(ymh.b);
                    if (a2 != 0 && a2 == 3) {
                        linkedHashSet = new LinkedHashSet(heartedContactEntityKeys);
                        linkedHashSet.remove(yon.i);
                        heartedContactEntityKeys = amul.a(linkedHashSet);
                    }
                }
            }
            linkedHashSet = amul.a((amul) heartedContactEntityKeys.subList(0, Math.min(heartedContactEntityKeys.size(), yon.f)));
            yon.j = heartedContactEntityKeys.size() - linkedHashSet.size();
            if (linkedHashSet.isEmpty()) {
                yon.g.a(amul.g(), xwe.a(yon.e_, yxo.a(yon.k.a(yon.i)), 0));
                yon.g.a(yon.j);
                return;
            }
            yon.h.a(amul.a(linkedHashSet), new yos(yon), yon.c);
        }
    }
}
