package defpackage;

/* renamed from: bczg */
final class bczg extends bcup {
    public final long a;
    private final bczj b;

    bczg(long j, bczj bczj) {
        this.a = j;
        this.b = bczj;
    }

    public final void a(bcuc bcuc) {
        bczj bczj = this.b;
        long j = this.a;
        synchronized (bczj) {
            if (bczj.c.get() != j) {
                return;
            }
            j = bczj.e;
            bczj.f = bcuc;
            bcuc.a(j);
        }
    }

    public final void e_(Object obj) {
        bczj bczj = this.b;
        synchronized (bczj) {
            if (bczj.c.get() == this.a) {
                bczj.d.a((Object) this, bcwf.a(obj));
                bczj.e();
                return;
            }
        }
    }

    public final void a(Throwable th) {
        boolean b;
        bczj bczj = this.b;
        long j = this.a;
        synchronized (bczj) {
            if (bczj.c.get() == j) {
                b = bczj.b(th);
                bczj.g = false;
                bczj.f = null;
            } else {
                b = true;
            }
        }
        if (b) {
            bczj.e();
        } else {
            bdeh.a(th);
        }
    }

    public final void bM_() {
        bczj bczj = this.b;
        long j = this.a;
        synchronized (bczj) {
            if (bczj.c.get() != j) {
                return;
            }
            bczj.g = false;
            bczj.f = null;
            bczj.e();
        }
    }
}
