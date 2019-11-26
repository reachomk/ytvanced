package defpackage;

/* renamed from: msn */
final class msn implements msu {
    private final /* synthetic */ mso a;

    public final void a() {
        msk msk = this.a.b;
        if (msk != null) {
            msk.a();
        }
    }

    public final void a(boolean z) {
        mso mso = this.a;
        mso.d = z;
        if (z) {
            mso.e();
            this.a.d();
        } else {
            mso.c();
        }
        this.a.j();
    }

    public final void b() {
        this.a.c();
    }

    public final void a(int i) {
        this.a.a.a(i);
    }

    /* synthetic */ msn(mso mso) {
        this.a = mso;
    }
}
