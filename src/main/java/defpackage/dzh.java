package defpackage;

/* renamed from: dzh */
final class dzh implements afqd {
    private final /* synthetic */ apxu b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ dzi d;

    dzh(dzi dzi, apxu apxu, Object obj) {
        this.d = dzi;
        this.b = apxu;
        this.c = obj;
    }

    public final void b() {
    }

    public final void a() {
        try {
            this.d.a(this.b, this.c);
        } catch (aabf e) {
            this.d.b.c(e);
        }
    }

    public final void a(Exception exception) {
        this.d.b.c(exception);
    }
}
