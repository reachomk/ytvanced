package defpackage;

/* renamed from: bcya */
final class bcya extends bcup {
    private static final int f = (bdch.c / 4);
    public final long a;
    public volatile boolean b;
    public volatile bdch c;
    private final bcyc d;
    private int e;

    public bcya(bcyc bcyc, long j) {
        this.d = bcyc;
        this.a = j;
    }

    public final void d() {
        this.e = bdch.c;
        a((long) bdch.c);
    }

    public final void e_(Object obj) {
        long j;
        Object obj2;
        Throwable th;
        bcyc bcyc = this.d;
        boolean z = true;
        if (bcyc.c.get() == 0) {
            j = 0;
            obj2 = null;
        } else {
            synchronized (bcyc) {
                j = bcyc.c.get();
                if (bcyc.d || j == 0) {
                    obj2 = null;
                } else {
                    bcyc.d = true;
                    obj2 = 1;
                }
            }
        }
        if (obj2 != null) {
            bdch bdch = this.c;
            if (bdch == null || bdch.e()) {
                try {
                    bcyc.a.e_(obj);
                } catch (Throwable th2) {
                    th = th2;
                }
                if (j != Long.MAX_VALUE) {
                    bcyc.c.a(1);
                }
                b(1);
                synchronized (bcyc) {
                    if (bcyc.e) {
                        bcyc.e = false;
                        bcyc.g();
                        return;
                    }
                    bcyc.d = false;
                    return;
                }
            }
            bcyc.a(this, obj);
            bcyc.g();
            return;
        }
        bcyc.a(this, obj);
        bcyc.f();
        return;
        if (!z) {
            synchronized (bcyc) {
                bcyc.d = false;
            }
        }
        throw th;
    }

    public final void a(Throwable th) {
        this.b = true;
        this.d.e().offer(th);
        this.d.f();
    }

    public final void bM_() {
        this.b = true;
        this.d.f();
    }

    public final void b(long j) {
        int i = this.e - ((int) j);
        if (i > f) {
            this.e = i;
            return;
        }
        this.e = bdch.c;
        int i2 = bdch.c - i;
        if (i2 > 0) {
            a((long) i2);
        }
    }
}
