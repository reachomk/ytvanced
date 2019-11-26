package defpackage;

import java.util.ArrayList;

/* renamed from: yos */
final /* synthetic */ class yos implements yiq {
    private final yon a;

    yos(yon yon) {
        this.a = yon;
    }

    public final void a(amul amul) {
        yon yon = this.a;
        ArrayList arrayList = new ArrayList();
        amxn amxn = (amxn) amul.listIterator();
        while (amxn.hasNext()) {
            arrayList.add(((ykv) amxn.next()).getAvatar());
        }
        yon.g.a(arrayList, xwe.a(yon.e_, yxo.a(yon.k.a(yon.i)), 0));
        yon.g.a(yon.j);
    }
}
