package defpackage;

import java.util.List;

/* renamed from: vjd */
final /* synthetic */ class vjd implements Runnable {
    private final viz a;
    private final aakj b;
    private final String c;

    vjd(viz viz, aakj aakj, String str) {
        this.a = viz;
        this.b = aakj;
        this.c = str;
    }

    public final void run() {
        viz viz = this.a;
        aakj aakj = this.b;
        String str = this.c;
        List b = ((vfk) viz.f.get()).b(aakj);
        vsd vsd = null;
        if (!b.isEmpty() && ((vsd) b.get(0)).e() == vsm.PRE_ROLL) {
            vsd = (vsd) b.get(0);
        }
        if (vsd != null) {
            b = b.subList(1, b.size());
        }
        viz.a(str, aakj, b);
    }
}
