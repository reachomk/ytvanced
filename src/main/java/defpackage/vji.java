package defpackage;

import java.util.List;

/* renamed from: vji */
final class vji implements Runnable {
    public final /* synthetic */ viz a;
    private final /* synthetic */ vka b;
    private final /* synthetic */ String c;
    private final /* synthetic */ xvk d;
    private final /* synthetic */ boolean e;

    vji(viz viz, vka vka, String str, xvk xvk, boolean z) {
        this.a = viz;
        this.b = vka;
        this.c = str;
        this.d = xvk;
        this.e = z;
    }

    public final void run() {
        List a;
        this.a.b.h(this.b.a);
        viz viz = this.a;
        String str = this.c;
        vsd vsd = (vsd) this.b.c();
        vka vka = this.b;
        aakj aakj = vka.f;
        xvk xvk = this.d;
        vjl vjl = new vjl(this, vka, this.c, this.e);
        if (vsd != null) {
            a = ((vfk) viz.f.get()).a(vsd, aakj, str, xvk);
        } else {
            a = amul.g();
        }
        vji vji = vjl.a;
        vka vka2 = vjl.b;
        String str2 = vjl.c;
        boolean z = vjl.d;
        vji.a.a(vka2.a, str2, a, vka2);
        if (!a.isEmpty() && z) {
            ((vgz) vji.a.h.get()).a(vka2.c(), ((vse) a.get(0)).a);
            if (!wcf.c(vji.a.g)) {
                vji.a.b.a(vka2);
            }
            vji.a.b.b(vka2.a, new vjk(vji, str2, vka2));
        }
    }
}
