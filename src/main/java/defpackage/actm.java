package defpackage;

/* renamed from: actm */
final /* synthetic */ class actm implements anij {
    private final acti a;

    actm(acti acti) {
        this.a = acti;
    }

    public final anjv a() {
        acti acti = this.a;
        acti.a.run();
        if (acti.b.get() == 0) {
            return anjf.a(null);
        }
        return anjf.a(new IllegalStateException("Could not start location updates"));
    }
}
