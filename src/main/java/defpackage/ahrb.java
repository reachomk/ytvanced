package defpackage;

/* renamed from: ahrb */
final class ahrb implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ ahqt b;

    ahrb(ahqt ahqt, int i) {
        this.b = ahqt;
        this.a = i;
    }

    public final void run() {
        this.b.j.setGravity(this.a);
    }
}
