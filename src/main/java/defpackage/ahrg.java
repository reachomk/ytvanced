package defpackage;

/* renamed from: ahrg */
public final class ahrg extends ahor implements ahps, ahrf {
    private static final float b = ahsl.a(40.0f);
    private static final float[] c = new float[]{0.266f, 0.266f, 0.266f, 0.7f};
    private static final float e = ahsl.a(15.0f);
    public final ahqt a;
    private final ahne f;
    private final ahne g;

    public ahrg(ahrd ahrd, ahpn ahpn, bcaa bcaa, ahmq ahmq, float f) {
        ahsm a = ahsm.a(1.0f, 1.0f, ahsm.c);
        this.f = new ahne(a, (ahpn) ahpn.clone(), ahne.a(c, a.f), bcaa);
        this.f.e();
        float f2 = e;
        a = ahsm.a(f2, f2);
        this.g = new ahne(a, (ahpn) ahpn.clone(), ahne.a(c, a.f), bcaa);
        this.g.e();
        this.g.b(0.0f, -((b / 2.0f) + (e / 2.0f)), 0.0f);
        this.a = ahrd.a((ahpn) ahpn.clone(), ahsl.a(100.0f), ahsl.a(20.0f));
        this.a.a(-1);
        this.a.c(2.0f);
        this.a.a(true, true);
        this.a.a((ahrf) this);
        a(this.f);
        a(this.g);
        a(this.a);
        b(0.0f, (f + (b / 2.0f)) + (e / 2.0f), 0.0f);
        ahmq.a(new ahpt(this, 0.0f, 1.0f));
    }

    public final void a(float f, float f2) {
        this.f.a(f + ahsl.a(20.0f), b, 1.0f);
    }

    public final void a(float f) {
        this.f.c = f;
        this.a.c = f;
        this.g.c = f;
    }
}
