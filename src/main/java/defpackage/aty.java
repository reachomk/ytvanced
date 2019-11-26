package defpackage;

/* renamed from: aty */
public final class aty implements atn, y {
    private final x a;
    private final atw b;
    private atn c;
    private final /* synthetic */ atv d;

    public aty(atv atv, x xVar, atw atw) {
        this.d = atv;
        this.a = xVar;
        this.b = atw;
        xVar.a(this);
    }

    public final void a(af afVar, aa aaVar) {
        if (aaVar == aa.ON_START) {
            atv atv = this.d;
            atw atw = this.b;
            atv.a.add(atw);
            atx atx = new atx(atv, atw);
            atw.a(atx);
            this.c = atx;
        } else if (aaVar == aa.ON_STOP) {
            atn atn = this.c;
            if (atn != null) {
                atn.a();
            }
        } else if (aaVar == aa.ON_DESTROY) {
            a();
        }
    }

    public final void a() {
        this.a.b(this);
        this.b.b(this);
        atn atn = this.c;
        if (atn != null) {
            atn.a();
            this.c = null;
        }
    }
}
