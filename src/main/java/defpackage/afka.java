package defpackage;

/* renamed from: afka */
final /* synthetic */ class afka implements Runnable {
    private final afjz a;

    afka(afjz afjz) {
        this.a = afjz;
    }

    public final void run() {
        afjz afjz = this.a;
        afjz.a(afjz.getLeft(), afjz.getTop(), afjz.getRight(), afjz.getBottom());
    }
}
