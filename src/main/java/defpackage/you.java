package defpackage;

/* renamed from: you */
final /* synthetic */ class you implements yxn {
    private final yor a;

    you(yor yor) {
        this.a = yor;
    }

    public final void a() {
        yor yor = this.a;
        yor.f.a(yor.f() ^ 1, true);
        ywk ywk = yor.h;
        String str = yor.i.a;
        String str2 = yor.g;
        yow yow = new yow(yor);
        ywc ywc = (ywc) ywk.e.get(str);
        if (ywc == null) {
            ywf ywf = ywk.c;
            aadw aadw = (aadw) ywf.a((aadw) ywf.a.get(), 4);
            aarh aarh = (aarh) ywf.a((aarh) ywf.b.get(), 5);
            ywc = r10;
            ywc ywc2 = new ywc((String) ywf.a(str, 1), (ywd) ywf.a(yow, 2), (ywg) ywf.a(new yws(ywk, str), 3), aadw, aarh, (aaas) ywf.a((aaas) ywf.c.get(), 6));
            ywk.e.put(str, ywc);
        }
        ylf ylf = (ylf) ywc.b.a(ywc.a);
        if (ylf != null && ylf.b()) {
            boolean b = ylf.b(str2);
            int a = ywc.a();
            int i = a - 1;
            if (a == 0) {
                throw null;
            } else if (i != 0) {
                if (i == 1) {
                    ywc.a(3, 3, str2);
                } else if (i == 2) {
                    ywc.a(2, 3, str2);
                }
            } else if (b) {
                ywc.b(ylf, str2);
            } else {
                ywc.a(ylf, str2);
            }
        }
    }
}
