package defpackage;

/* renamed from: adio */
public abstract class adio extends adis {
    public adim e;

    adio() {
    }

    public abstract adix a();

    public abstract String bq_();

    public abstract adjb br_();

    public final int bs_() {
        return 4;
    }

    public abstract adik d();

    public abstract adin e();

    public final String b() {
        return br_().a;
    }

    public final String bv_() {
        return bq_();
    }

    public final boolean f() {
        return this.e != null;
    }

    public final adin g() {
        adin e = e();
        e.a = this.e;
        return e;
    }

    public static adin h() {
        return new adib();
    }
}
