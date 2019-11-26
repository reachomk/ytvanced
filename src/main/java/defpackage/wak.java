package defpackage;

/* renamed from: wak */
public final class wak implements abfg {
    private final aaga a;

    public wak(aaga aaga) {
        this.a = (aaga) amqw.a((Object) aaga);
        xvd.a(((aagr) aaga).d);
    }

    public final void a(abfj abfj) {
        int i = 1;
        abfj.r = true;
        abfj.O = 3;
        aaga aaga = this.a;
        if (aaga != null) {
            String str;
            if (aaga.ab() != null) {
                str = this.a.ab().b;
            } else {
                str = aagc.UNKNOWN.b;
            }
            int a = arzm.a(Integer.parseInt(str));
            if (a == 0) {
                a = 1;
            }
            abfj.N = a;
            abfj.b = this.a.g();
            if (this.a.p()) {
                i = 2;
            }
            abfj.P = i;
            abfj.E = this.a.f();
            return;
        }
        atek atek = null;
        if ((2 & atek.b().a) != 0) {
            aoim aoim = atek.b().c;
            if (aoim == null) {
                aoim = aoim.f;
            }
            int a2 = arzm.a(aoim.b);
            if (a2 == 0) {
                a2 = 1;
            }
            abfj.N = a2;
            a2 = arzr.a(aoim.d);
            if (a2 != 0) {
                i = a2;
            }
            abfj.P = i;
            abfj.E = aoim.e;
        }
        abfj.b = atek.e();
    }
}
