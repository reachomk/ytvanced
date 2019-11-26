package defpackage;

/* renamed from: alkr */
final class alkr implements Runnable {
    private final /* synthetic */ alkc a;

    alkr(alkc alkc) {
        this.a = alkc;
    }

    public final void run() {
        this.a.ag.animate().setDuration(250).translationY((float) (-this.a.ah.getHeight())).start();
    }
}
