package defpackage;

/* renamed from: bvu */
final class bvu implements bvw, cid {
    private static final zy a = chx.a(20, new bvt());
    private final cif b = cif.a();
    private bvw c;
    private boolean d;
    private boolean e;

    static bvu a(bvw bvw) {
        bvu bvu = (bvu) chw.a((bvu) a.a());
        bvu.e = false;
        bvu.d = true;
        bvu.c = bvw;
        return bvu;
    }

    bvu() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void e() {
        this.b.b();
        if (this.d) {
            this.d = false;
            if (this.e) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final Class a() {
        return this.c.a();
    }

    public final Object b() {
        return this.c.b();
    }

    public final int c() {
        return this.c.c();
    }

    public final synchronized void d() {
        this.b.b();
        this.e = true;
        if (!this.d) {
            this.c.d();
            this.c = null;
            a.a(this);
        }
    }

    public final cif h_() {
        return this.b;
    }
}
