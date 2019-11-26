package defpackage;

/* renamed from: bbag */
final class bbag implements Runnable {
    private final /* synthetic */ bavx a;
    private final /* synthetic */ bbac b;

    bbag(bbac bbac, bavx bavx) {
        this.b = bbac;
        this.a = bavx;
    }

    public final void run() {
        this.b.f.a(this.a);
    }
}
