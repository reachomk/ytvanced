package defpackage;

/* renamed from: as */
final class as implements Runnable {
    private final /* synthetic */ at a;

    as(at atVar) {
        this.a = atVar;
    }

    public final void run() {
        at atVar = this.a;
        if (atVar.b == 0) {
            atVar.c = true;
            atVar.f.a(aa.ON_PAUSE);
        }
        this.a.a();
    }
}
