package defpackage;

/* renamed from: nox */
public final class nox {
    public final boolean a;
    public final nnx b;
    public npm c;
    public npa d;
    public nmx e;
    public final long f;
    public long g;
    public int h;

    public nox(nou nou, long j, long j2, npm npm) {
        this.f = j;
        this.g = j2;
        this.c = npm;
        String str = npm.b.b;
        boolean b = nou.b(str);
        this.a = b;
        this.b = !b ? new nnx(nou.c(str)) : null;
        this.d = npm.d();
    }

    public final long a(int i) {
        return this.d.a(i - this.h) + this.f;
    }

    public final long b(int i) {
        return a(i) + this.d.a(i - this.h, this.g);
    }

    public final int a() {
        return this.d.a(this.g);
    }

    public final boolean c(int i) {
        int a = a();
        return a != -1 && i > a + this.h;
    }

    public final npj d(int i) {
        return this.d.b(i - this.h);
    }
}
