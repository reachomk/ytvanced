package defpackage;

/* renamed from: atr */
final class atr implements y {
    private final /* synthetic */ atq a;

    atr(atq atq) {
        this.a = atq;
    }

    public final void a(af afVar, aa aaVar) {
        if (aaVar == aa.ON_DESTROY && !this.a.isChangingConfigurations()) {
            this.a.R_().a();
        }
    }
}
