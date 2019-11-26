package defpackage;

/* renamed from: afrz */
public class afrz implements afsk {
    public final wyi a;
    private final afsk b;
    private final xsc c;

    public afrz(wyi wyi, afsk afsk, xsc xsc) {
        this.a = (wyi) amqw.a((Object) wyi);
        this.b = afsk;
        this.c = (xsc) amqw.a((Object) xsc);
    }

    /* Access modifiers changed, original: protected */
    public void a(wyi wyi) {
    }

    public final void a(Object obj, wxg wxg) {
        afmc afmc = (afmc) this.a.a(obj);
        long a = this.c.a();
        if (afmc == null || a > afmc.b) {
            afsk afsk = this.b;
            if (afsk != null) {
                afsk.a(obj, new afry(this, wxg));
                return;
            } else {
                wxg.a(obj, new afmd());
                return;
            }
        }
        wxg.a(obj, afmc.a);
        a(this.a);
    }
}
