package defpackage;

/* renamed from: pmb */
abstract class pmb extends poj {
    public pot a;
    private final boolean h;
    private final /* synthetic */ plw i;

    pmb(plw plw, ptd ptd) {
        this(plw, ptd, false);
    }

    public abstract void a();

    pmb(plw plw, ptd ptd, boolean z) {
        this.i = plw;
        super(ptd);
        this.h = z;
        this.a = new pmt(this);
    }
}
