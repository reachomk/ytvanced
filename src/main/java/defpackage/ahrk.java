package defpackage;

/* renamed from: ahrk */
final class ahrk implements ahrf {
    private float a = 0.0f;
    private final /* synthetic */ ahrl b;

    ahrk(ahrl ahrl) {
        this.b = ahrl;
    }

    public final void a(float f, float f2) {
        f2 /= 2.0f;
        this.b.b.b(0.0f, f2 - this.a, 0.0f);
        this.b.a.b(0.0f, f2 - this.a, 0.0f);
        this.a = f2;
    }
}
