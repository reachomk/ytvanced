package defpackage;

/* renamed from: lfw */
public final class lfw implements eib, ejc {
    public final eif a;
    public final lum b;
    public lfy c;
    private final acvx d;
    private ejd e = ejd.NONE;

    public lfw(eif eif, lum lum, acvx acvx) {
        this.a = eif;
        this.b = lum;
        this.d = acvx;
        this.c = lfz.a;
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd.d() || ejd.c()) {
            this.e = ejd;
        }
        if (ejd2.d()) {
            this.d.b(acwc.MINI_PLAYER_EXPAND_BUTTON, null);
            this.d.b(acwc.MINI_PLAYER_DISMISSAL_BUTTON, null);
            if (this.e.c()) {
                this.d.a(acww.DEFAULT);
            }
        } else if (ejd2.c()) {
            this.d.b(acwc.WATCH_MINIMIZE_BUTTON, null);
            if (this.e.d()) {
                this.d.a(acww.DEFAULT, this.d.c());
            }
        }
    }

    public final void a(eja eja) {
        this.c.b(this.d);
    }
}
