package defpackage;

/* renamed from: fxb */
final /* synthetic */ class fxb implements xao {
    private final xoi a;

    public fxb(xoi xoi) {
        this.a = xoi;
    }

    public final void accept(Object obj) {
        this.a.c((Throwable) obj);
    }

    public final void accept(Throwable th) {
        this.a.c(th);
    }
}
