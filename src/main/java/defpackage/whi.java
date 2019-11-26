package defpackage;

/* renamed from: whi */
final class whi implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ whd b;

    whi(whd whd, String str) {
        this.b = whd;
        this.a = str;
    }

    public final void run() {
        whk whk = this.b.a;
        if (whk != null) {
            whk.a(this.a);
        }
    }
}
