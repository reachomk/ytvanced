package defpackage;

/* renamed from: vvr */
public final class vvr {
    public final waw a;
    public final aizy b;
    public final xci c;
    public final vrk d;
    public vvt e;
    public vrh f;
    public boolean g;
    public int h;
    public int i;
    public int j = -1;
    public int k = -1;

    public vvr(waw waw, aizy aizy, xci xci, vrk vrk) {
        this.a = (waw) amqw.a((Object) waw);
        this.b = (aizy) amqw.a((Object) aizy);
        this.c = (xci) amqw.a((Object) xci);
        this.d = (vrk) amqw.a((Object) vrk);
    }

    public static boolean a(vyg vyg) {
        return vyg.d() == 1;
    }

    public final void a(vyg vyg, int i, int i2) {
        if (vvr.a(vyg)) {
            vrh vrh = this.f;
            if (vrh != null) {
                vrh.a(i, i2);
            }
        }
    }

    public final vyg a() {
        this.f = null;
        this.h = 5000;
        this.i = -1;
        if (this.g) {
            this.c.d(new vvb());
        }
        this.c.d(new voy(3, vrh.g));
        return vyg.p().a();
    }
}
