package defpackage;

/* renamed from: abfm */
public final class abfm extends aanf implements aana {
    public final aang a;
    public final aang b;
    public final aanl g;
    private final aang h;
    private final aanl i;
    private final abga j;

    public abfm(aamf aamf, aamn aamn, aamd aamd, afpu afpu, xhf xhf) {
        super(aamd, afpu, xhf);
        this.a = a(atez.d, aamf, abfp.a, abfo.a);
        this.b = a(atfd.d, aamf, abfr.a, abfq.a);
        this.h = a(atfh.d, aamf, abft.a, abfs.a);
        this.i = a(ajvo.class, aamn, abfv.a);
        this.g = a(ajvr.class, aamn, abfu.a);
        this.j = new abga(aamn, xhf);
    }

    public final void a(abfz abfz, afsw afsw) {
        this.h.a((aaml) abfz, afsw);
    }

    public final abfz a() {
        return new abfz(this.c, this.d.c());
    }

    public final void a(aaml aaml, afsw afsw) {
        this.i.a(aaml, afsw);
    }

    public final abfy b() {
        return new abfy(this.c, this.d.c());
    }

    public final abgb c() {
        return new abgb(this.c, this.d.c());
    }

    public final void a(aaml aaml, aand aand, afsw afsw) {
        this.j.a((abgb) aaml, aand, afsw);
    }

    public final /* synthetic */ aaml a(ajtf ajtf) {
        abgb c = c();
        c.a = aali.b(ajtf.a());
        c.g();
        return c;
    }
}
