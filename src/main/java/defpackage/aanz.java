package defpackage;

/* renamed from: aanz */
public final class aanz extends aanf {
    private final aaob a;
    private final boolean b;

    public aanz(aamn aamn, aamd aamd, xhf xhf, zzf zzf) {
        super(aamd, null, xhf);
        this.a = new aaob(this, aamn);
        this.b = zzf.p();
    }

    protected aanz() {
        this.a = null;
        this.b = true;
    }

    public final void a(afpt afpt, afsw afsw, String str, int i) {
        a(afpt, afsw, str, i, null);
    }

    public final void a(afpt afpt, afsw afsw, String str, int i, arzg arzg) {
        amqw.a(afpt != afpt.g);
        this.a.b(new aany(this.c, afpt, str, i, null, this.b), afsw);
    }
}
