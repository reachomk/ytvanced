package defpackage;

/* renamed from: adlf */
final /* synthetic */ class adlf implements Runnable {
    private final adlg a;
    private final bbs b;
    private final adkt c;

    adlf(adlg adlg, bbs bbs, adkt adkt) {
        this.a = adlg;
        this.b = bbs;
        this.c = adkt;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
