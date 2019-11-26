package defpackage;

/* renamed from: wqw */
final class wqw implements afsw {
    private final /* synthetic */ byte[] a;
    private final /* synthetic */ asmw b;
    private final /* synthetic */ wqx c;

    wqw(wqx wqx, byte[] bArr, asmw asmw) {
        this.c = wqx;
        this.a = bArr;
        this.b = asmw;
    }

    public final void a(bqn bqn) {
        asmw asmw;
        if (bchf.a(this.a)) {
            wqu wqu = new wqu();
            wqu.a(this.a);
            wqu.a = 3;
            asmz asmz = (asmz) asmw.f.createBuilder();
            azly a = wqu.a();
            asmz.copyOnWrite();
            asmw asmw2 = (asmw) asmz.instance;
            if (a != null) {
                asmw2.c = a;
                asmw2.b = 191;
                asmw = (asmw) ((anxl) asmz.build());
            } else {
                throw new NullPointerException();
            }
        }
        asmw = null;
        this.c.c.dismiss();
        for (wqy b : this.c.d.a) {
            b.b();
        }
        this.c.a.c(bqn);
        a(asmw);
    }

    private final void a(asmw asmw) {
        if (asmw != null) {
            this.c.e.a(asmw);
        }
    }
}
