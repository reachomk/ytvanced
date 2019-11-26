package defpackage;

/* renamed from: hcu */
final class hcu implements albc {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ hcs b;

    hcu(hcs hcs, Runnable runnable) {
        this.b = hcs;
        this.a = runnable;
    }

    public final /* synthetic */ void a(Object obj, int i) {
        this.a.run();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        hcs hcs = this.b;
        hcs.b.a(hcs.c.h);
    }
}
