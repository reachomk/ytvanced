package defpackage;

import java.util.HashSet;

/* renamed from: vfu */
final /* synthetic */ class vfu implements bcvk {
    private final vfv a;

    vfu(vfv vfv) {
        this.a = vfv;
    }

    public final void a(Object obj) {
        vfv vfv = this.a;
        if (((ahkq) obj).b.R() == 0) {
            HashSet<vml> hashSet = new HashSet();
            hashSet.addAll(vfv.b.values());
            for (vml vml : hashSet) {
                ((vlx) vfv.a.get()).a((vsa) vml.a);
            }
        }
    }
}
