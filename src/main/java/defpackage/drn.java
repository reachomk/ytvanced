package defpackage;

/* renamed from: drn */
final /* synthetic */ class drn implements xao {
    private final drl a;
    private final dro b;

    drn(drl drl, dro dro) {
        this.a = drl;
        this.b = dro;
    }

    public final void accept(Object obj) {
        this.a.a(this.b, (Throwable) obj);
    }

    public final void accept(Throwable th) {
        this.a.a(this.b, th);
    }
}
