package defpackage;

/* renamed from: bcvy */
public final class bcvy extends bdcc implements bcud {
    public static final bcwd[] d = new bcwd[0];
    public final bctz a;
    public final bdfw b = new bdfw();
    public volatile bcwd[] c = d;
    public volatile boolean e;
    private boolean h;

    public bcvy(bctz bctz) {
        this.a = bctz;
    }

    public final void e_(Object obj) {
        if (!this.h) {
            b(bcwf.a(obj));
            b();
        }
    }

    public final void a(Throwable th) {
        if (!this.h) {
            this.h = true;
            b(bcwf.a(th));
            this.b.b();
            b();
        }
    }

    public final void bM_() {
        if (!this.h) {
            this.h = true;
            b(bcwf.a);
            this.b.b();
            b();
        }
    }

    private final void b() {
        for (bcwd a : this.c) {
            a.a();
        }
    }
}
