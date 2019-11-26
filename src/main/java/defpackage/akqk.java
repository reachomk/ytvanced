package defpackage;

/* renamed from: akqk */
final /* synthetic */ class akqk implements Runnable {
    private final akqf a;
    private final akpz b;
    private final aqj c;

    akqk(akqf akqf, akpz akpz, aqj aqj) {
        this.a = akqf;
        this.b = akpz;
        this.c = aqj;
    }

    public final void run() {
        akqf akqf = this.a;
        akpz akpz = this.b;
        aqj aqj = this.c;
        akqf.b.a.remove(akpz);
        akqf.b.b.remove(akpz);
        akqf.b.c.remove(aqj);
        akqf.f(aqj);
        akqf.c();
    }
}
