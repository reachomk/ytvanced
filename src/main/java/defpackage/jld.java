package defpackage;

/* renamed from: jld */
final /* synthetic */ class jld implements Runnable {
    private final jky a;
    private final String b;
    private final String c;
    private final ayuq d;

    jld(jky jky, String str, String str2, ayuq ayuq) {
        this.a = jky;
        this.b = str;
        this.c = str2;
        this.d = ayuq;
    }

    public final void run() {
        jky jky = this.a;
        String str = this.b;
        String str2 = this.c;
        ayuq ayuq = this.d;
        fnp a = jky.a.a(str, str2);
        if (a != null) {
            arml arml;
            int i = ayuq.b;
            apxu apxu = null;
            if ((ayuq.a & 2) != 0) {
                arml = ayuq.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            a.r = ajqy.a(arml);
            if ((ayuq.a & 4) != 0) {
                arml = ayuq.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            a.s = ajqy.a(arml);
            if ((ayuq.a & 8) != 0) {
                apxu = ayuq.e;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            a.t = apxu;
            jky.a.a(a);
        }
    }
}
