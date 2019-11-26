package defpackage;

/* renamed from: ahur */
final class ahur implements ahqf {
    private final /* synthetic */ ahts a;
    private final /* synthetic */ ahuo b;

    ahur(ahuo ahuo, ahts ahts) {
        this.b = ahuo;
        this.a = ahts;
    }

    public final void a() {
    }

    public final void a(float f) {
        this.a.a(c(f));
    }

    public final void b(float f) {
        ahuo ahuo = this.b;
        ahuo.b.b(-ahuo.i, 0.0f, 0.0f);
        ahuo = this.b;
        float f2 = ahuo.a.g * f;
        ahuo.i = f2;
        ahuo.b.b(f2, 0.0f, 0.0f);
        long c = c(f);
        if (aicd.a(this.b.k)) {
            c -= this.b.g;
        }
        ahsl.a(this.b.f, xvd.b(c / 1000));
        this.b.b.e();
    }

    private final long c(float f) {
        ahuo ahuo = this.b;
        long j = ahuo.g;
        long j2 = ahuo.h;
        return (long) Math.ceil((double) (((f * ((((float) (j - j2)) / 1000.0f) + 1.0f)) * 1000.0f) + ((float) j2)));
    }
}
