package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbxg */
final class bbxg extends bbmp {
    private final bbob a = new bbob();
    private final bbmz b = new bbmz();
    private final bbob c = new bbob();
    private final bbxi d;
    private volatile boolean e;

    bbxg(bbxi bbxi) {
        this.d = bbxi;
        this.c.a(this.a);
        this.c.a(this.b);
    }

    public final void bK_() {
        if (!this.e) {
            this.e = true;
            this.c.bK_();
        }
    }

    public final boolean c() {
        return this.e;
    }

    public final bbnc a(Runnable runnable) {
        if (this.e) {
            return bboc.INSTANCE;
        }
        return this.d.a(runnable, 0, TimeUnit.MILLISECONDS, this.a);
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.e) {
            return bboc.INSTANCE;
        }
        return this.d.a(runnable, j, timeUnit, this.b);
    }
}
