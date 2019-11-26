package defpackage;

/* renamed from: knj */
final class knj implements Runnable {
    private final azem a;
    private final /* synthetic */ kng b;

    knj(kng kng, azem azem) {
        this.b = kng;
        this.a = azem;
    }

    public final void run() {
        if (this.a != null) {
            gak gak = this.b.b;
            if (!(gak == null || gak.d())) {
                this.b.a.performHapticFeedback(0);
                this.b.a.getParent().requestDisallowInterceptTouchEvent(true);
                gak = this.b.b;
                azem azem = this.a;
                if (!gak.d()) {
                    gak.b.removeCallbacks(gak.a);
                    gao gao = gak.a;
                    gao.a = azem;
                    gak.b.post(gao);
                }
            }
        }
        this.b.c = true;
    }
}
