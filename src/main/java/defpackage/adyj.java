package defpackage;

/* renamed from: adyj */
final /* synthetic */ class adyj implements adyu {
    private final adyg a;

    adyj(adyg adyg) {
        this.a = adyg;
    }

    public final void a_(adym adym) {
        adyg adyg = this.a;
        synchronized (adyg.a) {
            boolean z = false;
            if (adym.b().optInt("ver", 0) > 0) {
                z = true;
            }
            adyg.b = z;
        }
    }
}
