package defpackage;

/* renamed from: onw */
public final class onw implements opq {
    private final opq[] a;

    public onw(opq[] opqArr) {
        this.a = opqArr;
    }

    public final long d() {
        long j = Long.MAX_VALUE;
        for (opq d : this.a) {
            long d2 = d.d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long e() {
        long j = Long.MAX_VALUE;
        for (opq e : this.a) {
            long e2 = e.e();
            if (e2 != Long.MIN_VALUE) {
                j = Math.min(j, e2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void a(long j) {
        for (opq a : this.a) {
            a.a(j);
        }
    }

    public final boolean c(long j) {
        long j2 = j;
        int i = 0;
        int i2;
        do {
            long e = e();
            if (e == Long.MIN_VALUE) {
                break;
            }
            i2 = 0;
            for (opq opq : this.a) {
                long e2 = opq.e();
                Object obj = (e2 == Long.MIN_VALUE || e2 > j2) ? null : 1;
                if (e2 == e || obj != null) {
                    i2 |= opq.c(j2);
                }
            }
            i |= i2;
        } while (i2 != 0);
        return i != 0;
    }
}
