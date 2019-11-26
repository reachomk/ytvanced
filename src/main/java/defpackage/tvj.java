package defpackage;

/* renamed from: tvj */
final class tvj implements Runnable {
    private final /* synthetic */ tvk a;
    private final /* synthetic */ int b;

    public final void run() {
        bcfd bcfd = (bcfd) bcfe.x.createBuilder();
        bcdz bcdz = (bcdz) bcdx.c.createBuilder();
        int i = this.b;
        bcdz.copyOnWrite();
        bcdx bcdx = (bcdx) bcdz.instance;
        if (i != 0) {
            bcdx.a |= 1;
            bcdx.b = i - 1;
            bcfd.copyOnWrite();
            bcfe bcfe = (bcfe) bcfd.instance;
            bcfe.o = (bcdx) ((anxl) bcdz.build());
            bcfe.a |= 16384;
            this.a.a((bcfe) ((anxl) bcfd.build()));
            return;
        }
        throw new NullPointerException();
    }

    tvj(tvk tvk, int i) {
        this.a = tvk;
        this.b = i;
    }
}
