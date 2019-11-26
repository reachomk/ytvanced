package defpackage;

/* renamed from: bcrm */
public class bcrm extends bcrk {
    public final bcpn c;

    protected bcrm(bcpn bcpn, bcpm bcpm) {
        super(bcpm);
        if (bcpn == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (bcpn.c()) {
            this.c = bcpn;
        } else {
            throw new IllegalArgumentException("The field must be supported");
        }
    }

    public int a(long j) {
        throw null;
    }

    public long c(long j) {
        throw null;
    }

    public int g() {
        throw null;
    }

    public int h() {
        throw null;
    }

    public long b(long j, int i) {
        return this.c.b(j, i);
    }

    public bcpx d() {
        return this.c.d();
    }

    public bcpx e() {
        return this.c.e();
    }
}
