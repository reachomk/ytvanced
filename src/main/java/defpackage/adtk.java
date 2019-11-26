package defpackage;

/* renamed from: adtk */
public final class adtk implements ajla {
    private static final String a = xtl.b("MDX.DismissPlugin");
    private final adqf b;

    public adtk(adqf adqf) {
        this.b = adqf;
    }

    public final void a() {
        if (this.b.g()) {
            this.b.e();
            return;
        }
        adtq adtq = (adtq) this.b.c();
        if (adtq != null) {
            adtq.b(2);
        } else {
            xtl.b(a, "onDismissPlayback got called when mdx session isn't active");
        }
    }
}
