package defpackage;

import java.util.ArrayList;

/* renamed from: nyd */
final /* synthetic */ class nyd implements nyb {
    private final nye a;

    nyd(nye nye) {
        this.a = nye;
    }

    public final void a(nxw nxw) {
        nye nye = this.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(nxw);
        for (nxw nxw2 : nye.b) {
            if (nxw2.d() == nxw) {
                arrayList.add(nxw2);
                nxw2.c();
            }
        }
        nye.b.removeAll(arrayList);
        nye.b.size();
    }
}
