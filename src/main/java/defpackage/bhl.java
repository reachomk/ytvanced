package defpackage;

/* renamed from: bhl */
final class bhl extends bhc {
    private final bhj a;

    bhl(bhj bhj) {
        this.a = bhj;
    }

    public final void d() {
        bhj bhj = this.a;
        if (!bhj.t) {
            bhj.e();
            this.a.t = true;
        }
    }

    public final void a(bgx bgx) {
        bhj bhj = this.a;
        int i = bhj.a - 1;
        bhj.a = i;
        if (i == 0) {
            bhj.t = false;
            bhj.f();
        }
        bgx.b((bhd) this);
    }
}
