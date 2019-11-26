package defpackage;

/* renamed from: mna */
public final class mna extends mmx implements afsw {
    private final String b;
    private int c;
    private int d = -1;
    private final /* synthetic */ mmv e;

    public mna(mmv mmv, String str, int i) {
        this.e = mmv;
        super(mmv);
        this.b = str;
        this.c = i;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.c < this.d + -1;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.c > 0;
    }

    private final void a(int i) {
        a();
        this.c = i;
        g();
    }

    public final void d() {
        a(0);
    }

    public final void e() {
        a(this.c + 1);
    }

    public final void f() {
        a(this.c - 1);
    }

    public final void g() {
        this.a = new afsu(this);
        abjn a = this.e.c.a();
        a.b = this.b;
        a.c = this.c;
        this.e.c.a(a, this.a);
    }

    public final void a(bqn bqn) {
        xtl.a("Error loading ApiThumbnailLoader", (Throwable) bqn);
        this.e.d();
    }
}
