package defpackage;

/* renamed from: yoj */
final /* synthetic */ class yoj implements xsd {
    private final yoh a;

    yoj(yoh yoh) {
        this.a = yoh;
    }

    public final void a(Object obj) {
        yoh yoh = this.a;
        yki yki = (yki) ((aadz) obj).c();
        if (yki != null && yki.b()) {
            yoh.l = yki;
            yob yob = yoh.j;
            amul a = yoh.a(yki);
            ahc a2 = ahb.a(new yoe(yob, a));
            yob.c.clear();
            yob.c.addAll(a);
            a2.a(yob);
            yoh.h.a(true);
            yoh.h.b(false);
        }
    }
}
