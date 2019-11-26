package defpackage;

/* renamed from: vhj */
final /* synthetic */ class vhj implements Runnable {
    private final vhg a;

    vhj(vhg vhg) {
        this.a = vhg;
    }

    public final void run() {
        vhg vhg = this.a;
        vhg.c.a(true);
        if (vhg.j == null) {
            vhg.j = vhg.b.a(new vhl(vhg));
        }
        ajmv e = vhg.d.e();
        if (e != null) {
            e.b(vhg.h);
            e.a(vhg.h);
        }
    }
}
