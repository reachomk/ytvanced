package defpackage;

/* renamed from: aazt */
public abstract class aazt extends aaml {
    public auad a;

    public final aazt c(String str) {
        auag auag = (auag) auad.d.createBuilder();
        auag.a((String) amqw.a((Object) str));
        this.a = (auad) ((anxl) auag.build());
        return this;
    }

    public final aazt d(String str) {
        auag auag = (auag) auad.d.createBuilder();
        auag.b((String) amqw.a((Object) str));
        this.a = (auad) ((anxl) auag.build());
        return this;
    }

    public final aazt a(auad auad) {
        this.a = (auad) amqw.a((Object) auad);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b(this.a.c.isEmpty() != this.a.b.isEmpty());
    }

    /* synthetic */ aazt(String str, aamd aamd, afpt afpt) {
        super(str, aamd, afpt);
    }
}
