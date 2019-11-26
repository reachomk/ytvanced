package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbuh */
final class bbuh extends AtomicInteger implements bbmo, bbnc {
    public static final long serialVersionUID = 8443155186132538303L;
    public final bbmz a = new bbmz();
    private final bblv b;
    private final bbyr c = new bbyr();
    private final bbnv d;
    private final boolean e = false;
    private bbnc f;
    private volatile boolean g;

    bbuh(bblv bblv, bbnv bbnv) {
        this.b = bblv;
        this.d = bbnv;
        lazySet(1);
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.f, bbnc)) {
            this.f = bbnc;
            this.b.a(this);
        }
    }

    public final void b_(Object obj) {
        try {
            bblx bblx = (bblx) bbow.a(this.d.a(obj), "The mapper returned a null CompletableSource");
            getAndIncrement();
            bbnc bbuk = new bbuk(this);
            if (!this.g && this.a.a(bbuk)) {
                bblx.a(bbuk);
            }
        } catch (Throwable th) {
            bbnm.a(th);
            this.f.bK_();
            a(th);
        }
    }

    public final void a(Throwable th) {
        if (bbyw.a(this.c, th)) {
            bK_();
            if (getAndSet(0) > 0) {
                this.b.a_(bbyw.a(this.c));
            }
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        if (decrementAndGet() == 0) {
            Throwable a = bbyw.a(this.c);
            if (a != null) {
                this.b.a_(a);
            } else {
                this.b.bL_();
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
