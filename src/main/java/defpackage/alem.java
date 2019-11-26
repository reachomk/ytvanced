package defpackage;

/* renamed from: alem */
final class alem implements akcp {
    private final /* synthetic */ avwc a;
    private final /* synthetic */ alla b;
    private final /* synthetic */ alek c;

    alem(alek alek, avwc avwc, alla alla) {
        this.c = alek;
        this.a = avwc;
        this.b = alla;
    }

    public final void a() {
        this.c.b(this.a).a(true, this.b);
        this.c.b = null;
    }

    public final void b() {
        alla alla = this.b;
        if (alla != null) {
            alla.a();
        }
        this.c.b = null;
    }

    public final void a(boolean z) {
        alla alla = this.b;
        if (alla != null && z) {
            alla.a();
        }
        this.c.b = null;
    }
}
