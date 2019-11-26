package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbqi */
final class bbqi extends AtomicInteger implements bbmb, bbnc {
    public static final long serialVersionUID = -2108443387387077490L;
    public final bblv a;
    public final int b;
    public final boolean c;
    public final bbyr d = new bbyr();
    public final bbmz e = new bbmz();
    public bctr f;

    bbqi(bblv bblv, int i, boolean z) {
        this.a = bblv;
        this.b = i;
        this.c = z;
        lazySet(1);
    }

    public final void bK_() {
        this.f.d();
        this.e.bK_();
    }

    public final boolean c() {
        return this.e.a;
    }

    public final void a(bctr bctr) {
        if (bbyq.a(this.f, bctr)) {
            this.f = bctr;
            this.a.a(this);
            int i = this.b;
            if (i == Integer.MAX_VALUE) {
                bctr.b(Long.MAX_VALUE);
            } else {
                bctr.b((long) i);
            }
        }
    }

    public final void a(Throwable th) {
        if (!this.c) {
            this.e.bK_();
            if (!bbyw.a(this.d, th)) {
                bbzf.a(th);
            } else if (getAndSet(0) > 0) {
                this.a.a_(bbyw.a(this.d));
            }
        } else if (!bbyw.a(this.d, th)) {
            bbzf.a(th);
        } else if (decrementAndGet() == 0) {
            this.a.a_(bbyw.a(this.d));
        }
    }

    public final void a() {
        if (decrementAndGet() != 0) {
            return;
        }
        if (((Throwable) this.d.get()) != null) {
            this.a.a_(bbyw.a(this.d));
        } else {
            this.a.bL_();
        }
    }

    public final /* synthetic */ void c_(Object obj) {
        bblx bblx = (bblx) obj;
        getAndIncrement();
        bbnc bbqh = new bbqh(this);
        this.e.a(bbqh);
        bblx.a(bbqh);
    }
}
