package defpackage;

/* renamed from: xxd */
public final class xxd implements zbe {
    private zcm a;

    public final zcm a(zcm zcm, boolean z) {
        zcm zcm2 = this.a;
        if (z) {
            a();
        }
        this.a = zcm;
        return zcm2;
    }

    public final void a(zcm zcm) {
        if (this.a == zcm) {
            this.a = null;
        }
    }

    public final void a() {
        zcm zcm = this.a;
        if (zcm != null) {
            zcm.b(true);
            this.a = null;
        }
    }

    public final void b() {
        this.a = null;
    }
}
