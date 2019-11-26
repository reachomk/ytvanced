package defpackage;

/* renamed from: bbcn */
final class bbcn implements Runnable {
    private final /* synthetic */ bass a;
    private final /* synthetic */ bbcm b;

    bbcn(bbcm bbcm, bass bass) {
        this.b = bbcm;
        this.a = bass;
    }

    public final void run() {
        this.b.d.a(this.a);
    }
}
