package defpackage;

/* renamed from: bapn */
public final class bapn extends anrc {
    public final long a() {
        int a = a(4);
        return a != 0 ? ((long) this.b.getInt(a + this.a)) & 4294967295L : 0;
    }

    public final long b() {
        int a = a(6);
        return a != 0 ? ((long) this.b.getInt(a + this.a)) & 4294967295L : 0;
    }

    public final String c() {
        int a = a(8);
        return a != 0 ? c(a + this.a) : null;
    }

    public final float d() {
        int a = a(10);
        return a != 0 ? this.b.getFloat(a + this.a) : 0.0f;
    }

    public final long e() {
        int a = a(12);
        return a != 0 ? ((long) this.b.getInt(a + this.a)) & 4294967295L : 0;
    }

    public final int f() {
        int a = a(14);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }
}
