package defpackage;

/* renamed from: ahpt */
public final class ahpt implements ahmr {
    public float a;
    private final ahps b;
    private final ahmo c = new ahmo();
    private final float d;

    public ahpt(ahps ahps, float f, float f2) {
        this.b = ahps;
        this.a = f;
        this.d = f2;
    }

    public final void a(boolean z, long j) {
        this.c.a(z, j);
        float a = this.c.a();
        this.b.a((this.d * a) + ((1.0f - a) * this.a));
    }
}
