package defpackage;

/* renamed from: wpr */
final /* synthetic */ class wpr implements Runnable {
    private final wpo a;

    wpr(wpo wpo) {
        this.a = wpo;
    }

    public final void run() {
        wpo wpo = this.a;
        wpo.dismiss();
        wpk wpk = wpo.Z;
        if (wpk != null) {
            wpk.b();
        }
    }
}
