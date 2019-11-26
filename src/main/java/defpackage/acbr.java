package defpackage;

/* renamed from: acbr */
final /* synthetic */ class acbr implements Runnable {
    private final acay a;
    private final boolean b = true;
    private final acav c;

    acbr(acay acay, acav acav) {
        this.a = acay;
        this.c = acav;
    }

    public final void run() {
        acay acay = this.a;
        boolean z = this.b;
        acav acav = this.c;
        xak.b();
        if (acay.w != 2 || !acay.j() || !acay.j.f() || !acay.k.f() || !acay.o.f()) {
            acay.b(2, acav);
        } else if (!acay.j.a(z)) {
            acay.b(7, acav);
        } else if (!acay.q.c()) {
            acay.j.g();
            acay.b(7, acav);
        } else if (acay.k.a(z)) {
            if (z) {
                acay.i = true;
                acay.g();
            }
            acay.b(0, acav);
        } else {
            acay.j.g();
            acay.q.d();
            acay.b(7, acav);
        }
    }
}
