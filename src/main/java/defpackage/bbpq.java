package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbpq */
public final class bbpq extends AtomicReference implements bbmo, bbnc {
    public static final long serialVersionUID = -5417183359794346637L;
    public bbpg a;
    public volatile boolean b;
    private final bbpp c;
    private final int d;
    private int e;

    public bbpq(bbpp bbpp, int i) {
        this.c = bbpp;
        this.d = i;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.b(this, bbnc)) {
            int a;
            bbpg bbxb;
            if (bbnc instanceof bboz) {
                bboz bboz = (bboz) bbnc;
                a = bboz.a(3);
                if (a == 1) {
                    this.e = 1;
                    this.a = bboz;
                    this.b = true;
                    this.c.a(this);
                    return;
                } else if (a == 2) {
                    this.e = 2;
                    this.a = bboz;
                    return;
                }
            }
            int i = this.d;
            a = -i;
            if (a < 0) {
                bbxb = new bbxb(i);
            } else {
                bbxb = new bbxc(a);
            }
            this.a = bbxb;
        }
    }

    public final void b_(Object obj) {
        if (this.e == 0) {
            this.c.a(this, obj);
        } else {
            this.c.b();
        }
    }

    public final void a(Throwable th) {
        this.c.a(this, th);
    }

    public final void a() {
        this.c.a(this);
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final void b() {
        this.b = true;
    }
}
