package defpackage;

import java.util.Arrays;

/* renamed from: vjc */
final /* synthetic */ class vjc implements vis {
    private final viz a;
    private final String b;
    private final vqy c;
    private final String d;

    vjc(viz viz, String str, vqy vqy, String str2) {
        this.a = viz;
        this.b = str;
        this.c = vqy;
        this.d = str2;
    }

    public final void a(vso vso) {
        viz viz = this.a;
        String str = this.b;
        vqy vqy = this.c;
        String str2 = this.d;
        if (vso != null) {
            viz.a(str, vqy, vso);
            ((vgz) viz.h.get()).a(str2, vqy, Arrays.asList(new vso[]{vso}), true);
        }
    }
}
