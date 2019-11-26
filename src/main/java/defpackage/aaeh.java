package defpackage;

/* renamed from: aaeh */
public final class aaeh extends bbzx {
    private final bbzt a;
    private final Runnable b;

    private aaeh(bbzt bbzt, Runnable runnable) {
        this.a = bbzt;
        this.b = runnable;
    }

    public static aaeh a(Runnable runnable) {
        return new aaeh(bbzt.b(), (Runnable) amqw.a((Object) runnable));
    }

    public final boolean b() {
        return ((bbzw[]) this.a.a.get()).length != 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbmo bbmo) {
        this.a.a(new aaej(bbmo, this));
    }

    public final void a(bbnc bbnc) {
        this.a.a(bbnc);
    }

    public final void b_(Object obj) {
        this.a.b_(obj);
    }

    public final void a(Throwable th) {
        this.a.a(th);
        this.b.run();
    }

    public final void a() {
        this.a.a();
        this.b.run();
    }
}
