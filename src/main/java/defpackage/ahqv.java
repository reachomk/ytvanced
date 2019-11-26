package defpackage;

/* renamed from: ahqv */
final class ahqv implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ ahqt b;

    ahqv(ahqt ahqt, boolean z) {
        this.b = ahqt;
        this.a = z;
    }

    public final void run() {
        this.b.j.setVisibility(!this.a ? 0 : 8);
    }
}
