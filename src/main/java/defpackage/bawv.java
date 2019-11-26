package defpackage;

/* renamed from: bawv */
final class bawv implements Runnable {
    public final bawq a;
    private final /* synthetic */ String b;
    private final /* synthetic */ baum c;
    private final /* synthetic */ bauw d;
    private final /* synthetic */ bbho e;
    private final /* synthetic */ barv f;
    private final /* synthetic */ bawt g;

    bawv(bawt bawt, String str, baum baum, bauw bauw, bbho bbho, barv barv) {
        this.g = bawt;
        this.b = str;
        this.c = baum;
        this.d = bauw;
        this.e = bbho;
        this.f = barv;
        String str2 = this.b;
        bawt bawt2 = this.g;
        this.a = new bawq(str2, bawt2.a, bawt2.e, this.c, bawt2, this, bawt2.c, bawt2.f, bawt2.g, this.d, this.e, this.f, bawt2.h);
    }

    public final void run() {
        synchronized (this.g.c) {
            bawt bawt = this.g;
            if (bawt.i) {
                this.a.n.b(bawt.j, true, new baum());
            } else if (bawt.k) {
                bawq bawq = this.a;
                bawt.d.add(bawq);
                bawq.n.i.o = bawt.l;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
