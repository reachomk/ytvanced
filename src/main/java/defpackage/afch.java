package defpackage;

import java.util.List;

/* renamed from: afch */
final /* synthetic */ class afch implements noz {
    private final afbo a;
    private final aahr[] b;

    afch(afbo afbo, aahr[] aahrArr) {
        this.a = afbo;
        this.b = aahrArr;
    }

    public final void a(npf npf, npc npc) {
        aahr[] aahrArr = this.b;
        List list = npf.a(0).b;
        for (int i = 0; i < list.size(); i++) {
            npe npe = (npe) list.get(i);
            if (npe.a == 1) {
                for (int a : afbo.a(aahrArr, npe)) {
                    npc.a(npf, i, a);
                }
            }
        }
    }
}
