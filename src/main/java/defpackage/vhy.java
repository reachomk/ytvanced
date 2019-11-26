package defpackage;

import java.util.Iterator;

/* renamed from: vhy */
final /* synthetic */ class vhy implements vij {
    private final vhu a;
    private final vso b;

    vhy(vhu vhu, vso vso) {
        this.a = vhu;
        this.b = vso;
    }

    public final void a(boolean z) {
        vhu vhu = this.a;
        vso vso = this.b;
        if (z) {
            vhu.a.a(vhu.f, vhu.g, vhu.h, vso);
            vih vih = new vih(vhu, (vsk) vso);
            Iterator it = vhu.b.iterator();
            while (it.hasNext()) {
                vdo vdo = (vdo) it.next();
                if (vdo.a(vih)) {
                    vhu.a(vdo);
                    return;
                }
            }
            vih.a(vra.VIDEO_ERROR);
            return;
        }
        vhu.f();
    }
}
