package defpackage;

/* renamed from: bbcp */
final class bbcp implements Runnable {
    private final /* synthetic */ bazv a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ bbcm c;

    bbcp(bbcm bbcm, bazv bazv, boolean z) {
        this.c = bbcm;
        this.a = bazv;
        this.b = z;
    }

    public final void run() {
        this.c.p.a(this.a, this.b);
    }
}
