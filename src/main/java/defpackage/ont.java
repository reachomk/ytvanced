package defpackage;

/* renamed from: ont */
final class ont implements opr {
    public final opr a;
    public boolean b;
    private final /* synthetic */ onq c;

    public ont(onq onq, opr opr) {
        this.c = onq;
        this.a = opr;
    }

    public final boolean a() {
        return !this.c.f() && this.a.a();
    }

    public final void b() {
        this.a.b();
    }

    public final int a(nzy nzy, odj odj, boolean z) {
        if (this.c.f()) {
            return -3;
        }
        if (this.b) {
            odj.setFlags(4);
            return -4;
        }
        int a = this.a.a(nzy, odj, z);
        if (a == -5) {
            nzw nzw = nzy.a;
            a = nzw.y;
            if (!(a == 0 && nzw.z == 0)) {
                nzy.a = nzw.a(a, this.c.c == Long.MIN_VALUE ? nzw.z : 0);
            }
            return -5;
        }
        onq onq = this.c;
        long j = onq.c;
        if (j == Long.MIN_VALUE || ((a != -4 || odj.c < j) && (a != -3 || onq.d() != Long.MIN_VALUE))) {
            return a;
        }
        odj.clear();
        odj.setFlags(4);
        this.b = true;
        return -4;
    }

    public final int c_(long j) {
        return !this.c.f() ? this.a.c_(j) : -3;
    }
}
