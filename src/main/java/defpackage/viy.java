package defpackage;

import java.util.List;

/* renamed from: viy */
final /* synthetic */ class viy implements Runnable {
    private final viz a;
    private final aakj b;
    private final String c;
    private final vka d;
    private final String e;

    viy(viz viz, aakj aakj, String str, vka vka, String str2) {
        this.a = viz;
        this.b = aakj;
        this.c = str;
        this.d = vka;
        this.e = str2;
    }

    public final void run() {
        viz viz = this.a;
        aakj aakj = this.b;
        String str = this.c;
        vka vka = this.d;
        String str2 = this.e;
        List b = ((vfk) viz.f.get()).b(aakj);
        vsd vsd = (b.isEmpty() || ((vsd) b.get(0)).e() != vsm.PRE_ROLL) ? null : (vsd) b.get(0);
        if (vsd != null) {
            viz.a(str, vka, vsd, aakj, str2);
        } else {
            viz.a(str2, aakj, str, vka, null, vsm.PRE_ROLL, amul.g());
        }
        if (vsd != null) {
            b = b.subList(1, b.size());
        }
        viz.a(str2, aakj, b);
    }
}
