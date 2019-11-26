package defpackage;

/* renamed from: abxd */
final class abxd implements Runnable {
    private final /* synthetic */ abxa a;

    abxd(abxa abxa) {
        this.a = abxa;
    }

    public final void run() {
        int dimensionPixelOffset = this.a.a.a.getResources().getDimensionPixelOffset(this.a.a.g.a(3));
        if (dimensionPixelOffset < this.a.a.b.b(ugo.FULLY_EXPANDED)) {
            this.a.a.b.a(ugo.COLLAPSED, dimensionPixelOffset);
        }
    }
}
