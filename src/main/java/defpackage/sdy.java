package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sdy */
public final /* synthetic */ class sdy implements sja {
    private final sdv a;
    private final anko b;

    public sdy(sdv sdv, anko anko) {
        this.a = sdv;
        this.b = anko;
    }

    public final void a(List list) {
        sdv sdv = this.a;
        anko anko = this.b;
        sdv.d.b();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sjm sjm = (sjm) list.get(i);
            sgd sgd = new sgd(sjm.a);
            sgd.b = sjm.b;
            sgd.c = sjm.c;
            sgd.d = sjm.d;
            arrayList.add(new sge(sgd.a, sgd.b, sgd.c, sgd.d));
        }
        anko.a_(arrayList);
    }
}
