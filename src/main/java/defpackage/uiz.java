package defpackage;

/* renamed from: uiz */
public final class uiz implements ujc {
    public float a = 0.0f;
    private final ujb b;
    private final ujb c;
    private final ujb d;
    private final float e;
    private final float f;
    private final float g;
    private float h;
    private float i;
    private float j;
    private final /* synthetic */ uja k;

    public uiz(uja uja, ujb ujb, ujb ujb2, ujb ujb3) {
        this.k = uja;
        this.b = ujb;
        this.c = ujb2;
        this.d = ujb3;
        this.e = ujb.a(ujb2.a);
        this.f = ujb.a(ujb2.b);
        this.g = (float) (ujb2.c / ujb.c);
        a(this.a);
    }

    public final void a(float f) {
        this.a = f;
        this.h = (float) uja.a((double) this.e, 0.0d, f);
        this.i = (float) uja.a((double) this.f, 1.0d, f);
        this.j = (float) uja.a((double) this.g, 1.0d, f);
        this.k.b();
    }

    public final float a(long j) {
        if (this.k.g) {
            return this.d.a(j);
        }
        ujb ujb = this.c;
        if (j < ujb.a) {
            return this.b.a(j) - (this.e - this.h);
        }
        if (j > ujb.b) {
            return this.b.a(j) + (this.i - this.f);
        }
        return this.h + (this.j * ujb.a(j));
    }

    public final long b(float f) {
        if (this.k.g) {
            return this.d.b(f);
        }
        float f2 = this.h;
        if (f < f2) {
            return this.b.b(f + (this.e - f2));
        }
        float f3 = this.i;
        if (f > f3) {
            return this.b.b(f - (f3 - this.f));
        }
        return this.c.b((f - f2) / this.j);
    }

    public final long c(float f) {
        return this.d.c(f);
    }
}
