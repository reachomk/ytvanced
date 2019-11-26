package defpackage;

/* renamed from: afwo */
final /* synthetic */ class afwo implements Runnable {
    private final afwk a;

    afwo(afwk afwk) {
        this.a = afwk;
    }

    public final void run() {
        afwk afwk = this.a;
        for (afwd afwd : afwk.a()) {
            afwd.f = (String) amqw.a(afwk.d);
            if (afwd.g == 4) {
                afwd.d();
            }
        }
    }
}
