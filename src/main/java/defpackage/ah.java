package defpackage;

/* renamed from: ah */
final class ah {
    public z a;
    private final y b;

    ah(ag agVar, z zVar) {
        this.b = aj.a((Object) agVar);
        this.a = zVar;
    }

    /* Access modifiers changed, original: final */
    public final void a(af afVar, aa aaVar) {
        z b = ai.b(aaVar);
        this.a = ai.a(this.a, b);
        this.b.a(afVar, aaVar);
        this.a = b;
    }
}
