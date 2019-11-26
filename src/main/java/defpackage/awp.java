package defpackage;

/* renamed from: awp */
public final class awp extends avt {
    public awo j = null;
    public float k = Float.MAX_VALUE;

    public awp(awm awm) {
        super(awm);
    }

    /* Access modifiers changed, original: final */
    public final boolean b(long j) {
        float f;
        awj a;
        if (this.k != Float.MAX_VALUE) {
            long j2 = j / 2;
            awj a2 = this.j.a((double) this.b, (double) this.a, j2);
            this.j.a(this.k);
            this.k = Float.MAX_VALUE;
            a = this.j.a((double) a2.a, (double) a2.b, j2);
            f = a.a;
            this.b = f;
            this.a = a.b;
        } else {
            a = this.j.a((double) this.b, (double) this.a, j);
            f = a.a;
            this.b = f;
            this.a = a.b;
        }
        float max = Math.max(f, this.g);
        this.b = max;
        max = Math.min(max, this.f);
        this.b = max;
        f = this.a;
        awo awo = this.j;
        if (((double) Math.abs(f)) >= awo.e || ((double) Math.abs(max - awo.a())) >= awo.d) {
            return false;
        }
        this.b = this.j.a();
        this.a = 0.0f;
        return true;
    }
}
