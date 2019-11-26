package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbum */
final class bbum extends AtomicInteger implements bbmo, bbnc {
    public static final long serialVersionUID = 8600231336733376951L;
    public final bbmo a;
    public final boolean b = false;
    public final bbmz c = new bbmz();
    public final AtomicInteger d = new AtomicInteger(1);
    public final bbyr e = new bbyr();
    public final AtomicReference f = new AtomicReference();
    public bbnc g;
    private final bbnv h;
    private volatile boolean i;

    bbum(bbmo bbmo, bbnv bbnv) {
        this.a = bbmo;
        this.h = bbnv;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.g, bbnc)) {
            this.g = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        try {
            bbmg bbmg = (bbmg) bbow.a(this.h.a(obj), "The mapper returned a null MaybeSource");
            this.d.getAndIncrement();
            bbnc bbul = new bbul(this);
            if (!this.i && this.c.a(bbul)) {
                bbmg.b(bbul);
            }
        } catch (Throwable th) {
            bbnm.a(th);
            this.g.bK_();
            a(th);
        }
    }

    public final void a(Throwable th) {
        this.d.decrementAndGet();
        if (bbyw.a(this.e, th)) {
            this.c.bK_();
            b();
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        this.d.decrementAndGet();
        b();
    }

    public final void bK_() {
        this.i = true;
        this.g.bK_();
        this.c.bK_();
    }

    public final boolean c() {
        return this.i;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    private final void f() {
        bbxb bbxb = (bbxb) this.f.get();
        if (bbxb != null) {
            bbxb.e();
        }
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        bbmo bbmo = this.a;
        AtomicInteger atomicInteger = this.d;
        AtomicReference atomicReference = this.f;
        int i = 1;
        while (!this.i) {
            Throwable a;
            if (((Throwable) this.e.get()) == null) {
                int i2 = atomicInteger.get();
                bbxb bbxb = (bbxb) atomicReference.get();
                Object bI_ = bbxb != null ? bbxb.bI_() : null;
                Object obj = bI_ != null ? null : 1;
                if (i2 != 0) {
                    if (obj != null) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else if (obj != null) {
                    a = bbyw.a(this.e);
                    if (a != null) {
                        bbmo.a(a);
                        return;
                    } else {
                        bbmo.a();
                        return;
                    }
                }
                bbmo.b_(bI_);
            } else {
                a = bbyw.a(this.e);
                f();
                bbmo.a(a);
                return;
            }
        }
        f();
    }
}
