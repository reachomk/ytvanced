package defpackage;

/* renamed from: bbfn */
final class bbfn implements Runnable {
    private final /* synthetic */ bbfl a;

    public final void run() {
        bbfl bbfl = this.a;
        bbfl.b.execute(new bbfo(bbfl));
    }

    /* synthetic */ bbfn(bbfl bbfl) {
        this.a = bbfl;
    }
}
