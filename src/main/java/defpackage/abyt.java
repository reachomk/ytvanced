package defpackage;

/* renamed from: abyt */
public final class abyt implements abyu, abzk {
    public abzn a;
    public int b = 0;
    private final abyv c;
    private final abzt d;

    public abyt(abzt abzt) {
        this.d = abzt;
        this.c = new abyv(this);
    }

    public final synchronized boolean a(boolean z, abzm abzm, abyq abyq) {
        int c = this.d.c();
        int d = this.d.d();
        if (c == 0 || d == 0) {
            return false;
        }
        this.c.a(c, d);
        return this.c.a(z, abzm, abyq);
    }

    public final void a(abyq abyq) {
        this.c.a();
        this.b = 0;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final synchronized void a() {
        abzn abzn = this.a;
        if (abzn != null) {
            abzn.a();
        }
    }
}
