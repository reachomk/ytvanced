package defpackage;

/* renamed from: afby */
final /* synthetic */ class afby implements Runnable {
    private final afbo a;
    private final afif b;

    afby(afbo afbo, afif afif) {
        this.a = afbo;
        this.b = afif;
    }

    public final void run() {
        afbo afbo = this.a;
        afif afif = this.b;
        afbo.a(true);
        afbo.a(afif);
    }
}
