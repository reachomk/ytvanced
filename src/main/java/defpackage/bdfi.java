package defpackage;

/* renamed from: bdfi */
public final class bdfi extends bdfp {
    private final bdfk a;

    public static bdfi h() {
        return new bdfi(new bdfk());
    }

    private bdfi(bdfk bdfk) {
        super(bdfk);
        this.a = bdfk;
    }

    public final void e_(Object obj) {
        this.a.e_(obj);
    }

    public final void a(Throwable th) {
        this.a.a(th);
    }

    public final void bM_() {
        this.a.bM_();
    }
}
