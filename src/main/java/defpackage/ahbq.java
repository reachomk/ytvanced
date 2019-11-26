package defpackage;

/* renamed from: ahbq */
final class ahbq implements afqd {
    private final /* synthetic */ String b;
    private final /* synthetic */ avsj c;
    private final /* synthetic */ ahcq d;
    private final /* synthetic */ acvx e;
    private final /* synthetic */ ahbk f;

    ahbq(ahbk ahbk, String str, avsj avsj, ahcq ahcq, acvx acvx) {
        this.f = ahbk;
        this.b = str;
        this.c = avsj;
        this.d = ahcq;
        this.e = acvx;
    }

    public final void a() {
        this.f.b(this.b, this.c, this.d, this.e);
    }

    public final void b() {
        ahcq ahcq = this.d;
        if (ahcq != null) {
            ahcq.a(this.b, 2);
        }
        this.f.a(2, null);
    }

    public final void a(Exception exception) {
        this.f.a.c(exception);
    }
}
