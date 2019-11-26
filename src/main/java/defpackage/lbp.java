package defpackage;

/* renamed from: lbp */
final class lbp implements kwy {
    private final /* synthetic */ xci a;
    private final /* synthetic */ lbm b;

    lbp(lbm lbm, xci xci) {
        this.b = lbm;
        this.a = xci;
    }

    public final void a() {
        for (int i = 0; i < this.b.d.size(); i++) {
            if (this.b.d.get(i) instanceof awgz) {
                int a = awhb.a(((awgz) this.b.d.get(i)).e);
                if (a != 0 && a == 4) {
                    return;
                }
            }
        }
        this.a.d(new lbr(this.b.c));
    }

    public final void b() {
        this.b.b.g(true);
    }
}
