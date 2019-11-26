package defpackage;

/* renamed from: adtu */
final /* synthetic */ class adtu implements Runnable {
    private final adtp a;
    private final adqe b;

    adtu(adtp adtp, adqe adqe) {
        this.a = adtp;
        this.b = adqe;
    }

    public final void run() {
        adtp adtp = this.a;
        adqe adqe = this.b;
        ((adtz) adtp.d.get()).c(adqe);
        for (adqi c : adtp.a) {
            c.c(adqe);
        }
    }
}
