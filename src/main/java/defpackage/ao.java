package defpackage;

/* renamed from: ao */
final class ao extends an implements y {
    private final af d;
    private final /* synthetic */ am e;

    ao(am amVar, af afVar, ar arVar) {
        this.e = amVar;
        super(amVar, arVar);
        this.d = afVar;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.d.y_().a().a(z.STARTED);
    }

    public final void a(af afVar, aa aaVar) {
        if (this.d.y_().a() == z.DESTROYED) {
            this.e.a(this.a);
        } else {
            a(a());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(af afVar) {
        return this.d == afVar;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.d.y_().b(this);
    }
}
