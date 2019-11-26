package defpackage;

/* renamed from: ahak */
public final class ahak implements afhg {
    private final afhg a;
    private final amro b;
    private final xhv c;

    public ahak(afhg afhg, amro amro, xhv xhv) {
        this.a = (afhg) amqw.a((Object) afhg);
        this.b = (amro) amqw.a((Object) amro);
        this.c = xhv;
    }

    public final ovi a(afhi afhi) {
        return afhj.a(this);
    }

    public final ovi a() {
        if (!ahap.b(this.c)) {
            return this.a.a();
        }
        ovi a = this.a.a();
        ahao ahao = (ahao) this.b.get();
        return (a == null || ahao == null) ? null : new ahal(a, ahao);
    }
}
