package defpackage;

/* renamed from: pgb */
public abstract class pgb extends pgc {
    private boolean a;

    protected pgb(pgd pgd) {
        super(pgd);
    }

    public abstract void a();

    public final boolean e() {
        return this.a;
    }

    public final void f() {
        if (!e()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void g() {
        a();
        this.a = true;
    }
}
