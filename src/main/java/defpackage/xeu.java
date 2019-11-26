package defpackage;

/* renamed from: xeu */
public final class xeu extends xeg {
    private final qfj a = new qfj();

    public final xdz a(int i) {
        this.a.a = i;
        return this;
    }

    public final xdz b(int i) {
        this.a.b = i;
        return this;
    }

    public final xdz c(int i) {
        this.a.c = i;
        return this;
    }

    public final xdw a() {
        qfj qfj = this.a;
        int i = qfj.a;
        boolean z = true;
        boolean z2 = i == 0 || i == 1;
        pzr.b(z2, "Must provide a valid RetryPolicy.");
        if (qfj.a == 0) {
            pzr.b(qfj.b > 0, "RETRY_POLICY_EXPONENTIAL must have a positive initialBackoffSeconds.");
        } else {
            pzr.b(qfj.b >= 10, "RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
        }
        if (qfj.c <= qfj.b) {
            z = false;
        }
        pzr.b(z, "MaximumBackoffSeconds must be greater than InitialBackoffSeconds.");
        return new xer(new qfh(qfj.a, qfj.b, qfj.c, (byte) 0));
    }
}
