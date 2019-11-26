package defpackage;

/* renamed from: acbo */
final /* synthetic */ class acbo implements Runnable {
    private final acay a;
    private final acat b;
    private final acav c;

    acbo(acay acay, acat acat, acav acav) {
        this.a = acay;
        this.b = acat;
        this.c = acav;
    }

    public final void run() {
        acay acay = this.a;
        acat acat = this.b;
        acav acav = this.c;
        xak.b();
        if (acay.w != 1) {
            xtl.a("MediaMuxCapturePipelineMgr", "Start capture requested when not prepared");
            acay.a(8, acav);
            return;
        }
        int i = 7;
        if (!acay.j()) {
            i = 2;
        } else if (acay.j.b() && acay.k.b()) {
            acay.q.b();
            if (!(acay.s == null || acay.x)) {
                acay.s.a(true);
            }
            i = 0;
        }
        if (i == 0) {
            acay.n = acat;
            acay.w = 2;
            acay.b(0, acav);
            return;
        }
        acay.a(i, acav);
    }
}
