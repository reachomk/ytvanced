package defpackage;

/* renamed from: nyt */
final class nyt implements oyr {
    public final ozk a;
    public oal b;
    public oyr c;
    private final nyw d;

    public nyt(nyw nyw, oye oye) {
        this.d = nyw;
        this.a = new ozk(oye);
    }

    public final void a() {
        ozk ozk = this.a;
        if (ozk.b) {
            ozk.a(ozk.aQ_());
            ozk.b = false;
        }
    }

    public final long aQ_() {
        if (e()) {
            return this.c.aQ_();
        }
        return this.a.aQ_();
    }

    public final oag a(oag oag) {
        oyr oyr = this.c;
        if (oyr != null) {
            oag = oyr.a(oag);
        }
        this.a.a(oag);
        this.d.a(oag);
        return oag;
    }

    public final oag aR_() {
        oyr oyr = this.c;
        if (oyr != null) {
            return oyr.aR_();
        }
        return this.a.d;
    }

    public final void d() {
        this.a.a(this.c.aQ_());
        oag aR_ = this.c.aR_();
        if (!aR_.equals(this.a.d)) {
            this.a.a(aR_);
            this.d.a(aR_);
        }
    }

    public final boolean e() {
        oal oal = this.b;
        boolean z = false;
        if (!(oal == null || oal.v())) {
            if (this.b.u()) {
                z = true;
            } else if (this.b.g()) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }
}
