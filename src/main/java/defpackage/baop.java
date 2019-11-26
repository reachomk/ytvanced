package defpackage;

/* renamed from: baop */
public final class baop extends anrc {
    public final long a() {
        int a = a(4);
        return a != 0 ? ((long) this.b.getInt(a + this.a)) & 4294967295L : 0;
    }

    public final long b() {
        int a = a(6);
        return a != 0 ? ((long) this.b.getInt(a + this.a)) & 4294967295L : 0;
    }

    public final baoz c() {
        baoz baoz = new baoz();
        int a = a(8);
        if (a == 0) {
            return null;
        }
        baoz.a(b(a + this.a), this.b);
        return baoz;
    }

    public final baoz d() {
        baoz baoz = new baoz();
        int a = a(10);
        if (a == 0) {
            return null;
        }
        baoz.a(b(a + this.a), this.b);
        return baoz;
    }
}
