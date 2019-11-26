package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: aduj */
final class aduj extends adul {
    private final /* synthetic */ wxg a;
    private final /* synthetic */ adui b;

    aduj(adui adui, wxg wxg, wxg wxg2) {
        this.b = adui;
        this.a = wxg2;
        super(wxg);
    }

    public final /* synthetic */ void a(Object obj, Object obj2) {
        List<adio> list = (List) obj2;
        if (list.isEmpty()) {
            this.a.a(null, Collections.emptyList());
            return;
        }
        int min;
        ArrayList arrayList = new ArrayList();
        for (adio adio : list) {
            if (!this.b.g.containsKey(adio.br_())) {
                arrayList.add(adio.br_());
            }
        }
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 6;
            min = Math.min(arrayList.size(), i2);
            adui adui = this.b;
            adui.g.putAll(adui.d.a(arrayList.subList(i, min)));
            i = i2;
        }
        arrayList = new ArrayList();
        for (adio adio2 : list) {
            adim adim = (adim) this.b.g.get(adio2.br_());
            if (adim != null) {
                adin g = adio2.g();
                g.a = adim;
                arrayList.add(g.b());
            }
        }
        Set a = this.b.b.a(arrayList);
        Object arrayList2 = new ArrayList();
        min = arrayList.size();
        for (int i3 = 0; i3 < min; i3++) {
            adio adio3 = (adio) arrayList.get(i3);
            if (a.contains(adio3)) {
                arrayList2.add(adio3);
            }
        }
        adqe c = ((adqf) this.b.c.get()).c();
        if (!(c == null || c.b() || !(c.h() instanceof adio) || arrayList2.contains(c.h()))) {
            arrayList2.add((adio) c.h());
        }
        this.a.a(null, arrayList2);
    }
}
