package defpackage;

import java.util.List;

/* renamed from: vja */
final /* synthetic */ class vja implements Runnable {
    private final viz a;
    private final vsd b;
    private final aogi c;
    private final vka d;
    private final String e;
    private final aakj f;
    private final String g;
    private final List h;

    vja(viz viz, vsd vsd, aogi aogi, vka vka, String str, aakj aakj, String str2, List list) {
        this.a = viz;
        this.b = vsd;
        this.c = aogi;
        this.d = vka;
        this.e = str;
        this.f = aakj;
        this.g = str2;
        this.h = list;
    }

    public final void run() {
        viz viz = this.a;
        vsd vsd = this.b;
        aogi aogi = this.c;
        vka vka = this.d;
        String str = this.e;
        aakj aakj = this.f;
        String str2 = this.g;
        List list = this.h;
        if (vsd != null) {
            if (viz.a(aogi)) {
                vka.a(vsd);
            } else {
                viz.a(str, vka, vsd, aakj, str2);
            }
        }
        if (vsd != null) {
            list = list.subList(1, list.size());
        }
        viz.a(str2, aakj, list);
    }
}
