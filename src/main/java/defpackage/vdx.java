package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: vdx */
public final class vdx implements vlw {
    private final Set a = new HashSet();
    private final aaas b;

    public vdx(aaas aaas) {
        this.b = aaas;
    }

    public final void a(vdw vdw) {
        if (vdw != null) {
            this.a.add(vdw);
        }
    }

    public final void b(vdw vdw) {
        if (vdw != null) {
            this.a.remove(vdw);
        }
    }

    public final /* synthetic */ boolean a(vsj vsj, vlz vlz) {
        if (!(vsj instanceof vrv) || this.a.isEmpty()) {
            return false;
        }
        vdv vdv = (vdv) vlz;
        ((vlr) vdv.c.a.get()).b(vdv.a, vdv.b);
        for (vdw a : this.a) {
            a.a((vrv) vsj);
        }
        akcb b = ((vrv) vsj).b();
        if (!(b == null || b.m == null)) {
            if (this.b != null) {
                this.b.a(b.m, amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", b));
            } else {
                afpc.a(2, afpf.ad, "EndpointResolver is not available in CompanionAndImmersiveLayoutRenderingHandler.");
            }
        }
        ((vlr) vdv.c.a.get()).a(vdv.a, vdv.b, vlq.a);
        return true;
    }
}
