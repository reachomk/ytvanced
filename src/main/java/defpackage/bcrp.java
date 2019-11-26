package defpackage;

/* renamed from: bcrp */
public class bcrp extends bcrn {
    public static final long serialVersionUID = 8019982251647420015L;
    public final bcpx b;

    public bcrp(bcpx bcpx, bcpw bcpw) {
        super(bcpw);
        if (bcpx.b()) {
            this.b = bcpx;
            return;
        }
        throw new IllegalArgumentException("The field must be supported");
    }

    public final boolean c() {
        return this.b.c();
    }

    public long a(long j, int i) {
        return this.b.a(j, i);
    }

    public long a(long j, long j2) {
        return this.b.a(j, j2);
    }

    public long d() {
        return this.b.d();
    }
}
