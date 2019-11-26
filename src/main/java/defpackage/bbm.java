package defpackage;

/* renamed from: bbm */
final class bbm extends vq {
    public final /* synthetic */ bbj e;

    bbm(bbj bbj, int i, int i2, int i3) {
        this.e = bbj;
        super(i, i2, i3);
    }

    public final void a(int i) {
        this.e.c.f.post(new bbl(this, i));
    }

    public final void b(int i) {
        this.e.c.f.post(new bbo(this, i));
    }
}
