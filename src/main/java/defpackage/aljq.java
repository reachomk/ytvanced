package defpackage;

/* renamed from: aljq */
final class aljq implements Runnable {
    private final /* synthetic */ aljp a;

    aljq(aljp aljp) {
        this.a = aljp;
    }

    public final void run() {
        this.a.ab.animate().setDuration(250).translationY((float) (-this.a.ac.getHeight())).start();
    }
}
