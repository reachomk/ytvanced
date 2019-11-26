package defpackage;

/* renamed from: jkd */
final class jkd implements biw {
    private final /* synthetic */ jjy a;

    jkd(jjy jjy) {
        this.a = jjy;
    }

    public final void a(int i, float f, int i2) {
        this.a.a.a(i, f, true);
        for (fao a : this.a.d) {
            a.a(f);
        }
    }

    public final void b(int i) {
        this.a.a(i, false);
    }

    public final void a(int i) {
        for (fao b : this.a.d) {
            b.b(i);
        }
    }
}
