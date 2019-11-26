package defpackage;

/* renamed from: wpq */
final /* synthetic */ class wpq implements Runnable {
    private final wpo a;

    wpq(wpo wpo) {
        this.a = wpo;
    }

    public final void run() {
        wpo wpo = this.a;
        if (wpo.aa) {
            wpo.dismiss();
        }
    }
}
