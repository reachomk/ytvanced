package defpackage;

/* renamed from: adts */
final /* synthetic */ class adts implements Runnable {
    private final adtp a;
    private final adqe b;

    adts(adtp adtp, adqe adqe) {
        this.a = adtp;
        this.b = adqe;
    }

    public final void run() {
        adtp adtp = this.a;
        adqe adqe = this.b;
        ((adtz) adtp.d.get()).a(adqe);
        for (adqi a : adtp.a) {
            a.a(adqe);
        }
    }
}
