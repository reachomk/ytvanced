package defpackage;

/* renamed from: yuu */
final /* synthetic */ class yuu implements bbnp {
    private final yuh a;
    private final String b;
    private final ykp c;
    private final String d;

    yuu(yuh yuh, String str, ykp ykp, String str2) {
        this.a = yuh;
        this.b = str;
        this.c = ykp;
        this.d = str2;
    }

    public final void a() {
        yuh yuh = this.a;
        String str = this.b;
        ykp ykp = this.c;
        String str2 = this.d;
        if (ykp.getAttachment() == null && str2 != null) {
            int i;
            int length = str2.length();
            yjf a = yuh.e.a();
            if ((a.b().a & 4) != 0) {
                apro apro = a.b().d;
                if (apro == null) {
                    apro = apro.c;
                }
                i = apro.b;
            } else {
                i = 10;
            }
            if (length >= i) {
                yuh.a.b(str).a(ykd.class).a(yuj.a).a(bbmt.a()).a(new yut(yuh, str2, str)).a();
            }
        }
    }
}
