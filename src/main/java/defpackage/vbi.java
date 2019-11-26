package defpackage;

/* renamed from: vbi */
final /* synthetic */ class vbi implements Runnable {
    private final vbg a;

    vbi(vbg vbg) {
        this.a = vbg;
    }

    public final void run() {
        vbg vbg = this.a;
        vbg.c.requestFocus();
        vbg.X();
    }
}
