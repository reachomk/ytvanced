package defpackage;

/* renamed from: ffv */
public abstract class ffv implements fgs {
    public fgv a;
    public int b;
    private fob c;

    public abstract boolean a(fob fob, int i);

    public final void f() {
        fgv fgv = this.a;
        if (fgv != null) {
            fgv.a();
            this.a = null;
            this.c = null;
        }
    }

    public void a(fob fob) {
        if (this.c == fob) {
            f();
        }
    }

    public final boolean a(fob fob, int i, fgv fgv) {
        if (a(fob, i)) {
            return true;
        }
        this.a = fgv;
        this.b = i;
        this.c = fob;
        return false;
    }
}
