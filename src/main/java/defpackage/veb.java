package defpackage;

import java.util.HashSet;

/* renamed from: veb */
final /* synthetic */ class veb implements bcvk {
    private final vdy a;

    veb(vdy vdy) {
        this.a = vdy;
    }

    public final void a(Object obj) {
        vdy vdy = this.a;
        if (((ahkq) obj).b.R() == 0) {
            HashSet<vml> hashSet = new HashSet();
            hashSet.addAll(vdy.b.values());
            for (vml vml : hashSet) {
                ((vlx) vdy.a.get()).a((vrt) vml.a);
            }
        }
    }
}
