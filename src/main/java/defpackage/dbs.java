package defpackage;

/* renamed from: dbs */
final class dbs implements Runnable {
    private final /* synthetic */ dbp a;

    dbs(dbp dbp) {
        this.a = dbp;
    }

    public final void run() {
        dcb dcb = this.a.a;
        if (dcb != null && dcb.b) {
            dcb.a(false);
        }
    }
}
