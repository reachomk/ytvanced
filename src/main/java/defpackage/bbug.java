package defpackage;

/* renamed from: bbug */
final class bbug extends bbpi implements bbmo {
    public static final long serialVersionUID = 8443155186132538303L;
    public final bbmz a = new bbmz();
    private final bbmo b;
    private final bbyr c = new bbyr();
    private final bbnv d;
    private final boolean e = false;
    private bbnc f;
    private volatile boolean g;

    bbug(bbmo bbmo, bbnv bbnv, boolean z) {
        this.b = bbmo;
        this.d = bbnv;
        lazySet(1);
    }

    public final int a(int i) {
        return i & 2;
    }

    public final boolean b() {
        return true;
    }

    public final Object bI_() {
        return null;
    }

    public final void e() {
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.f, bbnc)) {
            this.f = bbnc;
            this.b.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        try {
            bblx bblx = (bblx) bbow.a(this.d.a(obj), "The mapper returned a null CompletableSource");
            getAndIncrement();
            bbnc bbuf = new bbuf(this);
            if (!this.g && this.a.a(bbuf)) {
                bblx.a(bbuf);
            }
        } catch (Throwable th) {
            bbnm.a(th);
            this.f.bK_();
            a(th);
        }
    }

    public final void a(Throwable th) {
        if (bbyw.a(this.c, th)) {
            if (!this.e) {
                bK_();
                if (getAndSet(0) > 0) {
                    this.b.a(bbyw.a(this.c));
                }
            } else if (decrementAndGet() == 0) {
                this.b.a(bbyw.a(this.c));
            }
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        if (decrementAndGet() == 0) {
            Throwable a = bbyw.a(this.c);
            if (a != null) {
                this.b.a(a);
            } else {
                this.b.a();
            }
        }
    }

    public final void bK_() {
        this.g = true;
        this.f.bK_();
        this.a.bK_();
    }

    public final boolean c() {
        return this.f.c();
    }
}
