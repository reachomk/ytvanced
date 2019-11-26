package defpackage;

/* renamed from: yiy */
final /* synthetic */ class yiy implements bbnv {
    private final yir a;
    private final String b;
    private final boolean c;
    private final yjd d;
    private final bbmo e;

    yiy(yir yir, String str, boolean z, yjd yjd, bbmo bbmo) {
        this.a = yir;
        this.b = str;
        this.c = z;
        this.d = yjd;
        this.e = bbmo;
    }

    public final Object a(Object obj) {
        yir yir = this.a;
        String str = this.b;
        return yir.a.a(str, false).a(bbmt.a()).b(new yje(yir, (amqp) obj, this.c, this.d, str, this.e));
    }
}
