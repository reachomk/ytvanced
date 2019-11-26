package defpackage;

/* renamed from: mwm */
final class mwm implements mtx {
    private final /* synthetic */ mvs a;

    public final void b(boolean z) {
        mvs mvs = this.a;
        if (mvs.d()) {
            mvs.A = mvs.K();
            mvs.n();
            if (z) {
                if (!mvs.u.isShowing()) {
                    mvs.u.show();
                }
            } else if (mvs.u.isShowing()) {
                mvs.u.dismiss();
            }
        }
    }

    public final void a(boolean z) {
        this.a.d(z);
    }

    public final void a() {
        this.a.v();
    }

    /* synthetic */ mwm(mvs mvs) {
        this.a = mvs;
    }
}
