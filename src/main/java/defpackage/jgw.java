package defpackage;

/* renamed from: jgw */
public final class jgw implements jjp {
    private final fbp a;
    private final alck b;
    private final nt c;

    public jgw(fbp fbp, alck alck, nt ntVar) {
        this.a = fbp;
        this.b = alck;
        this.c = ntVar;
    }

    public final void a() {
        this.b.b();
    }

    public final void b() {
        this.a.a(false);
        a();
        nf a = this.c.a("FilterDialogFragment");
        if (a instanceof nd) {
            ((nd) a).dismiss();
        }
    }
}
