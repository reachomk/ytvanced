package defpackage;

/* renamed from: akqm */
final /* synthetic */ class akqm implements Runnable {
    private final akqf a;
    private final akra b;
    private final aqj c;

    akqm(akqf akqf, akra akra, aqj aqj) {
        this.a = akqf;
        this.b = akra;
        this.c = aqj;
    }

    public final void run() {
        akqf akqf = this.a;
        akra akra = this.b;
        aqj aqj = this.c;
        akqf.c.a.remove(akra);
        akqf.c.b.remove(akra);
        akqf.c.c.remove(aqj);
        akqf.f(aqj);
        akqf.c();
    }
}
