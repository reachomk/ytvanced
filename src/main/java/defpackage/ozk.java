package defpackage;

/* renamed from: ozk */
public final class ozk implements oyr {
    public final oye a;
    public boolean b;
    public long c;
    public oag d = oag.a;
    private long e;

    public ozk(oye oye) {
        this.a = oye;
    }

    public final void a(long j) {
        this.e = j;
        if (this.b) {
            this.c = this.a.a();
        }
    }

    public final long aQ_() {
        long j = this.e;
        if (!this.b) {
            return j;
        }
        long a = this.a.a() - this.c;
        oag oag = this.d;
        if (oag.b == 1.0f) {
            a = nyr.b(a);
        } else {
            a *= (long) oag.e;
        }
        return j + a;
    }

    public final oag a(oag oag) {
        if (this.b) {
            a(aQ_());
        }
        this.d = oag;
        return oag;
    }

    public final oag aR_() {
        return this.d;
    }
}
