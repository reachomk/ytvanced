package defpackage;

/* renamed from: afrs */
public final class afrs implements afsk {
    public final amvk a;
    private final afsk b;

    public afrs(afsk afsk) {
        amvk e = amso.e();
        if (!((e instanceof amxe) || (e instanceof amsq))) {
            e = new amxe(e);
        }
        this.a = e;
        this.b = afsk;
    }

    public final void a(Object obj, wxg wxg) {
        synchronized (this.a) {
            if (this.a.a(obj)) {
                this.a.a(obj, wxg);
                return;
            }
            this.a.a(obj, wxg);
            this.b.a(obj, new afrv(this));
        }
    }
}
