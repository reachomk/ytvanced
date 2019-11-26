package defpackage;

/* renamed from: basg */
public abstract class basg extends batg {
    public barz a;

    protected basg(barz barz) {
        this.a = barz;
    }

    public abstract void b(basc basc, baum baum);

    /* Access modifiers changed, original: protected|final */
    public final barz b() {
        return this.a;
    }

    public final void a(basc basc, baum baum) {
        try {
            b(basc, baum);
        } catch (Exception e) {
            this.a = base.a;
            basc.a(bavx.a(e), new baum());
        }
    }
}
