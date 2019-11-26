package defpackage;

/* renamed from: wrd */
final class wrd implements afsw {
    private final /* synthetic */ byte[] a;
    private final /* synthetic */ asmw b;
    private final /* synthetic */ wra c;

    wrd(wra wra, byte[] bArr, asmw asmw) {
        this.c = wra;
        this.a = bArr;
        this.b = asmw;
    }

    public final void a(bqn bqn) {
        asmw asmw;
        if (bchf.a(this.a)) {
            wrb wrb = new wrb();
            wrb.a(this.a);
            wrb.a = 3;
            asmz asmz = (asmz) asmw.f.createBuilder();
            azmc a = wrb.a();
            asmz.copyOnWrite();
            asmw asmw2 = (asmw) asmz.instance;
            if (a != null) {
                asmw2.c = a;
                asmw2.b = 196;
                asmw = (asmw) ((anxl) asmz.build());
            } else {
                throw new NullPointerException();
            }
        }
        asmw = null;
        this.c.c.dismiss();
        for (wrf b : this.c.d.a) {
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
