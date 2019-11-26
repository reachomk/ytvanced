package defpackage;

/* renamed from: kyg */
public final class kyg implements Runnable {
    public boolean a = false;
    public boolean b = false;
    public float c;
    public int d;
    public final /* synthetic */ kye e;

    public final void a() {
        this.a = false;
        this.b = false;
    }

    public final void run() {
        if (this.a) {
            kye kye = this.e;
            if (kye.n == null) {
                apxu apxu = kye.m;
                if (apxu == null) {
                    apxu = kye.k;
                    acvx t = kye.c.t();
                    if (!(t == null || t.c() == null)) {
                        avjh avjh = (avjh) avjf.h.createBuilder();
                        avjh.a(t.c().a);
                        avjh.a(acwc.SWIPE_TO_CAMERA_START_ACTION.dU);
                        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
                        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
                        apxx.a();
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                }
                this.e.n = gcl.a(apxu, true, true);
                kye = this.e;
                gcl gcl = kye.n;
                gcl.ak = kye;
                if (!gcl.F_()) {
                    or a = this.e.b.a();
                    a.a(this.d, this.e.n, "creation_fragment");
                    a.a();
                }
                if (this.b) {
                    this.e.n.aj.a();
                    this.b = false;
                }
            }
            this.e.n.ai.a(this.c);
            this.a = false;
        }
    }

    /* synthetic */ kyg(kye kye) {
        this.e = kye;
    }
}
