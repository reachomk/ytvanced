package defpackage;

/* renamed from: ainv */
final class ainv implements albc {
    private final /* synthetic */ azkm a;
    private final /* synthetic */ aink b;

    ainv(aink aink, azkm azkm) {
        this.b = aink;
        this.a = azkm;
    }

    public final /* synthetic */ void a(Object obj, int i) {
        if (i == 2) {
            aink aink = this.b;
            Runnable runnable = aink.i;
            if (runnable != null) {
                aink.h.post(runnable);
            }
        }
    }

    public final /* synthetic */ void a(Object obj) {
        aink aink = this.b;
        azkm azkm = this.a;
        aink.f.addObserver(new ainu(aink, azkm));
        aink.i = new aint(aink, azkm);
        aink.h.postDelayed(aink.i, (long) azkm.f);
        this.b.a(3, this.a);
    }
}
