package defpackage;

/* renamed from: fhv */
final /* synthetic */ class fhv implements xao {
    private final fhu a;

    fhv(fhu fhu) {
        this.a = fhu;
    }

    public final void accept(Object obj) {
        this.a.b((Throwable) obj);
    }

    public final void accept(Throwable th) {
        this.a.b(th);
    }
}
