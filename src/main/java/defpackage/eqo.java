package defpackage;

/* renamed from: eqo */
public final class eqo extends akcn {
    private final auvn a;

    public eqo(auvn auvn, aaas aaas, Object obj) {
        super(aaas, obj);
        this.a = (auvn) amqw.a((Object) auvn);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        auvj auvj = (auvj) this.a.b.get(i);
        if (this.a.b.size() > i) {
            if (abmk.d(auvj) != null) {
                this.d.a(abmk.d(auvj), c());
            } else if (abmk.c(auvj) != null) {
                this.d.a(abmk.c(auvj), c());
            }
            c(4);
        }
    }
}
