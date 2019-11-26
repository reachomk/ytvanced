package defpackage;

/* renamed from: py */
final class py extends az {
    private static final be c = new qb();
    public final aaf a = new aaf();
    public boolean b = false;

    py() {
    }

    static py a(bf bfVar) {
        return (py) new bc(bfVar, c).a(py.class);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.b = false;
    }

    /* Access modifiers changed, original: final */
    public final pw c() {
        return (pw) this.a.a(54321);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        int c = this.a.c();
        for (int i = 0; i < c; i++) {
            ((pw) this.a.e(i)).e();
        }
        this.a.d();
    }
}
