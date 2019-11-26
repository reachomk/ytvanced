package defpackage;

/* renamed from: ohg */
final class ohg implements ohf {
    private final oza a;
    private final int b = this.a.o();
    private final int c = (this.a.o() & 255);
    private int d;
    private int e;

    public ohg(oha oha) {
        this.a = oha.bg;
        this.a.c(12);
    }

    public final boolean c() {
        return false;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        int i = this.c;
        if (i == 8) {
            return this.a.d();
        }
        if (i == 16) {
            return this.a.e();
        }
        i = this.d;
        this.d = i + 1;
        if (i % 2 != 0) {
            return this.e & 15;
        }
        i = this.a.d();
        this.e = i;
        return (i & 240) >> 4;
    }
}
