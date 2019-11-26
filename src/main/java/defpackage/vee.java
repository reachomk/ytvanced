package defpackage;

/* renamed from: vee */
public final class vee extends ajmp {
    private final vry a;
    private final vrx b;
    private final /* synthetic */ vef c;

    public vee(vef vef, vry vry, vrx vrx) {
        this.c = vef;
        vsv vsv = vry.d;
        super(vsv.a, vsv.b, ajms.DEFAULT, ajmr.AD_MARKER, null);
        this.a = vry;
        this.b = vrx;
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        ((vls) this.c.a.get()).c(this.a);
        ((vlr) this.c.b.get()).b(this.a, this.b);
        ((vlr) this.c.b.get()).a(this.a, this.b, vlq.a);
        ((vlr) this.c.b.get()).a(this.a, this.b, new vlt());
        ((vls) this.c.a.get()).b(this.a);
    }
}
