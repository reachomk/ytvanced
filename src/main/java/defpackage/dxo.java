package defpackage;

/* renamed from: dxo */
final /* synthetic */ class dxo implements xao {
    private final dxm a;

    dxo(dxm dxm) {
        this.a = dxm;
    }

    public final void accept(Object obj) {
        this.a.a((Throwable) obj);
    }

    public final void accept(Throwable th) {
        this.a.a(th);
    }
}
