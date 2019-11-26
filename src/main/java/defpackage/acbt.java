package defpackage;

/* renamed from: acbt */
final class acbt implements achp {
    private boolean a;
    private boolean b;
    private final /* synthetic */ acay c;

    acbt(acay acay) {
        this.c = acay;
    }

    public final void a(achm achm) {
        acay acay = this.c;
        if (achm == acay.j) {
            this.a = true;
        }
        if (achm == acay.k) {
            this.b = true;
        }
        if (this.a && this.b) {
            this.a = false;
            this.b = false;
            amqw.a(acay.c);
            acay acay2 = this.c;
            acay2.c.post(acay2.z);
        }
    }
}
