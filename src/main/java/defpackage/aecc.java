package defpackage;

/* renamed from: aecc */
final class aecc extends adqq {
    private final /* synthetic */ aeca a;

    public final void I() {
        this.a.a(4);
    }

    public final void J() {
        this.a.a(0);
    }

    public final void a(adih adih) {
        aebv c = this.a.g.j().c();
        if (adih != adih.ENABLED) {
            wxi wxi = this.a.d;
            if (wxi != null) {
                wxi.a();
                this.a.d = null;
            }
            c.a(null);
        }
        aeca aeca = this.a;
        aeca.a(aeca.g.k().a(c.a(adih).a()));
        this.a.b(7);
    }

    public final void a(String str) {
        if (amqu.a(str)) {
            aeca aeca = this.a;
            aeca.a(aeca.g.k().a(this.a.g.j().c().a(null).a()));
            this.a.b(7);
            return;
        }
        aeca aeca2 = this.a;
        wxi wxi = aeca2.d;
        if (wxi != null) {
            wxi.a();
        }
        aeca2.d = wxi.a(new aebz(aeca2));
        String str2 = str;
        aeca2.e.a(str2, zzp.b, "", "", -1, aeca2.d);
    }

    /* synthetic */ aecc(aeca aeca) {
        this.a = aeca;
    }
}
