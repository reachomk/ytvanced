package defpackage;

/* renamed from: jvn */
public final class jvn extends ffv implements ejc, fgs {
    private final eif c;
    private final fgc d;

    public jvn(eif eif, fgc fgc) {
        this.c = eif;
        this.d = fgc;
    }

    public final boolean a(fob fob, int i) {
        if (i != 1 || this.c.c().m()) {
            return true;
        }
        return false;
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (!ejd.g() || ejd2.m()) {
            if (!ejd.m() && ejd2.m()) {
                f();
            }
            return;
        }
        this.d.g();
    }
}
