package defpackage;

/* renamed from: cys */
public final class cys extends clz {
    private cyq a;

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final cys b(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public final cys a() {
        this.a.e = true;
        return this;
    }

    public final cys c(CharSequence charSequence) {
        this.a.f = charSequence;
        return this;
    }

    public final cys u(float f) {
        this.a.g = this.c.b(f);
        return this;
    }

    public final cys f(coj coj) {
        this.a.u = coj;
        return this;
    }

    /* renamed from: b */
    public final cyq c() {
        cyq cyq = this.a;
        super.e();
        this.a = null;
        return cyq;
    }

    static /* synthetic */ void a(cys cys, cmg cmg, cyq cyq) {
        super.a(cmg, (cma) cyq);
        cys.a = cyq;
    }
}
