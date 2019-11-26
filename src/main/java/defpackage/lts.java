package defpackage;

/* renamed from: lts */
final class lts implements akng {
    public airi a;
    public final /* synthetic */ ltn b;

    public final void d_(int i, int i2) {
        b();
    }

    public final void e_(int i, int i2) {
        b();
    }

    public final void f_(int i, int i2) {
        b();
    }

    public final void g_(int i, int i2) {
        b();
    }

    public final void bF_() {
        b();
    }

    public final void b() {
        airi airi = this.a;
        if (airi != null && airi.a(airi.VIDEO_REQUESTED)) {
            ltn ltn = this.b;
            int i = 0;
            for (int i2 = 0; i2 < this.b.a.size(); i2++) {
                if (this.b.a.get(i2) instanceof eqd) {
                    i = 1;
                    break;
                }
            }
            ltn.a(i ^ 1);
        }
    }

    /* synthetic */ lts(ltn ltn) {
        this.b = ltn;
    }
}
