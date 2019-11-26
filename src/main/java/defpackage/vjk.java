package defpackage;

import java.util.Arrays;

/* renamed from: vjk */
final /* synthetic */ class vjk implements vis {
    private final vji a;
    private final String b;
    private final vka c;

    vjk(vji vji, String str, vka vka) {
        this.a = vji;
        this.b = str;
        this.c = vka;
    }

    public final void a(vso vso) {
        vji vji = this.a;
        String str = this.b;
        vka vka = this.c;
        aopb a = wcf.a(vji.a.g);
        if (a != null && a.f) {
            if ((vso instanceof vrx) || (vso instanceof vta)) {
                vji.a.a(str, vka.c(), vso);
            }
            ((vgz) vji.a.h.get()).a(vka.a, vka.c(), Arrays.asList(new vso[]{vso}), false);
            return;
        }
        if ((vso instanceof vrx) || (vso instanceof vta)) {
            vji.a.a(str, vka.c(), vso);
            ((vgz) vji.a.h.get()).a(vka.a, vka.c(), Arrays.asList(new vso[]{vso}), false);
        }
    }
}
