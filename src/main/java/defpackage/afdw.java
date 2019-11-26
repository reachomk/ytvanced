package defpackage;

/* renamed from: afdw */
final class afdw extends afdx {
    private final /* synthetic */ afdt a;

    afdw(afdt afdt, aeuy aeuy) {
        this.a = afdt;
        super(aeuy);
    }

    public final void c() {
        xak.a();
        super.c();
        this.a.g = false;
        this.a.b(false);
    }

    public final void i() {
        xak.a();
        if (this.a.b.isEmpty()) {
            super.a(new afif("player.fatalexception", this.a.o(), (Object) "onTransition without queued video"));
            this.a.a(false);
            return;
        }
        super.i();
        afdt afdt = this.a;
        afdt.d = (afdx) ((affw) afdt.b.remove(0)).e;
        afdt = this.a;
        afdt.a.post(new afdz(afdt));
    }

    public final void f() {
        xak.a();
        super.f();
        this.a.g = false;
        this.a.b(true);
    }

    public final void a(afif afif) {
        xak.a();
        if (afif.d()) {
            this.a.x();
        } else if (afif.a.startsWith("qoe.restart")) {
            afdt afdt = this.a;
            afdt.c.addAll(0, afdt.b);
            this.a.b.clear();
        }
        super.a(afif);
    }

    /* Access modifiers changed, original: final */
    public final void l() {
        super.i();
    }
}
