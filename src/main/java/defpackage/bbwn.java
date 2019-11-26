package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbwn */
final class bbwn implements bbmo {
    public final bbxb a;
    public volatile boolean b;
    public Throwable c;
    public final AtomicReference d = new AtomicReference();
    private final bbwo e;

    bbwn(bbwo bbwo, int i) {
        this.e = bbwo;
        this.a = new bbxb(i);
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this.d, bbnc);
    }

    public final void b_(Object obj) {
        this.a.a(obj);
        this.e.a();
    }

    public final void a(Throwable th) {
        this.c = th;
        this.b = true;
        this.e.a();
    }

    public final void a() {
        this.b = true;
        this.e.a();
    }
}
