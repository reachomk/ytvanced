package defpackage;

/* renamed from: dde */
public final class dde extends cyd {
    public static final zy b = new aaa(2);
    private final cyb c;
    private final cye d;
    private final boolean e;
    private int f;

    public final boolean f() {
        return true;
    }

    public final cyb g() {
        return this.c;
    }

    public final cye h() {
        return this.d;
    }

    public final boolean i() {
        return this.e;
    }

    public final void a(int i) {
        if (this.e) {
            throw new UnsupportedOperationException("Cannot override custom view type.");
        }
        this.f = i;
    }

    public final int j() {
        return this.f;
    }

    /* synthetic */ dde(ddd ddd) {
        super(ddd);
        this.c = ddd.c;
        this.d = ddd.d;
        boolean z = ddd.e;
        this.e = z;
        if (z) {
            this.f = ddd.f;
        }
    }
}
