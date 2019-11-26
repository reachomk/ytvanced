package defpackage;

/* renamed from: ahqu */
final class ahqu implements Runnable {
    private final /* synthetic */ ahqt a;

    ahqu(ahqt ahqt) {
        this.a = ahqt;
    }

    public final void run() {
        this.a.j.invalidate();
    }
}
