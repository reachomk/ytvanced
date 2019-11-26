package defpackage;

/* renamed from: vhi */
final /* synthetic */ class vhi implements Runnable {
    private final vhg a;

    vhi(vhg vhg) {
        this.a = vhg;
    }

    public final void run() {
        vhg vhg = this.a;
        vhg.c.a(false);
        bcuo bcuo = vhg.j;
        if (bcuo != null) {
            bcuo.b();
        }
        ajmv e = vhg.d.e();
        if (e != null) {
            e.b(vhg.h);
        }
    }
}
