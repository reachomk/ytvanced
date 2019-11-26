package defpackage;

/* renamed from: mnc */
public final class mnc extends mmx implements afsw {
    private final String b;
    private final /* synthetic */ mmv c;

    public mnc(mmv mmv, String str) {
        this.c = mmv;
        super(mmv);
        this.b = str;
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final void d() {
        ammj.a("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.", new Object[0]);
    }

    public final void e() {
        throw new UnsupportedOperationException();
    }

    public final void f() {
        throw new UnsupportedOperationException();
    }

    public final void g() {
        this.a = new afsu(this);
        abjn a = this.c.c.a();
        a.a = this.b;
        this.c.c.a(a, this.a);
    }

    public final void a(bqn bqn) {
        xtl.a("Error loading ApiThumbnailLoader", (Throwable) bqn);
        this.c.d();
    }
}
