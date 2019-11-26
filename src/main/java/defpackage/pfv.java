package defpackage;

/* renamed from: pfv */
final class pfv {
    private final qaw a;
    private long b;

    public pfv(qaw qaw) {
        pzr.a((Object) qaw);
        this.a = qaw;
    }

    public final void a() {
        this.b = this.a.b();
    }

    public final void b() {
        this.b = 0;
    }

    public final boolean a(long j) {
        if (this.b == 0 || this.a.b() - this.b > j) {
            return true;
        }
        return false;
    }
}
