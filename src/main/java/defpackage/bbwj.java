package defpackage;

/* renamed from: bbwj */
final class bbwj implements bbmo {
    private final bbwm a;

    bbwj(bbwm bbwm) {
        this.a = bbwm;
    }

    public final void a() {
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this.a.c, bbnc);
    }

    public final void b_(Object obj) {
        this.a.lazySet(obj);
    }

    public final void a(Throwable th) {
        bbwm bbwm = this.a;
        bbnz.a(bbwm.b);
        bbwm.a.a(th);
    }
}
