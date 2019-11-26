package defpackage;

/* renamed from: bcnl */
final class bcnl implements Runnable {
    private final /* synthetic */ bcnw a;
    private final /* synthetic */ bcmw b;

    bcnl(bcmw bcmw, bcnw bcnw) {
        this.b = bcmw;
        this.a = bcnw;
    }

    public final void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.b.a(new bclh("Exception received from UrlRequest.Callback", th));
        }
    }
}
