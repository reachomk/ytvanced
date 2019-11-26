package defpackage;

/* renamed from: acbd */
final /* synthetic */ class acbd implements Runnable {
    private final acav a;
    private final int b;

    acbd(acav acav, int i) {
        this.a = acav;
        this.b = i;
    }

    public final void run() {
        acav acav = this.a;
        int i = this.b;
        if (acav != null) {
            acav.a(i);
        }
    }
}
