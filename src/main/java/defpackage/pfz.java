package defpackage;

/* renamed from: pfz */
final class pfz implements Runnable {
    private final /* synthetic */ pfb a;
    private final /* synthetic */ pfh b;

    pfz(pfh pfh, pfb pfb) {
        this.b = pfh;
        this.a = pfb;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
