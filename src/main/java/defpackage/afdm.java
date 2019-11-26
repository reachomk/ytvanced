package defpackage;

/* renamed from: afdm */
final /* synthetic */ class afdm implements Runnable {
    private final afdn a;

    afdm(afdn afdn) {
        this.a = afdn;
    }

    public final void run() {
        afdn afdn = this.a;
        aeps aeps = (aeps) afdn.d.e.get();
        if (aeps == null || !afdn.d.k || ((long) aeps.g()) <= afdn.c) {
            afdn.b.postDelayed(afdn.a, 1000);
        } else {
            afdn.c();
        }
    }
}
