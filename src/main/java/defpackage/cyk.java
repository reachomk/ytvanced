package defpackage;

/* renamed from: cyk */
public final class cyk extends cyd {
    public static final zy b = new aaa(2);
    private final cma c;
    private final coj d;

    public static cyj l() {
        cyj cyj = (cyj) b.a();
        return cyj == null ? new cyj() : cyj;
    }

    public final boolean c() {
        return true;
    }

    public final coj e() {
        return null;
    }

    public static dbz m() {
        cyj l = cyk.l();
        l.c = new cym();
        return l.b();
    }

    public final cma d() {
        return this.c;
    }

    /* synthetic */ cyk(cyj cyj) {
        super(cyj);
        cma cma = cyj.c;
        if (cma != null) {
            this.c = cma;
            this.d = null;
            return;
        }
        throw new IllegalStateException("Component must be provided.");
    }
}
