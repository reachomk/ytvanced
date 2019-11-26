package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbwa */
final class bbwa extends AtomicReference implements bbmo {
    public static final long serialVersionUID = 3837284832786408377L;
    public volatile bbpg a;
    public volatile boolean b;
    private final bbvz c;
    private final long d;
    private final int e;

    bbwa(bbvz bbvz, long j, int i) {
        this.c = bbvz;
        this.d = j;
        this.e = i;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.b(this, bbnc)) {
            if (bbnc instanceof bboz) {
                bboz bboz = (bboz) bbnc;
                int a = bboz.a(7);
                if (a == 1) {
                    this.a = bboz;
                    this.b = true;
                    this.c.b();
                    return;
                } else if (a == 2) {
                    this.a = bboz;
                    return;
                }
            }
            this.a = new bbxb(this.e);
        }
    }

    public final void b_(Object obj) {
        if (this.d == this.c.d) {
            if (obj != null) {
                this.a.a(obj);
            }
            this.c.b();
        }
    }

    public final void a(Throwable th) {
        bbvz bbvz = this.c;
        if (this.d == bbvz.d && bbyw.a(bbvz.b, th)) {
            boolean z = bbvz.a;
            bbvz.c.bK_();
            this.b = true;
            bbvz.b();
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        if (this.d == this.c.d) {
            this.b = true;
            this.c.b();
        }
    }
}
