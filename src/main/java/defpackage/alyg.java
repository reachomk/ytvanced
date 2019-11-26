package defpackage;

/* renamed from: alyg */
public final /* synthetic */ class alyg implements anij {
    private final alyf a;
    private final String b;
    private final afpt c;
    private final ameo d;

    public alyg(alyf alyf, String str, afpt afpt, ameo ameo) {
        this.a = alyf;
        this.b = str;
        this.c = afpt;
        this.d = ameo;
    }

    public final anjv a() {
        alyf alyf = this.a;
        String str = this.b;
        afpt afpt = this.c;
        ameo ameo = this.d;
        boolean z = true;
        amqw.a(str.isEmpty() ^ 1);
        if (afpt == afpt.g) {
            z = false;
        }
        amqw.a(z);
        String a = alyf.e.a(4, false);
        String.valueOf(a).length();
        str.length();
        for (amea amea : alyf.f.b().values()) {
            if (str.equals(amea.G)) {
                throw new IllegalArgumentException("Attempted to add a new FeedbackOnlyUpload with a non-unique videoId.");
            }
        }
        amdz amdz = (amdz) amea.U.createBuilder();
        amdz.e(str);
        amdz.c(a);
        amdz.a(ameo);
        amdz.a(afpt.a());
        amdz.a(System.currentTimeMillis());
        amdz.a(4);
        amdz.a(amjq.a(10));
        amdz.e(amjq.a());
        amdz.b(amjq.a());
        amdz.c(amjq.a());
        amdz.i(amjq.a());
        amdz.j(amjq.a());
        amdz.m(amjq.a());
        amdz.l(amjq.a());
        amdz.f(amjq.a());
        amdz.k(amjq.a());
        amdz.f();
        alyf.a(a, amdz);
        Object obj = (amea) ((anxl) amdz.build());
        alyf.f.a(a, (amea) obj);
        alyf.i.a(a, aytx.UPLOAD_FLOW_SOURCE_UNKNOWN, 5, (aytw[]) alyf.a().toArray(new aytw[0]));
        amct a2 = amct.a(a).a();
        amde amde = (amde) alyf.j.b(alyf.a);
        amde.c();
        alyf.l.a(a2);
        amde.a(a2);
        return anjf.a(obj);
    }
}
