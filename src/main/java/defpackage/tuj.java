package defpackage;

/* renamed from: tuj */
final /* synthetic */ class tuj implements Runnable {
    private final tuc a;
    private final bcab b;
    private final boolean c = true;

    tuj(tuc tuc, bcab bcab) {
        this.a = tuc;
        this.b = bcab;
    }

    public final void run() {
        tuc tuc = this.a;
        bcab bcab = this.b;
        boolean z = this.c;
        uia.b();
        if (tuc.c) {
            tyv.b("BatteryMetricService", "shutdown - skipping capture", new Object[0]);
            return;
        }
        synchronized (tuc.d) {
            uao a = tuc.a(bcab, z).a();
            uao g = tuc.g();
            if (tuc.a(a)) {
                tuc.a(g, a);
            } else {
                tuc.d();
                tyv.d("BatteryMetricService", "Failure storing persistent snapshot and helper data", new Object[0]);
            }
        }
    }
}
