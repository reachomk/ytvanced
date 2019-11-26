package defpackage;

/* renamed from: ewf */
public final class ewf {
    private ewg a;

    public final void a(ewg ewg) {
        if (this.a == null || ewg.a() >= this.a.a()) {
            ewg ewg2 = this.a;
            if (ewg == ewg2) {
                ewg2 = null;
            }
            b(ewg2);
            ewg.c();
            this.a = ewg;
        }
    }

    public final void b(ewg ewg) {
        ewg ewg2 = this.a;
        if (ewg2 != null && ewg2 == ewg) {
            ewg.d();
            this.a = null;
        }
    }
}
