package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bbtw */
final class bbtw implements bbmo, bbnc {
    private final bbmo a;
    private final long b = 0;
    private final Object c;
    private final boolean d;
    private bbnc e;
    private long f;
    private boolean g;

    bbtw(bbmo bbmo, long j, Object obj, boolean z) {
        this.a = bbmo;
        this.c = obj;
        this.d = z;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.e, bbnc)) {
            this.e = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void bK_() {
        this.e.bK_();
    }

    public final boolean c() {
        return this.e.c();
    }

    public final void b_(Object obj) {
        if (!this.g) {
            long j = this.f;
            if (j == this.b) {
                this.g = true;
                this.e.bK_();
                this.a.b_(obj);
                this.a.a();
                return;
            }
            this.f = j + 1;
        }
    }

    public final void a(Throwable th) {
        if (this.g) {
            bbzf.a(th);
            return;
        }
        this.g = true;
        this.a.a(th);
    }

    public final void a() {
        if (!this.g) {
            this.g = true;
            Object obj = this.c;
            if (obj == null && this.d) {
                this.a.a(new NoSuchElementException());
                return;
            }
            if (obj != null) {
                this.a.b_(obj);
            }
            this.a.a();
        }
    }
}
