package defpackage;

/* renamed from: afzw */
final /* synthetic */ class afzw implements Runnable {
    private final afzs a;
    private final String b;

    afzw(afzs afzs, String str) {
        this.a = afzs;
        this.b = str;
    }

    public final void run() {
        afzs afzs = this.a;
        String str = this.b;
        xak.b();
        agfi agfi = (agfi) afzs.k.get();
        avsi f = agfi.f(str);
        int b = ((agvs) afzs.e.get()).b(f);
        agqq r = afzs.r(str);
        agqk l = agfi.l(str);
        agdu a = afzs.s.a(str);
        if (a == null) {
            a = afzs.s.a(l.a, null);
        }
        agdu agdu = a;
        agdu.b();
        agec b2 = ((agdz) afzs.r.get()).b();
        for (String str2 : agfi.r(str)) {
            String str3 = str2;
            agec agec = b2;
            agdu agdu2 = agdu;
            ((agdo) afzs.n.get()).a(str, str2, null, f, b, false, 0, r, false, 0, true);
            String str4 = str3;
            agdu2.a(str4);
            agec agec2 = agec;
            agec2.a(str4);
            agdu = agdu2;
            b2 = agec2;
        }
    }
}
