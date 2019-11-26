package defpackage;

/* renamed from: jlc */
final /* synthetic */ class jlc implements Runnable {
    private final jky a;
    private final String b;
    private final String c;
    private final aysn d;

    jlc(jky jky, String str, String str2, aysn aysn) {
        this.a = jky;
        this.b = str;
        this.c = str2;
        this.d = aysn;
    }

    public final void run() {
        jky jky = this.a;
        String str = this.b;
        String str2 = this.c;
        aysn aysn = this.d;
        fnp a = jky.a.a(str, str2);
        if (a != null) {
            apxu apxu;
            if ((aysn.a & 2) != 0) {
                apxu = aysn.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = null;
            }
            a.u = apxu;
            if ((aysn.a & 1) != 0) {
                auvr auvr = aysn.b;
                if (auvr == null) {
                    auvr = auvr.c;
                }
                if ((auvr.a & 1) != 0) {
                    auvr = aysn.b;
                    if (auvr == null) {
                        auvr = auvr.c;
                    }
                    auvn auvn = auvr.b;
                    if (auvn == null) {
                        auvn = auvn.l;
                    }
                    a.e = auvn;
                }
            } else {
                a.e = null;
            }
            jky.a.a(a);
        }
    }
}
