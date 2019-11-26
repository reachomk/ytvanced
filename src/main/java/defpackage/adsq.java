package defpackage;

/* renamed from: adsq */
final class adsq implements adtx {
    private final /* synthetic */ adso a;

    adsq(adso adso) {
        this.a = adso;
    }

    public final void a() {
        amqw.a(this.a.e);
        adso adso = this.a;
        adso.e.c();
        adso.d();
    }

    public final void b() {
        adtl adtl = this.a.f;
        if (adtl == null) {
            xtl.b(adso.a, "mdxSessionInRecovery is null when onRecoverCompleted() is called.");
        }
        adso adso = this.a;
        adso.g = adtl;
        adso.a(4);
    }
}
