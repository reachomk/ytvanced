package defpackage;

/* renamed from: afst */
final class afst implements wxg {
    private final wxg a;
    private final /* synthetic */ afsq b;

    public afst(afsq afsq, wxg wxg) {
        this.b = afsq;
        this.a = wxg;
    }

    public final void a(Object obj, Object obj2) {
        afsq afsq = this.b;
        afsq.a.a(afsq.a(obj), new afmc(obj2, this.b.b.a()));
        this.a.a(obj, obj2);
    }

    public final void a(Object obj, Exception exception) {
        this.a.a(obj, exception);
    }
}
