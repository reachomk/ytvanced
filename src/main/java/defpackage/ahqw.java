package defpackage;

/* renamed from: ahqw */
final class ahqw implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ ahqt b;

    ahqw(ahqt ahqt, String str) {
        this.b = ahqt;
        this.a = str;
    }

    public final void run() {
        this.b.j.setText(this.a);
    }
}
