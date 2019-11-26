package defpackage;

/* renamed from: azk */
final class azk implements Runnable {
    private final /* synthetic */ azl a;

    azk(azl azl) {
        this.a = azl;
    }

    public final void run() {
        azl azl = this.a;
        azl.f(true);
        azl.m.requestLayout();
        azl.m.getViewTreeObserver().addOnGlobalLayoutListener(new azm(azl));
    }
}
