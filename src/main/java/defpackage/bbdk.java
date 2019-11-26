package defpackage;

/* renamed from: bbdk */
final class bbdk implements Runnable {
    private final /* synthetic */ bbde a;

    bbdk(bbde bbde) {
        this.a = bbde;
    }

    public final void run() {
        bbde bbde = this.a;
        if (!bbde.w) {
            bbde.w = true;
            bbde.e();
        }
    }
}
