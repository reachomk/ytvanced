package defpackage;

/* renamed from: lcd */
public final class lcd extends ekk implements ahoj {
    public awzv a;
    private final bdfu b = new bdfu();
    private final ajam c;
    private final lce d;
    private boolean e;

    public lcd(elm elm, ajam ajam, abka abka, xci xci, xoi xoi, acvx acvx, ahvz ahvz) {
        super(elm);
        this.c = ajam;
        this.d = new lce(abka, xci, xoi, acvx);
        this.d.M = ahvz;
        this.e = false;
    }

    public final void a(ahry ahry, ahrt ahrt) {
        this.e = true;
        d();
    }

    public final void bz_() {
        this.e = false;
    }

    public final void A_() {
        this.b.a(this.c.t().a(ajcg.a()).a(new lcc(this), lcf.a));
    }

    public final void ar_() {
        this.b.a();
    }

    public final void d() {
        if (this.e) {
            awzv awzv = this.a;
            if (awzv != null) {
                this.d.a(ajtj.a(awzv));
            }
        }
    }
}
