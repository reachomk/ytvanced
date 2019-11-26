package defpackage;

/* renamed from: afqo */
final /* synthetic */ class afqo implements Runnable {
    private final afqk a;
    private final nkf b;
    private final bqn c;

    afqo(afqk afqk, nkf nkf, bqn bqn) {
        this.a = afqk;
        this.b = nkf;
        this.c = bqn;
    }

    public final void run() {
        afqk afqk = this.a;
        nkf nkf = this.b;
        bqn bqn = this.c;
        if (nkf.b() < nkf.c() && !aftq.a(bqn) && ((nkg) nkf.instance).n != 0) {
            int b = nkf.b();
            nkf.copyOnWrite();
            nkg nkg = (nkg) nkf.instance;
            nkg.a |= 256;
            nkg.k = b + 1;
            long a = afqk.c.a();
            nkf.copyOnWrite();
            nkg nkg2 = (nkg) nkf.instance;
            nkg2.a |= 512;
            nkg2.l = a;
            afqk.a(nkf);
        }
    }
}
