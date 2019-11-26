package defpackage;

/* renamed from: ibe */
final /* synthetic */ class ibe implements Runnable {
    private final ibf a;

    ibe(ibf ibf) {
        this.a = ibf;
    }

    public final void run() {
        ibf ibf = this.a;
        if (ibf.c.isRunning()) {
            ibf.c.stop();
        }
        ibf.a.sendMessageDelayed(ibf.d(), ibf.e);
        ibf.c.start();
    }
}
