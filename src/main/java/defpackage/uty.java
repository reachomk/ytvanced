package defpackage;

/* renamed from: uty */
public final class uty {
    public final utv a;
    public final uud b;
    public final xci c;
    private final aanz d;

    public uty(utv utv, uud uud, aanz aanz, xci xci) {
        this.a = (utv) amqw.a((Object) utv);
        this.b = (uud) amqw.a((Object) uud);
        this.d = (aanz) amqw.a((Object) aanz);
        this.c = (xci) amqw.a((Object) xci);
    }

    public final boolean a() {
        boolean z = false;
        if (this.a.a()) {
            if (this.a.c().f() == null) {
                z = true;
            } else if (this.a.c().f().equals("")) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    public final void a(afpt afpt, String str, wxg wxg) {
        this.d.a(afpt, new utz(afpt, wxg), str, 6);
    }
}
