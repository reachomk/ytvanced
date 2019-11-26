package defpackage;

/* renamed from: hcp */
final class hcp implements albc {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ hco b;

    hcp(hco hco, Runnable runnable) {
        this.b = hco;
        this.a = runnable;
    }

    public final /* synthetic */ void a(Object obj, int i) {
        this.a.run();
        this.b.d = null;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        albg albg = (albg) obj;
        hco hco = this.b;
        hco.b.a(hco.c.h);
        this.b.d = albg;
    }
}
