package defpackage;

/* renamed from: akog */
public final class akog implements akng {
    public final aknh a;
    public int b = 0;
    private int c = this.a.d();
    private final /* synthetic */ akoh d;

    public akog(akoh akoh, aknh aknh) {
        this.d = akoh;
        this.a = (aknh) amqw.a((Object) aknh);
    }

    public final int a(int i) {
        return i - this.b;
    }

    public final int b() {
        return this.b + this.a.d();
    }

    public final void bF_() {
        this.d.c();
        int d = this.a.d();
        int min = Math.min(this.c, d);
        if (min > 0) {
            this.d.a(this.b, min);
        }
        int i = this.c;
        if (i > min) {
            this.d.d(this.b + min, i - min);
        } else if (d > min) {
            this.d.b(this.b + min, d - min);
        }
        this.c = d;
    }

    public final void d_(int i, int i2) {
        this.d.c();
        this.d.a(this.b + i, i2);
        this.c = this.a.d();
    }

    public final void e_(int i, int i2) {
        this.d.c();
        this.d.b(this.b + i, i2);
        this.c = this.a.d();
    }

    public final void f_(int i, int i2) {
        this.d.c();
        akoh akoh = this.d;
        int i3 = this.b;
        akoh.c(i + i3, i3 + i2);
        this.c = this.a.d();
    }

    public final void g_(int i, int i2) {
        this.d.c();
        this.d.d(this.b + i, i2);
        this.c = this.a.d();
    }
}
