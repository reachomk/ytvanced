package defpackage;

/* renamed from: ify */
public final class ify implements aimd {
    private final /* synthetic */ icw a;
    private final /* synthetic */ ifl b;

    public ify(ifl ifl, icw icw) {
        this.b = ifl;
        this.a = icw;
    }

    public final void a(int i, int i2, int i3) {
        boolean z;
        if ((i == 2 || i == 1) && this.b.h.d.b() && i3 != 0 && this.b.s() && this.b.w.a == aicj.PLAYING) {
            this.b.t();
            this.b.r();
        } else {
            this.b.q();
            if (this.b.h.d.a()) {
                this.b.e();
                this.b.t();
            }
        }
        ifl ifl = this.b;
        if (ifl.z && ifl.h.d.a()) {
            this.b.c.a();
        } else {
            this.b.c.b();
        }
        ails ails = this.b.h;
        if ((ails instanceof hyy) && ails.d.a()) {
            z = true;
        } else {
            z = false;
        }
        this.a.a(icz.a, Boolean.valueOf(z));
        ief ief = this.b.d;
        ief.c = z;
        ief.a(false);
        ifl = this.b;
        hze hze = ifl.i;
        i = ifl.h.d.c() ^ 1;
        hze.c = i;
        if (i == 0) {
            hze.a();
        }
    }

    public final void a(float f, boolean z) {
        if (z && this.b.h.d.d()) {
            this.b.t();
        }
        float a = 1.0f - th.a(f);
        this.b.a.a.setAlpha(a);
        this.b.n.a(a);
    }
}
