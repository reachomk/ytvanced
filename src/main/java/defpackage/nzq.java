package defpackage;

/* renamed from: nzq */
final /* synthetic */ class nzq implements Runnable {
    private final oak a;

    nzq(oak oak) {
        this.a = oak;
    }

    public final void run() {
        try {
            nzn.b(this.a);
        } catch (nyy e) {
            oyp.b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }
}
