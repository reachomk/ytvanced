package defpackage;

/* renamed from: ahpc */
final /* synthetic */ class ahpc implements Runnable {
    private final ahpa a;

    ahpc(ahpa ahpa) {
        this.a = ahpa;
    }

    public final void run() {
        ahpa ahpa = this.a;
        ahpa.i.removeView(ahpa.k);
    }
}
