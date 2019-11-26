package defpackage;

/* renamed from: adtr */
final /* synthetic */ class adtr implements Runnable {
    private final adtp a;
    private final adqe b;

    adtr(adtp adtp, adqe adqe) {
        this.a = adtp;
        this.b = adqe;
    }

    public final void run() {
        adtp adtp = this.a;
        adqe adqe = this.b;
        ((adtz) adtp.d.get()).b(adqe);
        for (adqi b : adtp.a) {
            b.b(adqe);
        }
    }
}
