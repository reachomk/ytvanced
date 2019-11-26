package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: vjh */
final /* synthetic */ class vjh implements vis {
    private final viz a;
    private final String b;
    private final vsm c;
    private final boolean d;
    private final String e;
    private final vka f;

    vjh(viz viz, String str, vsm vsm, boolean z, String str2, vka vka) {
        this.a = viz;
        this.b = str;
        this.c = vsm;
        this.d = z;
        this.e = str2;
        this.f = vka;
    }

    public final void a(vso vso) {
        viz viz = this.a;
        String str = this.b;
        vsm vsm = this.c;
        boolean z = this.d;
        String str2 = this.e;
        vka vka = this.f;
        if (vso == null) {
            ((vgz) viz.h.get()).a(str, vth.c, amul.g(), vsm, 0, 0, null);
            if (z) {
                viz.e.d(new vpc());
            }
            return;
        }
        viz.a(str2, vka.c(), vso);
        if ((vso instanceof vtk) || (vso instanceof vrc)) {
            viz.e.d(new vpk());
        }
        vgz vgz = (vgz) viz.h.get();
        vqy c = vka.c();
        List asList = Arrays.asList(new vso[]{vso});
        vkc vkc = vka.e;
        vgz.a(str, c, asList, vsm, vkc.b, vkc.c, vso.i());
    }
}
