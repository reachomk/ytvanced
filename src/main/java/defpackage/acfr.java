package defpackage;

/* renamed from: acfr */
final /* synthetic */ class acfr implements xao {
    private final acfo a;
    private final acfj b;

    acfr(acfo acfo, acfj acfj) {
        this.a = acfo;
        this.b = acfj;
    }

    public final void accept(Object obj) {
        this.a.a(this.b, (Throwable) obj);
    }

    public final void accept(Throwable th) {
        this.a.a(this.b, th);
    }
}
