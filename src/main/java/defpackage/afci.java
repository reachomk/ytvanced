package defpackage;

/* renamed from: afci */
final /* synthetic */ class afci implements amro {
    private final afbo a;

    afci(afbo afbo) {
        this.a = afbo;
    }

    public final Object get() {
        afbo afbo = this.a;
        return Integer.valueOf(Math.round(((float) afbo.B()) * afbo.y.P()));
    }
}
