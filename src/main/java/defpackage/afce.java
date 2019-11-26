package defpackage;

import java.util.List;

/* renamed from: afce */
final /* synthetic */ class afce implements noz {
    private final afbo a;
    private final aahr[] b;

    afce(afbo afbo, aahr[] aahrArr) {
        this.a = afbo;
        this.b = aahrArr;
    }

    public final void a(npf npf, npc npc) {
        aahr[] aahrArr = this.b;
        int i = 0;
        List list = npf.a(0).b;
        while (i < list.size()) {
            npe npe = (npe) list.get(i);
            if (npe.a == 0) {
                int[] a = afbo.a(aahrArr, npe);
                if (a.length > 0) {
                    npc.a(npf, i, a);
                }
            }
            i++;
        }
    }
}
