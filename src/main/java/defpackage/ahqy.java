package defpackage;

/* renamed from: ahqy */
final class ahqy implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ ahqt b;

    ahqy(ahqt ahqt, int i) {
        this.b = ahqt;
        this.a = i;
    }

    public final void run() {
        this.b.j.setTextColor(this.a);
    }
}
