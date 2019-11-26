package defpackage;

/* renamed from: fta */
public final class fta implements eth, xzc {
    private final eti a;
    private xwz b;

    public fta(eti eti) {
        this.a = eti;
    }

    public final void a(xwz xwz) {
        this.b = xwz;
        if (this.b != null) {
            this.a.a(this);
            this.b.a(this.a.b);
            return;
        }
        this.a.a.remove(this);
    }

    public final void a(int i) {
        xwz xwz = this.b;
        if (xwz != null) {
            xwz.a(i);
        }
    }
}
