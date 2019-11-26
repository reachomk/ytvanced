package defpackage;

/* renamed from: opj */
final class opj implements opr {
    public final int a;
    private final /* synthetic */ opa b;

    public opj(opa opa, int i) {
        this.b = opa;
        this.a = i;
    }

    public final boolean a() {
        opa opa = this.b;
        int i = this.a;
        boolean z = false;
        if (!opa.h()) {
            if (!opa.w) {
                return !opa.m[i].c() ? z : true;
            } else {
                z = true;
            }
        }
    }

    public final void b() {
        this.b.g();
    }

    public final int a(nzy nzy, odj odj, boolean z) {
        int i;
        opa opa = this.b;
        int i2 = this.a;
        if (opa.h()) {
            i = -3;
        } else {
            opa.a(i2);
            i = opa.m[i2].a(nzy, odj, z, opa.w, opa.v);
            if (i == -3) {
                opa.b(i2);
                return -3;
            }
        }
        return i;
    }

    public final int c_(long j) {
        int i;
        opa opa = this.b;
        int i2 = this.a;
        if (opa.h()) {
            i = 0;
        } else {
            opa.a(i2);
            opm opm = opa.m[i2];
            if (!opa.w || j <= opm.g()) {
                i = opm.a(j, true);
                if (i == -1) {
                    i = 0;
                }
            } else {
                i = opm.j();
            }
            if (i == 0) {
                opa.b(i2);
                return 0;
            }
        }
        return i;
    }
}
