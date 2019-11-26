package defpackage;

/* renamed from: ahfy */
final /* synthetic */ class ahfy implements Runnable {
    private final ahfv a;

    ahfy(ahfv ahfv) {
        this.a = ahfv;
    }

    public final void run() {
        ahfv ahfv = this.a;
        if (!ahfv.b.k && ahfv.c.requestAudioFocus(ahfv.d, 3, 1) == 1) {
            ahga ahga = ahfv.d;
            ahga.c.i = 1;
            ahga.a = false;
        }
    }
}
