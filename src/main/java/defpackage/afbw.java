package defpackage;

/* renamed from: afbw */
final /* synthetic */ class afbw implements afih {
    private final afbo a;
    private final int b;

    afbw(afbo afbo, int i) {
        this.a = afbo;
        this.b = i;
    }

    public final void a(afif afif) {
        afbo afbo = this.a;
        afbo.j.post(new afbz(afbo, this.b, new afby(afbo, afif)));
    }
}
