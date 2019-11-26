package defpackage;

/* renamed from: akqo */
final /* synthetic */ class akqo implements Runnable {
    private final akqf a;
    private final akqx b;
    private final aqj c;

    akqo(akqf akqf, akqx akqx, aqj aqj) {
        this.a = akqf;
        this.b = akqx;
        this.c = aqj;
    }

    public final void run() {
        akqf akqf = this.a;
        akqx akqx = this.b;
        aqj aqj = this.c;
        akqf.d.a.remove(akqx);
        akqf.d.b.remove(akqx);
        akqf.d.c.remove(aqj);
        akqf.f(aqj);
        akqf.c();
    }
}
