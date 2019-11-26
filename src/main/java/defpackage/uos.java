package defpackage;

/* renamed from: uos */
final class uos implements uoq {
    private final /* synthetic */ uot a;

    public final void a(uor uor) {
        uhy.a((Object) uor);
        synchronized (this.a.b) {
            upc upc = this.a.b;
            uor uor2 = (uor) upc.a.remove(Integer.valueOf(uor.a));
            if (uor2 != uor) {
                if (uor2 != null) {
                    upc.a(uor2);
                }
            }
        }
    }

    public final ukz a() {
        return this.a.a;
    }

    /* synthetic */ uos(uot uot) {
        this.a = uot;
    }
}
